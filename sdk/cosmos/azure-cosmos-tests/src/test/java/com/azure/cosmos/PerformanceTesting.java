package com.azure.cosmos;

import com.azure.cosmos.implementation.TestConfigurations;
import com.azure.cosmos.models.CosmosQueryRequestOptions;
import com.azure.cosmos.models.PartitionKey;
import com.azure.cosmos.util.CosmosPagedIterable;
import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class PerformanceTesting {

    private static final Logger logger = LoggerFactory.getLogger(PerformanceTesting.class);
    private CosmosClient cosmosClient;
    private CosmosDatabase cosmosDatabase;
    private CosmosContainer cosmosContainer;
    private static final Map<String, String> idPkMap = new HashMap<>();
    private static final List<Long> readLatencyList = new ArrayList<>();
    private static final List<Long> upsertLatencyList = new ArrayList<>();
    private static final AtomicInteger counter = new AtomicInteger(0);
    private static final AtomicInteger upsertCounter = new AtomicInteger(0);
    private static final AtomicInteger readCounter = new AtomicInteger(0);
    public final ExecutorService executorService = Executors.newFixedThreadPool(100);

    @Test
    public void performanceTestingSyncClient() throws InterruptedException {
        setup();
        readAndUpsertItems();
        while (executorService.awaitTermination(60, TimeUnit.MINUTES)) {
            logger.info("Waiting for all threads to finish");
        }
        readLatencyList.sort(Long::compareTo);
        logger.info("Total read operations: {}", readCounter.get());
        logger.info("Average read is : {}", getAverage(readLatencyList));
        logger.info("P99 read is : {}", getP99Latency(readLatencyList));
        logger.info("P95 read is : {}", getP95Latency(readLatencyList));

        upsertLatencyList.sort(Long::compareTo);
        logger.info("Total upsert operations: {}", upsertCounter.get());
        logger.info("Average upsert is : {}", getAverage(upsertLatencyList));
        logger.info("P99 upsert is : {}", getP99Latency(upsertLatencyList));
        logger.info("P95 upsert is : {}", getP95Latency(upsertLatencyList));
    }

    public void readAndUpsertItems() {
        String query = "SELECT c.id, c.pk FROM c";
        CosmosPagedIterable<JsonNode> jsonNodes = cosmosContainer.queryItems(query, new CosmosQueryRequestOptions(),
            JsonNode.class);
        jsonNodes.iterableByPage().forEach(cosmosItemPropertiesFeedResponse -> cosmosItemPropertiesFeedResponse.getResults().forEach(jsonNode -> {
            String id = jsonNode.get("id").asText();
            String pk = jsonNode.get("pk").asText();
            if (counter.incrementAndGet() % 3 == 0) {
                executorService.submit(getUpsertItemRunnable(id, pk));
                upsertCounter.incrementAndGet();
            } else {
                executorService.submit(getReadItemRunnable(id, pk));
                readCounter.incrementAndGet();
            }
            idPkMap.put(id, pk);
        }));
        logger.info("Id map size is : {}", idPkMap.size());
    }

    public double getAverage(List<Long> latencyList) {
        AtomicLong sum = new AtomicLong(0);
        latencyList.forEach(sum::addAndGet);
        return (double) (sum.get() / latencyList.size());
    }

    public long getP99Latency(List<Long> latencyList) {
        int index = (int) Math.ceil(0.99 * latencyList.size());
        return latencyList.get(index - 1);
    }

    public long getP95Latency(List<Long> latencyList) {
        int index = (int) Math.ceil(0.95 * latencyList.size());
        return latencyList.get(index - 1);
    }

    public void setup() {
        cosmosClient = new CosmosClientBuilder()
            .endpoint(TestConfigurations.HOST)
            .key(TestConfigurations.MASTER_KEY)
            .directMode()
            .contentResponseOnWriteEnabled(true)
            .buildClient();

        cosmosDatabase = cosmosClient.getDatabase("testdb");
        cosmosContainer = cosmosDatabase.getContainer("testfeedcontainer");
    }

    public void queryItemIds() {
        String query = "SELECT c.id, c.pk FROM c";
        CosmosPagedIterable<JsonNode> jsonNodes = cosmosContainer.queryItems(query, new CosmosQueryRequestOptions(),
            JsonNode.class);
        jsonNodes.iterableByPage().forEach(cosmosItemPropertiesFeedResponse -> {
            cosmosItemPropertiesFeedResponse.getResults().forEach(jsonNode -> {
                String id = jsonNode.get("id").asText();
                String pk = jsonNode.get("pk").asText();
                idPkMap.put(id, pk);
            });
        });
        logger.info("Id map size is : {}", idPkMap.size());
    }

    public void readItem(String id, String pk) {
        long startTime = System.currentTimeMillis();
        cosmosContainer.readItem(id, new PartitionKey(pk), Item.class);
        readLatencyList.add(System.currentTimeMillis() - startTime);
    }

    public void upsertItem(String id, String pk) {
        long startTime = System.currentTimeMillis();
        cosmosContainer.upsertItem(new Item(id, pk, "field-" + id));
        upsertLatencyList.add(System.currentTimeMillis() - startTime);
    }

    public Runnable getReadItemRunnable(String id, String pk) {
        return () -> readItem(id, pk);
    }

    public Runnable getUpsertItemRunnable(String id, String pk) {
        return () -> upsertItem(id, pk);
    }

    static class Item {
        String id;
        String pk;
        String field;

        public Item() {
        }

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
