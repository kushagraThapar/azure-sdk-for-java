// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Confirmation. */
public final class Confirmation extends ExpandableStringEnum<Confirmation> {
    /** Static value signup for Confirmation. */
    public static final Confirmation SIGNUP = fromString("signup");

    /** Static value invite for Confirmation. */
    public static final Confirmation INVITE = fromString("invite");

    /**
     * Creates or finds a Confirmation from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Confirmation.
     */
    @JsonCreator
    public static Confirmation fromString(String name) {
        return fromString(name, Confirmation.class);
    }

    /** @return known Confirmation values. */
    public static Collection<Confirmation> values() {
        return values(Confirmation.class);
    }
}
