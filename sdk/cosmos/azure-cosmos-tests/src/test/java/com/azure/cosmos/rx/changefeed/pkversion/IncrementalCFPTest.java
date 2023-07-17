package com.azure.cosmos.rx.changefeed.pkversion;

import com.azure.cosmos.ChangeFeedProcessor;
import com.azure.cosmos.ChangeFeedProcessorBuilder;
import com.azure.cosmos.CosmosAsyncClient;
import com.azure.cosmos.CosmosAsyncContainer;
import com.azure.cosmos.CosmosAsyncDatabase;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.cosmos.implementation.TestConfigurations;
import com.azure.cosmos.models.ChangeFeedProcessorOptions;
import com.azure.cosmos.models.CosmosItemRequestOptions;
import com.azure.cosmos.models.PartitionKey;
import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import reactor.core.publisher.Hooks;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class IncrementalCFPTest {

    private static final Logger logger = LoggerFactory.getLogger(IncrementalCFPTest.class);
    private CosmosAsyncClient cosmosAsyncClient;
    private CosmosAsyncDatabase cosmosAsyncDatabase;
    private CosmosAsyncContainer cosmosAsyncFeedContainer;
    private CosmosAsyncContainer cosmosAsyncLeaseContainer;
    public final Scheduler COSMOS_PARALLEL = Schedulers.newParallel(
        "cosmos-parallel",
        Schedulers.DEFAULT_POOL_SIZE,
        true);


    @Test
    public void testCFP() throws InterruptedException {

        Schedulers.onHandleError((thread, throwable) -> {
            logger.info("Error occurred in thread : {}", thread, throwable);
            //  Take appropriate action here on Errors which are not recoverable
            if (throwable instanceof Error) {
                logger.info("It is a java.lang.Error caught in Schedulers Hook, can't do much");
                System.exit(99);
            }
        });

        Hooks.onNextError((throwable, o) -> {
            if (throwable instanceof Error) {
                logger.info("It is a java.lang.Error caught in onNextError, can't do much");
                System.exit(99);
            }
            return throwable;
        });
        setup();
        //        ingestData();
//        readData();
        ChangeFeedProcessorBuilder changeFeedProcessorBuilder = new ChangeFeedProcessorBuilder();
        ChangeFeedProcessor changeFeedProcessor = changeFeedProcessorBuilder.hostName("testHost")
                                                                            .feedContainer(cosmosAsyncFeedContainer)
                                                                            .leaseContainer(cosmosAsyncLeaseContainer)
                                                                            .options(new ChangeFeedProcessorOptions()
                                                                                .setStartFromBeginning(true)
                                                                                .setMaxItemCount(10))
                                                                            .handleChanges(new Consumer<List<JsonNode>>() {
                                                                                @Override
                                                                                public void accept(List<JsonNode> jsonNodes) {
                                                                                    logger.info("Received {} changes", jsonNodes.size());
                                                                                }
                                                                            }).buildChangeFeedProcessor();
        changeFeedProcessor.start().subscribe();
        Thread.sleep(1200 * 1000);
    }

    public void setup() {
        cosmosAsyncClient = new CosmosClientBuilder()
            .endpoint(TestConfigurations.HOST)
            .key(TestConfigurations.MASTER_KEY)
            .gatewayMode()
            .contentResponseOnWriteEnabled(true)
            .buildAsyncClient();

        cosmosAsyncClient.createDatabaseIfNotExists("testdb").block();
        cosmosAsyncDatabase = cosmosAsyncClient.getDatabase("testdb");
        cosmosAsyncDatabase.createContainerIfNotExists("testfeedcontainer", "/pk").block();
        cosmosAsyncDatabase.createContainerIfNotExists("testleasecontainer", "/id").block();
        cosmosAsyncFeedContainer = cosmosAsyncDatabase.getContainer("testfeedcontainer");
        cosmosAsyncLeaseContainer = cosmosAsyncDatabase.getContainer("testleasecontainer");
    }

    public void ingestData() throws InterruptedException {
        for (int i = 0; i < 50000; i++) {
            COSMOS_PARALLEL.schedule(getItemRunnable(i % 10));
            Thread.sleep(10);
        }
    }

    public void readData() {
        cosmosAsyncFeedContainer.queryItems("SELECT * FROM c", Item.class)
                                .byPage(10)
                                .flatMap(cosmosItemPropertiesFeedResponse -> {
                                    logger.info("Received {} items", cosmosItemPropertiesFeedResponse.getResults().size());
                                    return Mono.empty();
                                }).blockLast();
    }

    public Runnable getItemRunnable(int pkId) {
        return new Runnable() {
            @Override
            public void run() {
                String id = UUID.randomUUID().toString();
                String pk = "pk-" + pkId;
                String field = UUID.randomUUID().toString();
                cosmosAsyncFeedContainer.createItem(new Item(id, pk, field),
                    new PartitionKey(pk),
                    new CosmosItemRequestOptions())
                    .onErrorResume(throwable -> {
                        logger.error("Error occurred while creating item");
                        return Mono.empty();
                    }).subscribe();
            }
        };
    }

    static class Item {
        String id;
        String pk;
        String field;

        public Item() {}

        public Item(String id, String pk, String field) {
            this.id = id;
            this.pk = pk;
            this.field = field;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPk() {
            return pk;
        }

        public void setPk(String pk) {
            this.pk = pk;
        }

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }
    }
}
