/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_07_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Routing message.
 */
public class RoutingMessage {
    /**
     * Body of routing message.
     */
    @JsonProperty(value = "body")
    private String body;

    /**
     * App properties.
     */
    @JsonProperty(value = "appProperties")
    private Map<String, String> appProperties;

    /**
     * System properties.
     */
    @JsonProperty(value = "systemProperties")
    private Map<String, String> systemProperties;

    /**
     * Get body of routing message.
     *
     * @return the body value
     */
    public String body() {
        return this.body;
    }

    /**
     * Set body of routing message.
     *
     * @param body the body value to set
     * @return the RoutingMessage object itself.
     */
    public RoutingMessage withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get app properties.
     *
     * @return the appProperties value
     */
    public Map<String, String> appProperties() {
        return this.appProperties;
    }

    /**
     * Set app properties.
     *
     * @param appProperties the appProperties value to set
     * @return the RoutingMessage object itself.
     */
    public RoutingMessage withAppProperties(Map<String, String> appProperties) {
        this.appProperties = appProperties;
        return this;
    }

    /**
     * Get system properties.
     *
     * @return the systemProperties value
     */
    public Map<String, String> systemProperties() {
        return this.systemProperties;
    }

    /**
     * Set system properties.
     *
     * @param systemProperties the systemProperties value to set
     * @return the RoutingMessage object itself.
     */
    public RoutingMessage withSystemProperties(Map<String, String> systemProperties) {
        this.systemProperties = systemProperties;
        return this;
    }

}
