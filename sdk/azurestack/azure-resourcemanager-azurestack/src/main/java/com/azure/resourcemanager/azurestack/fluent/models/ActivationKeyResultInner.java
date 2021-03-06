// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The resource containing the Azure Stack activation key. */
@Fluent
public final class ActivationKeyResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ActivationKeyResultInner.class);

    /*
     * Azure Stack activation key.
     */
    @JsonProperty(value = "activationKey")
    private String activationKey;

    /**
     * Get the activationKey property: Azure Stack activation key.
     *
     * @return the activationKey value.
     */
    public String activationKey() {
        return this.activationKey;
    }

    /**
     * Set the activationKey property: Azure Stack activation key.
     *
     * @param activationKey the activationKey value to set.
     * @return the ActivationKeyResultInner object itself.
     */
    public ActivationKeyResultInner withActivationKey(String activationKey) {
        this.activationKey = activationKey;
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
