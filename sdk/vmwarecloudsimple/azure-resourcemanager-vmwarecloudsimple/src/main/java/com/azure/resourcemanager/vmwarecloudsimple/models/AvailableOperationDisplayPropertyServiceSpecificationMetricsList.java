// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of available operation display property service specification metrics. */
@Fluent
public final class AvailableOperationDisplayPropertyServiceSpecificationMetricsList {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(AvailableOperationDisplayPropertyServiceSpecificationMetricsList.class);

    /*
     * Metric specifications of operation
     */
    @JsonProperty(value = "metricSpecifications")
    private List<AvailableOperationDisplayPropertyServiceSpecificationMetricsItem> metricSpecifications;

    /**
     * Get the metricSpecifications property: Metric specifications of operation.
     *
     * @return the metricSpecifications value.
     */
    public List<AvailableOperationDisplayPropertyServiceSpecificationMetricsItem> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set the metricSpecifications property: Metric specifications of operation.
     *
     * @param metricSpecifications the metricSpecifications value to set.
     * @return the AvailableOperationDisplayPropertyServiceSpecificationMetricsList object itself.
     */
    public AvailableOperationDisplayPropertyServiceSpecificationMetricsList withMetricSpecifications(
        List<AvailableOperationDisplayPropertyServiceSpecificationMetricsItem> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metricSpecifications() != null) {
            metricSpecifications().forEach(e -> e.validate());
        }
    }
}
