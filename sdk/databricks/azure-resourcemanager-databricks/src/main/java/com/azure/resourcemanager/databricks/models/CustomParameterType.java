// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CustomParameterType. */
public final class CustomParameterType extends ExpandableStringEnum<CustomParameterType> {
    /** Static value Bool for CustomParameterType. */
    public static final CustomParameterType BOOL = fromString("Bool");

    /** Static value Object for CustomParameterType. */
    public static final CustomParameterType OBJECT = fromString("Object");

    /** Static value String for CustomParameterType. */
    public static final CustomParameterType STRING = fromString("String");

    /**
     * Creates or finds a CustomParameterType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CustomParameterType.
     */
    @JsonCreator
    public static CustomParameterType fromString(String name) {
        return fromString(name, CustomParameterType.class);
    }

    /** @return known CustomParameterType values. */
    public static Collection<CustomParameterType> values() {
        return values(CustomParameterType.class);
    }
}
