// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.communication.callingserver.models.CallModality;
import com.azure.communication.callingserver.models.EventSubscriptionType;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The request payload for create call. */
@Fluent
public final class CreateCallRequest {
    /*
     * The alternate identity of the source of the call if dialing out to a
     * pstn number
     */
    @JsonProperty(value = "alternateCallerId")
    private PhoneNumberIdentifierModel alternateCallerId;

    /*
     * The targets of the call.
     */
    @JsonProperty(value = "targets", required = true)
    private List<CommunicationIdentifierModel> targets;

    /*
     * The source of the call.
     */
    @JsonProperty(value = "source", required = true)
    private CommunicationIdentifierModel source;

    /*
     * The subject.
     */
    @JsonProperty(value = "subject")
    private String subject;

    /*
     * The callback URI.
     */
    @JsonProperty(value = "callbackUri", required = true)
    private String callbackUri;

    /*
     * The requested modalities.
     */
    @JsonProperty(value = "requestedMediaTypes")
    private List<CallModality> requestedMediaTypes;

    /*
     * The requested call events to subscribe to.
     */
    @JsonProperty(value = "requestedCallEvents")
    private List<EventSubscriptionType> requestedCallEvents;

    /**
     * Get the alternateCallerId property: The alternate identity of the source of the call if dialing out to a pstn
     * number.
     *
     * @return the alternateCallerId value.
     */
    public PhoneNumberIdentifierModel getAlternateCallerId() {
        return this.alternateCallerId;
    }

    /**
     * Set the alternateCallerId property: The alternate identity of the source of the call if dialing out to a pstn
     * number.
     *
     * @param alternateCallerId the alternateCallerId value to set.
     * @return the CreateCallRequest object itself.
     */
    public CreateCallRequest setAlternateCallerId(PhoneNumberIdentifierModel alternateCallerId) {
        this.alternateCallerId = alternateCallerId;
        return this;
    }

    /**
     * Get the targets property: The targets of the call.
     *
     * @return the targets value.
     */
    public List<CommunicationIdentifierModel> getTargets() {
        return this.targets;
    }

    /**
     * Set the targets property: The targets of the call.
     *
     * @param targets the targets value to set.
     * @return the CreateCallRequest object itself.
     */
    public CreateCallRequest setTargets(List<CommunicationIdentifierModel> targets) {
        this.targets = targets;
        return this;
    }

    /**
     * Get the source property: The source of the call.
     *
     * @return the source value.
     */
    public CommunicationIdentifierModel getSource() {
        return this.source;
    }

    /**
     * Set the source property: The source of the call.
     *
     * @param source the source value to set.
     * @return the CreateCallRequest object itself.
     */
    public CreateCallRequest setSource(CommunicationIdentifierModel source) {
        this.source = source;
        return this;
    }

    /**
     * Get the subject property: The subject.
     *
     * @return the subject value.
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * Set the subject property: The subject.
     *
     * @param subject the subject value to set.
     * @return the CreateCallRequest object itself.
     */
    public CreateCallRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get the callbackUri property: The callback URI.
     *
     * @return the callbackUri value.
     */
    public String getCallbackUri() {
        return this.callbackUri;
    }

    /**
     * Set the callbackUri property: The callback URI.
     *
     * @param callbackUri the callbackUri value to set.
     * @return the CreateCallRequest object itself.
     */
    public CreateCallRequest setCallbackUri(String callbackUri) {
        this.callbackUri = callbackUri;
        return this;
    }

    /**
     * Get the requestedMediaTypes property: The requested modalities.
     *
     * @return the requestedMediaTypes value.
     */
    public List<CallModality> getRequestedMediaTypes() {
        return this.requestedMediaTypes;
    }

    /**
     * Set the requestedMediaTypes property: The requested modalities.
     *
     * @param requestedMediaTypes the requestedMediaTypes value to set.
     * @return the CreateCallRequest object itself.
     */
    public CreateCallRequest setRequestedMediaTypes(List<CallModality> requestedMediaTypes) {
        this.requestedMediaTypes = requestedMediaTypes;
        return this;
    }

    /**
     * Get the requestedCallEvents property: The requested call events to subscribe to.
     *
     * @return the requestedCallEvents value.
     */
    public List<EventSubscriptionType> getRequestedCallEvents() {
        return this.requestedCallEvents;
    }

    /**
     * Set the requestedCallEvents property: The requested call events to subscribe to.
     *
     * @param requestedCallEvents the requestedCallEvents value to set.
     * @return the CreateCallRequest object itself.
     */
    public CreateCallRequest setRequestedCallEvents(List<EventSubscriptionType> requestedCallEvents) {
        this.requestedCallEvents = requestedCallEvents;
        return this;
    }
}
