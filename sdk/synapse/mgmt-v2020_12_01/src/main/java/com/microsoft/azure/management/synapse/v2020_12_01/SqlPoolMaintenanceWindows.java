/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import rx.Observable;
import rx.Completable;

/**
 * Type representing SqlPoolMaintenanceWindows.
 */
public interface SqlPoolMaintenanceWindows {
    /**
     * Get a SQL pool's Maintenance Windows.
     * Get a SQL pool's Maintenance Windows.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param maintenanceWindowName Maintenance window name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MaintenanceWindows> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String maintenanceWindowName);

    /**
     * Creates or updates a Sql pool's maintenance windows settings.
     * Creates or updates a Sql pool's maintenance windows settings.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param maintenanceWindowName Maintenance window name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable createOrUpdateAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String maintenanceWindowName);

}
