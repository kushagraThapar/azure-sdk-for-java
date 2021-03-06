// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.frontdoor.models.NetworkExperimentResourceState;
import com.azure.resourcemanager.frontdoor.models.State;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Defines an Network Experiment Profile and lists of Experiments. */
@JsonFlatten
@Fluent
public class ProfileInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProfileInner.class);

    /*
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Resource status.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private NetworkExperimentResourceState resourceState;

    /*
     * The state of the Experiment
     */
    @JsonProperty(value = "properties.enabledState")
    private State enabledState;

    /**
     * Get the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the resourceState property: Resource status.
     *
     * @return the resourceState value.
     */
    public NetworkExperimentResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the enabledState property: The state of the Experiment.
     *
     * @return the enabledState value.
     */
    public State enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: The state of the Experiment.
     *
     * @param enabledState the enabledState value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withEnabledState(State enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProfileInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProfileInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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
