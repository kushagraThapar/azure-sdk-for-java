/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import com.microsoft.azure.management.synapse.v2020_12_01.OperationStatus;
import com.microsoft.azure.management.synapse.v2020_12_01.ErrorDetail;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An operation.
 */
public class OperationResourceInner {
    /**
     * Operation ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Operation name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Operation status. Possible values include: 'InProgress', 'Succeeded',
     * 'Failed', 'Canceled'.
     */
    @JsonProperty(value = "status")
    private OperationStatus status;

    /**
     * Operation properties.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /**
     * Errors from the operation.
     */
    @JsonProperty(value = "error")
    private ErrorDetail error;

    /**
     * Operation start time.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * Operation start time.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * Completion percentage of the operation.
     */
    @JsonProperty(value = "percentComplete")
    private Double percentComplete;

    /**
     * Get operation ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set operation ID.
     *
     * @param id the id value to set
     * @return the OperationResourceInner object itself.
     */
    public OperationResourceInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get operation name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set operation name.
     *
     * @param name the name value to set
     * @return the OperationResourceInner object itself.
     */
    public OperationResourceInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get operation status. Possible values include: 'InProgress', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @return the status value
     */
    public OperationStatus status() {
        return this.status;
    }

    /**
     * Set operation status. Possible values include: 'InProgress', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @param status the status value to set
     * @return the OperationResourceInner object itself.
     */
    public OperationResourceInner withStatus(OperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get operation properties.
     *
     * @return the properties value
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set operation properties.
     *
     * @param properties the properties value to set
     * @return the OperationResourceInner object itself.
     */
    public OperationResourceInner withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get errors from the operation.
     *
     * @return the error value
     */
    public ErrorDetail error() {
        return this.error;
    }

    /**
     * Set errors from the operation.
     *
     * @param error the error value to set
     * @return the OperationResourceInner object itself.
     */
    public OperationResourceInner withError(ErrorDetail error) {
        this.error = error;
        return this;
    }

    /**
     * Get operation start time.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set operation start time.
     *
     * @param startTime the startTime value to set
     * @return the OperationResourceInner object itself.
     */
    public OperationResourceInner withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get operation start time.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set operation start time.
     *
     * @param endTime the endTime value to set
     * @return the OperationResourceInner object itself.
     */
    public OperationResourceInner withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get completion percentage of the operation.
     *
     * @return the percentComplete value
     */
    public Double percentComplete() {
        return this.percentComplete;
    }

    /**
     * Set completion percentage of the operation.
     *
     * @param percentComplete the percentComplete value to set
     * @return the OperationResourceInner object itself.
     */
    public OperationResourceInner withPercentComplete(Double percentComplete) {
        this.percentComplete = percentComplete;
        return this;
    }

}
