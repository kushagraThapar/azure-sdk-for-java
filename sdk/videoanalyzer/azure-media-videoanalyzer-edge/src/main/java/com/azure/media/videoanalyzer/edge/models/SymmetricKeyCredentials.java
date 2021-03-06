// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Symmetric key credential. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonTypeName("#Microsoft.VideoAnalyzer.SymmetricKeyCredentials")
@Fluent
public final class SymmetricKeyCredentials extends CredentialsBase {
    /*
     * Symmetric key credential.
     */
    @JsonProperty(value = "key", required = true)
    private String key;

    /**
     * Creates an instance of SymmetricKeyCredentials class.
     *
     * @param key the key value to set.
     */
    @JsonCreator
    public SymmetricKeyCredentials(@JsonProperty(value = "key", required = true) String key) {
        this.key = key;
    }

    /**
     * Get the key property: Symmetric key credential.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }
}
