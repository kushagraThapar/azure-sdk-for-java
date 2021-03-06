/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Check name availability request.
 * A request about whether a workspace name is available.
 */
public class CheckNameAvailabilityRequest {
    /**
     * Workspace name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Type: workspace.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get workspace name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set workspace name.
     *
     * @param name the name value to set
     * @return the CheckNameAvailabilityRequest object itself.
     */
    public CheckNameAvailabilityRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get type: workspace.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set type: workspace.
     *
     * @param type the type value to set
     * @return the CheckNameAvailabilityRequest object itself.
     */
    public CheckNameAvailabilityRequest withType(String type) {
        this.type = type;
        return this;
    }

}
