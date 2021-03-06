/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.subscription.v2019_10_01_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of the request to list operations. It contains a list of operations
 * and a URL link to get the next set of results.
 */
public class OperationListResultInner {
    /**
     * List of operations.
     */
    @JsonProperty(value = "value")
    private List<OperationInner> value;

    /**
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get list of operations.
     *
     * @return the value value
     */
    public List<OperationInner> value() {
        return this.value;
    }

    /**
     * Set list of operations.
     *
     * @param value the value value to set
     * @return the OperationListResultInner object itself.
     */
    public OperationListResultInner withValue(List<OperationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get uRL to get the next set of operation list results if there are any.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set uRL to get the next set of operation list results if there are any.
     *
     * @param nextLink the nextLink value to set
     * @return the OperationListResultInner object itself.
     */
    public OperationListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}
