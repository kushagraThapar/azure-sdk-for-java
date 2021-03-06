// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of BackupCrrJobDetails. */
public interface BackupCrrJobDetails {
    /**
     * Get CRR job details from target region.
     *
     * @param azureRegion Azure region to hit Api.
     * @param parameters CRR Job request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cRR job details from target region.
     */
    JobResource get(String azureRegion, CrrJobRequest parameters);

    /**
     * Get CRR job details from target region.
     *
     * @param azureRegion Azure region to hit Api.
     * @param parameters CRR Job request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cRR job details from target region.
     */
    Response<JobResource> getWithResponse(String azureRegion, CrrJobRequest parameters, Context context);
}
