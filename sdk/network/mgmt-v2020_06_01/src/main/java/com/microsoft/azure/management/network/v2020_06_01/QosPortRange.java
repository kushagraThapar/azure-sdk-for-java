/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Qos Traffic Profiler Port range properties.
 */
public class QosPortRange {
    /**
     * Qos Port Range start.
     */
    @JsonProperty(value = "start")
    private Integer start;

    /**
     * Qos Port Range end.
     */
    @JsonProperty(value = "end")
    private Integer end;

    /**
     * Get qos Port Range start.
     *
     * @return the start value
     */
    public Integer start() {
        return this.start;
    }

    /**
     * Set qos Port Range start.
     *
     * @param start the start value to set
     * @return the QosPortRange object itself.
     */
    public QosPortRange withStart(Integer start) {
        this.start = start;
        return this;
    }

    /**
     * Get qos Port Range end.
     *
     * @return the end value
     */
    public Integer end() {
        return this.end;
    }

    /**
     * Set qos Port Range end.
     *
     * @param end the end value to set
     * @return the QosPortRange object itself.
     */
    public QosPortRange withEnd(Integer end) {
        this.end = end;
        return this;
    }

}
