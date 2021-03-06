// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Update for service health event. */
@Fluent
public final class Update {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Update.class);

    /*
     * Summary text for the given update for the service health event.
     */
    @JsonProperty(value = "summary")
    private String summary;

    /*
     * It provides the Timestamp for the given update for the service health
     * event.
     */
    @JsonProperty(value = "updateDateTime")
    private OffsetDateTime updateDateTime;

    /**
     * Get the summary property: Summary text for the given update for the service health event.
     *
     * @return the summary value.
     */
    public String summary() {
        return this.summary;
    }

    /**
     * Set the summary property: Summary text for the given update for the service health event.
     *
     * @param summary the summary value to set.
     * @return the Update object itself.
     */
    public Update withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get the updateDateTime property: It provides the Timestamp for the given update for the service health event.
     *
     * @return the updateDateTime value.
     */
    public OffsetDateTime updateDateTime() {
        return this.updateDateTime;
    }

    /**
     * Set the updateDateTime property: It provides the Timestamp for the given update for the service health event.
     *
     * @param updateDateTime the updateDateTime value to set.
     * @return the Update object itself.
     */
    public Update withUpdateDateTime(OffsetDateTime updateDateTime) {
        this.updateDateTime = updateDateTime;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
