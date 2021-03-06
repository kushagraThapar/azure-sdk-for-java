// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Appservice Github token request content. */
@Fluent
public final class AppserviceGithubTokenRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppserviceGithubTokenRequest.class);

    /*
     * Code string to exchange for Github Access token
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * State string used for verification.
     */
    @JsonProperty(value = "state", required = true)
    private String state;

    /**
     * Get the code property: Code string to exchange for Github Access token.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: Code string to exchange for Github Access token.
     *
     * @param code the code value to set.
     * @return the AppserviceGithubTokenRequest object itself.
     */
    public AppserviceGithubTokenRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the state property: State string used for verification.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: State string used for verification.
     *
     * @param state the state value to set.
     * @return the AppserviceGithubTokenRequest object itself.
     */
    public AppserviceGithubTokenRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (code() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property code in model AppserviceGithubTokenRequest"));
        }
        if (state() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property state in model AppserviceGithubTokenRequest"));
        }
    }
}
