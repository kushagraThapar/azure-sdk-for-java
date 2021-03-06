/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Data Box Edge/Gateway device patch.
 */
public class DataBoxEdgeDevicePatch {
    /**
     * The tags attached to the Data Box Edge/Gateway resource.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the tags attached to the Data Box Edge/Gateway resource.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags attached to the Data Box Edge/Gateway resource.
     *
     * @param tags the tags value to set
     * @return the DataBoxEdgeDevicePatch object itself.
     */
    public DataBoxEdgeDevicePatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
