// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.mixedreality.remoterendering.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ConversionStatus. */
public final class ConversionStatus extends ExpandableStringEnum<ConversionStatus> {
    /** Static value NotStarted for ConversionStatus. */
    public static final ConversionStatus NOT_STARTED = fromString("NotStarted");

    /** Static value Running for ConversionStatus. */
    public static final ConversionStatus RUNNING = fromString("Running");

    /** Static value Cancelled for ConversionStatus. */
    public static final ConversionStatus CANCELLED = fromString("Cancelled");

    /** Static value Failed for ConversionStatus. */
    public static final ConversionStatus FAILED = fromString("Failed");

    /** Static value Succeeded for ConversionStatus. */
    public static final ConversionStatus SUCCEEDED = fromString("Succeeded");

    /**
     * Creates or finds a ConversionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConversionStatus.
     */
    @JsonCreator
    public static ConversionStatus fromString(String name) {
        return fromString(name, ConversionStatus.class);
    }

    /** @return known ConversionStatus values. */
    public static Collection<ConversionStatus> values() {
        return values(ConversionStatus.class);
    }
}
