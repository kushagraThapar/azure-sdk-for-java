// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The subscribe to tone event. */
@Fluent
public final class ToneReceivedEventInternal {
    /*
     * The tone info.
     */
    @JsonProperty(value = "toneInfo")
    private ToneInfoInternal toneInfo;

    /*
     * The call connection id.
     */
    @JsonProperty(value = "callConnectionId")
    private String callConnectionId;

    /**
     * Get the toneInfo property: The tone info.
     *
     * @return the toneInfo value.
     */
    public ToneInfoInternal getToneInfo() {
        return this.toneInfo;
    }

    /**
     * Set the toneInfo property: The tone info.
     *
     * @param toneInfo the toneInfo value to set.
     * @return the ToneReceivedEventInternal object itself.
     */
    public ToneReceivedEventInternal setToneInfo(ToneInfoInternal toneInfo) {
        this.toneInfo = toneInfo;
        return this;
    }

    /**
     * Get the callConnectionId property: The call connection id.
     *
     * @return the callConnectionId value.
     */
    public String getCallConnectionId() {
        return this.callConnectionId;
    }

    /**
     * Set the callConnectionId property: The call connection id.
     *
     * @param callConnectionId the callConnectionId value to set.
     * @return the ToneReceivedEventInternal object itself.
     */
    public ToneReceivedEventInternal setCallConnectionId(String callConnectionId) {
        this.callConnectionId = callConnectionId;
        return this;
    }
}
