// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver.models;

import com.azure.communication.common.PhoneNumberIdentifier;
import com.azure.core.annotation.Fluent;

/**
 * The options for creating a call.
 */
@Fluent
public final class CreateCallOptions {

    /**
     * The alternate caller id of the source.
     */
    private PhoneNumberIdentifier alternateCallerId;

    /**
     * The subject.
     */
    private String subject;

    /**
     * The callback URI.
     */
    private final String callbackUri;

    /**
     * The requested media types.
     */
    private final CallModality[] requestedMediaTypes;

    /**
     * The requested call events to subscribe to.
     */
    private final EventSubscriptionType[] requestedCallEvents;

    /**
     * Get the alternate caller id of the source.
     *
     * @return the alternate caller id object itself.
     */
    public PhoneNumberIdentifier getAlternateCallerId() {
        return alternateCallerId;
    }

    /**
     * Set the alternate caller id of the source to be used when target is phone number.
     *
     * @param alternateCallerId the alternate caller id value to set.
     * @return the CreateCallOptions object itself.
     */
    public CreateCallOptions setAlternateCallerId(PhoneNumberIdentifier alternateCallerId) {
        this.alternateCallerId = alternateCallerId;
        return this;
    }

    /**
     * Get the subject.
     *
     * @return the subject value.
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Set the subject.
     *
     * @param subject the subject.
     * @return the CreateCallOptions object itself.
     */
    public CreateCallOptions setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get the subject.
     *
     * @return the subject value.
     */
    public String getCallbackUri() {
        return callbackUri;
    }

    /**
     * Get the requested modalities.
     *
     * @return the requested modalities object itself.
     */
    public CallModality[] getRequestedMediaTypes() {
        return this.requestedMediaTypes == null ? new CallModality[0] : this.requestedMediaTypes.clone();
    }

    /**
     * Get the requested call events to subscribe to.
     *
     * @return the requested call events to subscribe to object itself.
     */
    public EventSubscriptionType[] getRequestedCallEvents() {
        return requestedCallEvents.clone();
    }

    /**
     * Initializes a new instance of CreateCallOptions.
     *
     * @param callbackUri the callback URI.
     * @param requestedMediaTypes the requested media types.
     * @param requestedCallEvents the requested call events to subscribe to.
     * @throws IllegalArgumentException if any parameters are null.
     */
    public CreateCallOptions(
        String callbackUri,
        CallModality[] requestedMediaTypes,
        EventSubscriptionType[] requestedCallEvents) {
        if (callbackUri == null) {
            throw new IllegalArgumentException("object callbackUri cannot be null");
        }

        if (requestedMediaTypes == null) {
            throw new IllegalArgumentException("object requestedMediaTypes cannot be null");
        }
        if (requestedCallEvents == null) {
            throw new IllegalArgumentException("object requestedCallEvents cannot be null");
        }

        this.callbackUri = callbackUri;

        this.requestedMediaTypes = requestedMediaTypes.clone();
        this.requestedCallEvents = requestedCallEvents.clone();
    }
}
