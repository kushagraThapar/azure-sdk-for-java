// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.data.cosmos.internal.http;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.handler.timeout.IdleStateHandler;
import org.reactivestreams.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.netty.ByteBufFlux;
import reactor.netty.Connection;
import reactor.netty.NettyOutbound;
import reactor.netty.http.client.HttpClientRequest;
import reactor.netty.http.client.HttpClientResponse;
import reactor.netty.resources.ConnectionProvider;
import reactor.netty.tcp.ProxyProvider;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.function.BiFunction;

import static com.azure.data.cosmos.internal.http.HttpClientConfig.REACTOR_NETWORK_LOG_CATEGORY;

/**
 * HttpClient that is implemented using reactor-netty.
 */
class ReactorNettyClient implements HttpClient {

    private static final Logger logger = LoggerFactory.getLogger(ReactorNettyClient.class.getSimpleName());

    private HttpClientConfig httpClientConfig;
    private reactor.netty.http.client.HttpClient httpClient;
    private ConnectionProvider connectionProvider;

    private ReactorNettyClient() {}

    /**
     * Creates ReactorNettyClient with un-pooled connection.
     */
    public static ReactorNettyClient create(HttpClientConfig httpClientConfig) {
        ReactorNettyClient reactorNettyClient = new ReactorNettyClient();
        reactorNettyClient.httpClientConfig = httpClientConfig;
        reactorNettyClient.httpClient = reactor.netty.http.client.HttpClient.newConnection();
        reactorNettyClient.configureChannelPipelineHandlers();
        return reactorNettyClient;
    }

    /**
     * Creates ReactorNettyClient with {@link ConnectionProvider}.
     */
    public static ReactorNettyClient createWithConnectionProvider(ConnectionProvider connectionProvider, HttpClientConfig httpClientConfig) {
        ReactorNettyClient reactorNettyClient = new ReactorNettyClient();
        reactorNettyClient.connectionProvider = connectionProvider;
        reactorNettyClient.httpClientConfig = httpClientConfig;
        reactorNettyClient.httpClient = reactor.netty.http.client.HttpClient.create(connectionProvider);
        reactorNettyClient.configureChannelPipelineHandlers();
        return reactorNettyClient;
    }

    private void configureChannelPipelineHandlers() {
        this.httpClient = this.httpClient.tcpConfiguration(tcpClient -> {
            if (this.httpClientConfig.getProxy() != null) {
                tcpClient =
                    tcpClient.proxy(typeSpec -> typeSpec.type(ProxyProvider.Proxy.HTTP).address(this.httpClientConfig.getProxy()));
            }
            tcpClient =
                tcpClient.secure(sslContextSpec -> sslContextSpec.sslContext(this.httpClientConfig.getConfigs().getSslContext()));
            if (LoggerFactory.getLogger(REACTOR_NETWORK_LOG_CATEGORY).isTraceEnabled()) {
                tcpClient = tcpClient.wiretap(REACTOR_NETWORK_LOG_CATEGORY, LogLevel.INFO);
            }
            //  By default, keep alive is enabled on http client
            tcpClient = tcpClient.option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 30 * 1000);

            tcpClient = tcpClient.doOnConnected(connection -> {

                final ChannelPipeline pipeline = connection.channel().pipeline();

                if (pipeline.context("httpObjectAggregator") == null) {
                    pipeline.addLast("httpObjectAggregator", new HttpObjectAggregator(this.httpClientConfig
                        .getConfigs().getMaxHttpBodyLength()));
                }

                if (this.httpClientConfig.getMaxIdleConnectionTimeoutInMillis() != null) {
                    //  Note: This is an open issue and will be supported in Project Reactor v3.3.0
                    //  https://github.com/reactor/reactor-netty/releases/tag/v0.9.0.M3

                    //  Note: This is an alternative approach suggested on this issue:
                    //  https://github.com/reactor/reactor-netty/issues/612
                    int maxIdleConnectionTimeoutInSeconds =
                        this.httpClientConfig.getMaxIdleConnectionTimeoutInMillis() / 1000;

                    int timeoutInSeconds = 0;
                    if (this.httpClientConfig.getRequestTimeoutInMillis() != null) {
                        timeoutInSeconds = this.httpClientConfig.getRequestTimeoutInMillis() / 1000;
                    }

                    if (pipeline.context("idleStateHandler") == null) {
                        pipeline.addLast("idleStateHandler", new IdleStateHandler(timeoutInSeconds, timeoutInSeconds,
                            maxIdleConnectionTimeoutInSeconds));
                    }

                    if (pipeline.context("idleCleanupHandler") == null) {
                        pipeline.addLast("idleCleanupHandler", new IdleCleanupHandler());
                    }
                }
            });
            return tcpClient;
        });
    }

    @Override
    public Mono<HttpResponse> send(final HttpRequest request) {
        Objects.requireNonNull(request.httpMethod());
        Objects.requireNonNull(request.uri());
        Objects.requireNonNull(this.httpClientConfig);

        return this.httpClient
                .keepAlive(this.httpClientConfig.isConnectionKeepAlive())
                .port(request.port())
                .request(HttpMethod.valueOf(request.httpMethod().toString()))
                .uri(request.uri().toString())
                .send(bodySendDelegate(request))
                .responseConnection(responseDelegate(request))
                .single();
    }

    /**
     * Delegate to send the request content.
     *
     * @param restRequest the Rest request contains the body to be sent
     * @return a delegate upon invocation sets the request body in reactor-netty outbound object
     */
    private static BiFunction<HttpClientRequest, NettyOutbound, Publisher<Void>> bodySendDelegate(final HttpRequest restRequest) {
        return (reactorNettyRequest, reactorNettyOutbound) -> {
            for (HttpHeader header : restRequest.headers()) {
                reactorNettyRequest.header(header.name(), header.value());
            }
            if (restRequest.body() != null) {
                Flux<ByteBuf> nettyByteBufFlux = restRequest.body().map(Unpooled::wrappedBuffer);
                return reactorNettyOutbound.send(nettyByteBufFlux);
            } else {
                return reactorNettyOutbound;
            }
        };
    }

    /**
     * Delegate to receive response.
     *
     * @param restRequest the Rest request whose response this delegate handles
     * @return a delegate upon invocation setup Rest response object
     */
    private static BiFunction<HttpClientResponse, Connection, Publisher<HttpResponse>> responseDelegate(final HttpRequest restRequest) {
        return (reactorNettyResponse, reactorNettyConnection) ->
                Mono.just(new ReactorNettyHttpResponse(reactorNettyResponse, reactorNettyConnection).withRequest(restRequest));
    }

    @Override
    public void shutdown() {
        if (this.connectionProvider != null) {
            this.connectionProvider.dispose();
        }
    }

    private static class ReactorNettyHttpResponse extends HttpResponse {
        private final HttpClientResponse reactorNettyResponse;
        private final Connection reactorNettyConnection;

        ReactorNettyHttpResponse(HttpClientResponse reactorNettyResponse, Connection reactorNettyConnection) {
            this.reactorNettyResponse = reactorNettyResponse;
            this.reactorNettyConnection = reactorNettyConnection;
        }

        @Override
        public int statusCode() {
            return reactorNettyResponse.status().code();
        }

        @Override
        public String headerValue(String name) {
            return reactorNettyResponse.responseHeaders().get(name);
        }

        @Override
        public HttpHeaders headers() {
            HttpHeaders headers = new HttpHeaders(reactorNettyResponse.responseHeaders().size());
            reactorNettyResponse.responseHeaders().forEach(e -> headers.set(e.getKey(), e.getValue()));
            return headers;
        }

        @Override
        public Flux<ByteBuf> body() {
            return bodyIntern().doFinally(s -> this.close());
        }

        @Override
        public Flux<InputStream> bodyAsInputStream() {
            return bodyIntern().asInputStream().doFinally(s -> this.close());
        }

        @Override
        public Mono<byte[]> bodyAsByteArray() {
            return bodyIntern().aggregate().asByteArray().doFinally(s -> this.close());
        }

        @Override
        public Mono<String> bodyAsString() {
            return bodyIntern().aggregate().asString().doFinally(s -> this.close());
        }

        @Override
        public Mono<String> bodyAsString(Charset charset) {
            return bodyIntern().aggregate().asString(charset).doFinally(s -> this.close());
        }

        @Override
        public void close() {
            if (reactorNettyConnection.channel().eventLoop().inEventLoop()) {
                logger.info("Is Persistent {}", reactorNettyConnection.isPersistent());
                reactorNettyConnection.dispose();
            } else {
                reactorNettyConnection.channel().eventLoop().execute(reactorNettyConnection::dispose);
            }
        }

        private ByteBufFlux bodyIntern() {
            return reactorNettyConnection.inbound().receive();
        }

        @Override
        Connection internConnection() {
            return reactorNettyConnection;
        }
    }

    static class IdleCleanupHandler extends ChannelDuplexHandler {

        @Override
        public void userEventTriggered(final ChannelHandlerContext ctx, final Object evt) throws Exception {
            if (evt instanceof IdleStateEvent) {
                final IdleState state = ((IdleStateEvent) evt).state();
                if (state == IdleState.ALL_IDLE
                    || state == IdleState.READER_IDLE
                    || state == IdleState.WRITER_IDLE) {
                    // close idle channel
                    ctx.flush().close();
                }
            } else {
                super.userEventTriggered(ctx, evt);
            }
        }
    }
}
