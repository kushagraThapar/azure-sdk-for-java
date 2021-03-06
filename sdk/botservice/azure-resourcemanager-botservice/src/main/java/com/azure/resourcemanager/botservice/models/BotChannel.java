// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.botservice.fluent.models.BotChannelInner;
import java.util.Map;

/** An immutable client-side representation of BotChannel. */
public interface BotChannel {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the properties property: The set of properties specific to bot channel resource.
     *
     * @return the properties value.
     */
    Channel properties();

    /**
     * Gets the sku property: Gets or sets the SKU of the resource.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the kind property: Required. Gets or sets the Kind of the resource.
     *
     * @return the kind value.
     */
    Kind kind();

    /**
     * Gets the etag property: Entity Tag.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.botservice.fluent.models.BotChannelInner object.
     *
     * @return the inner object.
     */
    BotChannelInner innerModel();

    /** The entirety of the BotChannel definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The BotChannel definition stages. */
    interface DefinitionStages {
        /** The first stage of the BotChannel definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the BotChannel definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the BotChannel definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, resourceName.
             *
             * @param resourceGroupName The name of the Bot resource group in the user subscription.
             * @param resourceName The name of the Bot resource.
             * @return the next definition stage.
             */
            WithCreate withExistingBotService(String resourceGroupName, String resourceName);
        }
        /**
         * The stage of the BotChannel definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithProperties,
                DefinitionStages.WithSku,
                DefinitionStages.WithKind,
                DefinitionStages.WithEtag {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            BotChannel create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            BotChannel create(Context context);
        }
        /** The stage of the BotChannel definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the BotChannel definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The set of properties specific to bot channel resource.
             *
             * @param properties The set of properties specific to bot channel resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(Channel properties);
        }
        /** The stage of the BotChannel definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Gets or sets the SKU of the resource..
             *
             * @param sku Gets or sets the SKU of the resource.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /** The stage of the BotChannel definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Required. Gets or sets the Kind of the resource..
             *
             * @param kind Required. Gets or sets the Kind of the resource.
             * @return the next definition stage.
             */
            WithCreate withKind(Kind kind);
        }
        /** The stage of the BotChannel definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: Entity Tag.
             *
             * @param etag Entity Tag.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
    }
    /**
     * Begins update for the BotChannel resource.
     *
     * @return the stage of resource update.
     */
    BotChannel.Update update();

    /** The template for BotChannel update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithProperties,
            UpdateStages.WithSku,
            UpdateStages.WithKind,
            UpdateStages.WithEtag {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        BotChannel apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        BotChannel apply(Context context);
    }
    /** The BotChannel update stages. */
    interface UpdateStages {
        /** The stage of the BotChannel update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the BotChannel update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The set of properties specific to bot channel resource.
             *
             * @param properties The set of properties specific to bot channel resource.
             * @return the next definition stage.
             */
            Update withProperties(Channel properties);
        }
        /** The stage of the BotChannel update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Gets or sets the SKU of the resource..
             *
             * @param sku Gets or sets the SKU of the resource.
             * @return the next definition stage.
             */
            Update withSku(Sku sku);
        }
        /** The stage of the BotChannel update allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Required. Gets or sets the Kind of the resource..
             *
             * @param kind Required. Gets or sets the Kind of the resource.
             * @return the next definition stage.
             */
            Update withKind(Kind kind);
        }
        /** The stage of the BotChannel update allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: Entity Tag.
             *
             * @param etag Entity Tag.
             * @return the next definition stage.
             */
            Update withEtag(String etag);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    BotChannel refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    BotChannel refresh(Context context);

    /**
     * Lists a Channel registration for a Bot Service including secrets.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bot channel resource definition.
     */
    BotChannel listWithKeys();

    /**
     * Lists a Channel registration for a Bot Service including secrets.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bot channel resource definition.
     */
    Response<BotChannel> listWithKeysWithResponse(Context context);
}
