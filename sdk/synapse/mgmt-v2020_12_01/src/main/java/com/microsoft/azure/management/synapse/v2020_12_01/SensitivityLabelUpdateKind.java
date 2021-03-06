/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SensitivityLabelUpdateKind.
 */
public enum SensitivityLabelUpdateKind {
    /** Enum value set. */
    SET("set"),

    /** Enum value remove. */
    REMOVE("remove");

    /** The actual serialized value for a SensitivityLabelUpdateKind instance. */
    private String value;

    SensitivityLabelUpdateKind(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SensitivityLabelUpdateKind instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SensitivityLabelUpdateKind object, or null if unable to parse.
     */
    @JsonCreator
    public static SensitivityLabelUpdateKind fromString(String value) {
        SensitivityLabelUpdateKind[] items = SensitivityLabelUpdateKind.values();
        for (SensitivityLabelUpdateKind item : items) {
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
