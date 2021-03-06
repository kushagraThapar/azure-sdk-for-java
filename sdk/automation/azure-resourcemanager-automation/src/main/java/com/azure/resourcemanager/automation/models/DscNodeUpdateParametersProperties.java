// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DscNodeUpdateParametersProperties model. */
@JsonFlatten
@Fluent
public class DscNodeUpdateParametersProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DscNodeUpdateParametersProperties.class);

    /*
     * Gets or sets the name of the dsc node configuration.
     */
    @JsonProperty(value = "nodeConfiguration.name")
    private String name;

    /**
     * Get the name property: Gets or sets the name of the dsc node configuration.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the name of the dsc node configuration.
     *
     * @param name the name value to set.
     * @return the DscNodeUpdateParametersProperties object itself.
     */
    public DscNodeUpdateParametersProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
