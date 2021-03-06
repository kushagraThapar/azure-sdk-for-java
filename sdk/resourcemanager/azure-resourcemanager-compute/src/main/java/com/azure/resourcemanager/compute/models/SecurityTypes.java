// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for SecurityTypes. */
public enum SecurityTypes {
    /** Enum value TrustedLaunch. */
    TRUSTED_LAUNCH("TrustedLaunch");

    /** The actual serialized value for a SecurityTypes instance. */
    private final String value;

    SecurityTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SecurityTypes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SecurityTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static SecurityTypes fromString(String value) {
        SecurityTypes[] items = SecurityTypes.values();
        for (SecurityTypes item : items) {
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
