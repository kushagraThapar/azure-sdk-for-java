// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.sms.implementation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;

/** A builder for creating a new instance of the AzureCommunicationSMSService type. */
@ServiceClientBuilder(serviceClients = {AzureCommunicationSMSServiceImpl.class})
public final class AzureCommunicationSMSServiceImplBuilder {
    /*
     * The communication resource, for example
     * https://my-resource.communication.azure.com
     */
    private String endpoint;

    /**
     * Sets The communication resource, for example https://my-resource.communication.azure.com.
     *
     * @param endpoint the endpoint value.
     * @return the AzureCommunicationSMSServiceImplBuilder.
     */
    public AzureCommunicationSMSServiceImplBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the AzureCommunicationSMSServiceImplBuilder.
     */
    public AzureCommunicationSMSServiceImplBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of AzureCommunicationSMSServiceImpl with the provided parameters.
     *
     * @return an instance of AzureCommunicationSMSServiceImpl.
     */
    public AzureCommunicationSMSServiceImpl buildClient() {
        if (pipeline == null) {
            this.pipeline =
                    new HttpPipelineBuilder()
                            .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                            .build();
        }
        AzureCommunicationSMSServiceImpl client = new AzureCommunicationSMSServiceImpl(pipeline, endpoint);
        return client;
    }
}
