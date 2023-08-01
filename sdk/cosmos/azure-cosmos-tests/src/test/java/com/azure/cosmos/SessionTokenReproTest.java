package com.azure.cosmos;

import com.azure.cosmos.implementation.TestConfigurations;
import com.azure.cosmos.implementation.Utils;
import com.azure.cosmos.models.CosmosContainerProperties;
import com.azure.cosmos.models.CosmosContainerResponse;
import com.azure.cosmos.models.CosmosItemRequestOptions;
import com.azure.cosmos.models.CosmosItemResponse;
import com.azure.cosmos.models.FeedRange;
import com.azure.cosmos.models.PartitionKey;
import com.azure.cosmos.models.ThroughputResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SessionTokenReproTest {

    private final static Logger logger = LoggerFactory.getLogger(SessionTokenReproTest.class);
    private static CosmosClient testSessionTokenClient1 = null;
    private static CosmosClient testSessionTokenClient2 = null;
    private static CosmosDatabase cosmosDatabase1;
    private static CosmosContainer cosmosContainer1;
    private static CosmosDatabase cosmosDatabase2;
    private static CosmosContainer cosmosContainer2;

    public static void main(String[] args) {
        setup();
//        testSingleClientSessionToken();
        testSessionToken();
    }

    public static void setup() {
        testSessionTokenClient1 = new CosmosClientBuilder()
            .endpoint(TestConfigurations.HOST)
            .key(TestConfigurations.MASTER_KEY)
            .consistencyLevel(ConsistencyLevel.SESSION)
            .contentResponseOnWriteEnabled(true)
            .directMode()
            .preferredRegions(Collections.singletonList("West US 2"))
            .buildClient();
        cosmosDatabase1 = testSessionTokenClient1.getDatabase("testdb");
        cosmosContainer1 = cosmosDatabase1.getContainer("testcontainer");

        testSessionTokenClient2 = new CosmosClientBuilder()
            .endpoint(TestConfigurations.HOST)
            .key(TestConfigurations.MASTER_KEY)
            .consistencyLevel(ConsistencyLevel.SESSION)
            .contentResponseOnWriteEnabled(true)
            .directMode()
            .preferredRegions(Collections.singletonList("West US 2"))
            .buildClient();

        cosmosDatabase2 = testSessionTokenClient2.getDatabase("testdb");
        cosmosContainer2 = cosmosDatabase2.getContainer("testcontainer");
    }

    public static void testSingleClientSessionToken() {
        CosmosItemResponse<Item> item = cosmosContainer1.createItem(new Item(Utils.randomUUID().toString(), "1", "1"));
        String sessionToken = item.getSessionToken();
        try {
            CosmosItemResponse<Item> itemCosmosItemResponse = cosmosContainer1.readItem("1", new PartitionKey("1"), new CosmosItemRequestOptions().setSessionToken(sessionToken), Item.class);
            CosmosDiagnostics cosmosDiagnostics = itemCosmosItemResponse.getDiagnostics();
            String diagnostics = cosmosDiagnostics.toString();
            logger.error("Read Item 1 diagnostics are : {}", diagnostics);
        } catch (Exception e) {
            logger.error("Read Item 1 error are : {}", e.getMessage());
        }

        try {
            CosmosItemResponse<Item> itemCosmosItemResponse = cosmosContainer1.readItem("2", new PartitionKey("2"), new CosmosItemRequestOptions().setSessionToken(sessionToken), Item.class);
            CosmosDiagnostics cosmosDiagnostics = itemCosmosItemResponse.getDiagnostics();
            String diagnostics = cosmosDiagnostics.toString();
            logger.error("Read Item 2 diagnostics are : {}", diagnostics);
        } catch (Exception e) {
            logger.error("Read Item 2 error are ", e);
        }

        try {
            CosmosItemResponse<Item> itemCosmosItemResponse = cosmosContainer1.readItem("3", new PartitionKey("3"), new CosmosItemRequestOptions().setSessionToken(sessionToken), Item.class);
            CosmosDiagnostics cosmosDiagnostics = itemCosmosItemResponse.getDiagnostics();
            String diagnostics = cosmosDiagnostics.toString();
            logger.error("Read Item 3 diagnostics are : {}", diagnostics);
        } catch (Exception e) {
            logger.error("Read Item 3 error are ", e);
        }

        try {
            CosmosItemResponse<Item> itemCosmosItemResponse = cosmosContainer1.readItem("4", new PartitionKey("1"), new CosmosItemRequestOptions().setSessionToken(sessionToken), Item.class);
            CosmosDiagnostics cosmosDiagnostics = itemCosmosItemResponse.getDiagnostics();
            String diagnostics = cosmosDiagnostics.toString();
            logger.error("Read Item 4 diagnostics are : {}", diagnostics);
        } catch (Exception e) {
            logger.error("Read Item 4 error are ", e);
        }

        try {
            CosmosItemResponse<Item> itemCosmosItemResponse = cosmosContainer1.readItem("5", new PartitionKey("1"), new CosmosItemRequestOptions().setSessionToken(sessionToken), Item.class);
            CosmosDiagnostics cosmosDiagnostics = itemCosmosItemResponse.getDiagnostics();
            String diagnostics = cosmosDiagnostics.toString();
            logger.error("Read Item 5 diagnostics are : {}", diagnostics);
        } catch (Exception e) {
            logger.error("Read Item 5 error are ", e);
        }

        try {
            CosmosItemResponse<Item> itemCosmosItemResponse = cosmosContainer1.readItem("6", new PartitionKey("2"), new CosmosItemRequestOptions().setSessionToken(sessionToken), Item.class);
            CosmosDiagnostics cosmosDiagnostics = itemCosmosItemResponse.getDiagnostics();
            String diagnostics = cosmosDiagnostics.toString();
            logger.error("Read Item 6 with ST diagnostics are : {}", diagnostics);
        } catch (Exception e) {
            logger.error("Read Item 6 with ST error are ", e);
        }

        try {
            CosmosItemResponse<Item> itemCosmosItemResponse = cosmosContainer1.readItem("6", new PartitionKey("2"), new CosmosItemRequestOptions(), Item.class);
            CosmosDiagnostics cosmosDiagnostics = itemCosmosItemResponse.getDiagnostics();
            String diagnostics = cosmosDiagnostics.toString();
            logger.error("Read Item 6 diagnostics are : {}", diagnostics);
        } catch (Exception e) {
            logger.error("Read Item 6 error are ", e);
        }
    }

    public static void testSessionToken() {
        for (int i = 0 ; i < 10; i++) {
            String id = Utils.randomUUID().toString();
            String pk = i % 10 + "-pk";
            CosmosItemResponse<Item> item = cosmosContainer1.createItem(new Item(id, pk, "1"), new CosmosItemRequestOptions());
            String sessionToken = item.getSessionToken();
            logger.info("Session token is : {}", sessionToken);
            logger.error("Write Diagnostics are : {}", item.getDiagnostics());
            CosmosItemResponse<Item> itemCosmosItemResponse = cosmosContainer2.readItem(id, new PartitionKey(pk),
                new CosmosItemRequestOptions().setSessionToken(sessionToken),
                Item.class);
            CosmosDiagnostics cosmosDiagnostics = itemCosmosItemResponse.getDiagnostics();
            String diagnostics = cosmosDiagnostics.toString();
            logger.error("Read Diagnostics are : {}", diagnostics);
            assertThat(diagnostics).contains(String.format("\"requestSessionToken\":\"%s\"",
                sessionToken));
        }
    }

    static class Item {
        public String id;
        public String mypk;
        public String field;

        public Item(String id, String mypk, String field) {
            this.id = id;
            this.mypk = mypk;
            this.field = field;
        }

        public Item() {}

        public String getId() {
            return id;
        }

        public String getMypk() {
            return mypk;
        }

        public String getField() {
            return field;
        }
    }
}
