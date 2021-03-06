/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Capacity pool patch resource.
 */
@JsonFlatten
public class CapacityPoolPatch extends Resource {
    /**
     * size.
     * Provisioned size of the pool (in bytes). Allowed values are in 4TiB
     * chunks (value must be multiply of 4398046511104).
     */
    @JsonProperty(value = "properties.size")
    private Long size;

    /**
     * qosType.
     * The qos type of the pool. Possible values include: 'Auto', 'Manual'.
     */
    @JsonProperty(value = "properties.qosType")
    private QosType qosType;

    /**
     * Get provisioned size of the pool (in bytes). Allowed values are in 4TiB chunks (value must be multiply of 4398046511104).
     *
     * @return the size value
     */
    public Long size() {
        return this.size;
    }

    /**
     * Set provisioned size of the pool (in bytes). Allowed values are in 4TiB chunks (value must be multiply of 4398046511104).
     *
     * @param size the size value to set
     * @return the CapacityPoolPatch object itself.
     */
    public CapacityPoolPatch withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get the qos type of the pool. Possible values include: 'Auto', 'Manual'.
     *
     * @return the qosType value
     */
    public QosType qosType() {
        return this.qosType;
    }

    /**
     * Set the qos type of the pool. Possible values include: 'Auto', 'Manual'.
     *
     * @param qosType the qosType value to set
     * @return the CapacityPoolPatch object itself.
     */
    public CapacityPoolPatch withQosType(QosType qosType) {
        this.qosType = qosType;
        return this;
    }

}
