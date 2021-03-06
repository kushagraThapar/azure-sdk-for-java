/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_05_01.implementation.VirtualHubRouteTableV2Inner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_05_01.implementation.NetworkManager;
import java.util.List;

/**
 * Type representing VirtualHubRouteTableV2.
 */
public interface VirtualHubRouteTableV2 extends HasInner<VirtualHubRouteTableV2Inner>, Indexable, Refreshable<VirtualHubRouteTableV2>, Updatable<VirtualHubRouteTableV2.Update>, HasManager<NetworkManager> {
    /**
     * @return the attachedConnections value.
     */
    List<String> attachedConnections();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the routes value.
     */
    List<VirtualHubRouteV2> routes();

    /**
     * The entirety of the VirtualHubRouteTableV2 definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVirtualHub, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualHubRouteTableV2 definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualHubRouteTableV2 definition.
         */
        interface Blank extends WithVirtualHub {
        }

        /**
         * The stage of the virtualhubroutetablev2 definition allowing to specify VirtualHub.
         */
        interface WithVirtualHub {
           /**
            * Specifies resourceGroupName, virtualHubName.
            * @param resourceGroupName The resource group name of the VirtualHub
            * @param virtualHubName The name of the VirtualHub
            * @return the next definition stage
            */
            WithCreate withExistingVirtualHub(String resourceGroupName, String virtualHubName);
        }

        /**
         * The stage of the virtualhubroutetablev2 definition allowing to specify AttachedConnections.
         */
        interface WithAttachedConnections {
            /**
             * Specifies attachedConnections.
             * @param attachedConnections List of all connections attached to this route table v2
             * @return the next definition stage
             */
            WithCreate withAttachedConnections(List<String> attachedConnections);
        }

        /**
         * The stage of the virtualhubroutetablev2 definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next definition stage
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the virtualhubroutetablev2 definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the virtualhubroutetablev2 definition allowing to specify Routes.
         */
        interface WithRoutes {
            /**
             * Specifies routes.
             * @param routes List of all routes
             * @return the next definition stage
             */
            WithCreate withRoutes(List<VirtualHubRouteV2> routes);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualHubRouteTableV2>, DefinitionStages.WithAttachedConnections, DefinitionStages.WithId, DefinitionStages.WithName, DefinitionStages.WithRoutes {
        }
    }
    /**
     * The template for a VirtualHubRouteTableV2 update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualHubRouteTableV2>, UpdateStages.WithAttachedConnections, UpdateStages.WithId, UpdateStages.WithName, UpdateStages.WithRoutes {
    }

    /**
     * Grouping of VirtualHubRouteTableV2 update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualhubroutetablev2 update allowing to specify AttachedConnections.
         */
        interface WithAttachedConnections {
            /**
             * Specifies attachedConnections.
             * @param attachedConnections List of all connections attached to this route table v2
             * @return the next update stage
             */
            Update withAttachedConnections(List<String> attachedConnections);
        }

        /**
         * The stage of the virtualhubroutetablev2 update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next update stage
             */
            Update withId(String id);
        }

        /**
         * The stage of the virtualhubroutetablev2 update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next update stage
             */
            Update withName(String name);
        }

        /**
         * The stage of the virtualhubroutetablev2 update allowing to specify Routes.
         */
        interface WithRoutes {
            /**
             * Specifies routes.
             * @param routes List of all routes
             * @return the next update stage
             */
            Update withRoutes(List<VirtualHubRouteV2> routes);
        }

    }
}
