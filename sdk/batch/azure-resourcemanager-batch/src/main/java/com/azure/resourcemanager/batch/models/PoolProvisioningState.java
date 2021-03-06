// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for PoolProvisioningState. */
public enum PoolProvisioningState {
    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded"),

    /** Enum value Deleting. */
    DELETING("Deleting");

    /** The actual serialized value for a PoolProvisioningState instance. */
    private final String value;

    PoolProvisioningState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PoolProvisioningState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PoolProvisioningState object, or null if unable to parse.
     */
    @JsonCreator
    public static PoolProvisioningState fromString(String value) {
        PoolProvisioningState[] items = PoolProvisioningState.values();
        for (PoolProvisioningState item : items) {
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
