/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LoadBalancerConfigurationProperties model.
 */
public class LoadBalancerConfigurationProperties {
    /**
     * List of IP.
     */
    @JsonProperty(value = "frontendIPConfigurations")
    private List<LoadBalancerFrontendIPConfiguration> frontendIPConfigurations;

    /**
     * Get list of IP.
     *
     * @return the frontendIPConfigurations value
     */
    public List<LoadBalancerFrontendIPConfiguration> frontendIPConfigurations() {
        return this.frontendIPConfigurations;
    }

    /**
     * Set list of IP.
     *
     * @param frontendIPConfigurations the frontendIPConfigurations value to set
     * @return the LoadBalancerConfigurationProperties object itself.
     */
    public LoadBalancerConfigurationProperties withFrontendIPConfigurations(List<LoadBalancerFrontendIPConfiguration> frontendIPConfigurations) {
        this.frontendIPConfigurations = frontendIPConfigurations;
        return this;
    }

}
