// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for NestedResourceProvisioningState. */
public enum NestedResourceProvisioningState {
    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded"),

    /** Enum value Canceled. */
    CANCELED("Canceled"),

    /** Enum value Failed. */
    FAILED("Failed");

    /** The actual serialized value for a NestedResourceProvisioningState instance. */
    private final String value;

    NestedResourceProvisioningState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a NestedResourceProvisioningState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed NestedResourceProvisioningState object, or null if unable to parse.
     */
    @JsonCreator
    public static NestedResourceProvisioningState fromString(String value) {
        NestedResourceProvisioningState[] items = NestedResourceProvisioningState.values();
        for (NestedResourceProvisioningState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
