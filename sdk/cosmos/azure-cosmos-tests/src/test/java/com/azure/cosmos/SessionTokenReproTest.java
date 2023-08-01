package com.azure.cosmos;

import com.azure.cosmos.implementation.TestConfigurations;
import com.azure.cosmos.implementation.Utils;
import com.azure.cosmos.models.CosmosItemRequestOptions;
import com.azure.cosmos.models.CosmosItemResponse;
import com.azure.cosmos.models.PartitionKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;

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

    public static void testSessionToken() {
        for (int i = 0 ; i < 10000; i++) {
            String id = Utils.randomUUID().toString();
            String pk = i % 100 + "-pk";
            CosmosItemResponse<Item> item = cosmosContainer1.createItem(new Item(id, pk, "1"), new CosmosItemRequestOptions());
            String sessionToken = item.getSessionToken();
            logger.info("Session token is : {}", sessionToken);
            //logger.error("Write Diagnostics are : {}", item.getDiagnostics());
            CosmosItemResponse<Item> itemCosmosItemResponse = cosmosContainer2.readItem(id, new PartitionKey(pk),
                new CosmosItemRequestOptions().setSessionToken(sessionToken),
                Item.class);
            CosmosDiagnostics cosmosDiagnostics = itemCosmosItemResponse.getDiagnostics();
            String diagnostics = cosmosDiagnostics.toString();
            //logger.error("Read Diagnostics are : {}", diagnostics);
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
