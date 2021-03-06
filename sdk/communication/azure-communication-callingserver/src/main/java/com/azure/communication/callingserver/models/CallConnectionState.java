// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CallConnectionState. */
public final class CallConnectionState extends ExpandableStringEnum<CallConnectionState> {
    /** Static value unknown for CallConnectionState. */
    public static final CallConnectionState UNKNOWN = fromString("unknown");

    /** Static value idle for CallConnectionState. */
    public static final CallConnectionState IDLE = fromString("idle");

    /** Static value incoming for CallConnectionState. */
    public static final CallConnectionState INCOMING = fromString("incoming");

    /** Static value establishing for CallConnectionState. */
    public static final CallConnectionState ESTABLISHING = fromString("establishing");

    /** Static value established for CallConnectionState. */
    public static final CallConnectionState ESTABLISHED = fromString("established");

    /** Static value hold for CallConnectionState. */
    public static final CallConnectionState HOLD = fromString("hold");

    /** Static value unhold for CallConnectionState. */
    public static final CallConnectionState UNHOLD = fromString("unhold");

    /** Static value transferring for CallConnectionState. */
    public static final CallConnectionState TRANSFERRING = fromString("transferring");

    /** Static value redirecting for CallConnectionState. */
    public static final CallConnectionState REDIRECTING = fromString("redirecting");

    /** Static value terminating for CallConnectionState. */
    public static final CallConnectionState TERMINATING = fromString("terminating");

    /** Static value terminated for CallConnectionState. */
    public static final CallConnectionState TERMINATED = fromString("terminated");

    /**
     * Creates or finds a CallConnectionState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CallConnectionState.
     */
    @JsonCreator
    public static CallConnectionState fromString(String name) {
        return fromString(name, CallConnectionState.class);
    }

    /** @return known CallConnectionState values. */
    public static Collection<CallConnectionState> values() {
        return values(CallConnectionState.class);
    }
}
