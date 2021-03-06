// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WindowsOsState. */
public final class WindowsOsState extends ExpandableStringEnum<WindowsOsState> {
    /** Static value NonSysprepped for WindowsOsState. */
    public static final WindowsOsState NON_SYSPREPPED = fromString("NonSysprepped");

    /** Static value SysprepRequested for WindowsOsState. */
    public static final WindowsOsState SYSPREP_REQUESTED = fromString("SysprepRequested");

    /** Static value SysprepApplied for WindowsOsState. */
    public static final WindowsOsState SYSPREP_APPLIED = fromString("SysprepApplied");

    /**
     * Creates or finds a WindowsOsState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WindowsOsState.
     */
    @JsonCreator
    public static WindowsOsState fromString(String name) {
        return fromString(name, WindowsOsState.class);
    }

    /** @return known WindowsOsState values. */
    public static Collection<WindowsOsState> values() {
        return values(WindowsOsState.class);
    }
}
