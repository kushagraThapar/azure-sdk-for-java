// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for named lines. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@type",
        defaultImpl = NamedLineBase.class)
@JsonTypeName("NamedLineBase")
@JsonSubTypes({@JsonSubTypes.Type(name = "#Microsoft.VideoAnalyzer.NamedLineString", value = NamedLineString.class)})
@Fluent
public class NamedLineBase {
    /*
     * Line name. Must be unique within the node.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Creates an instance of NamedLineBase class.
     *
     * @param name the name value to set.
     */
    @JsonCreator
    public NamedLineBase(@JsonProperty(value = "name", required = true) String name) {
        this.name = name;
    }

    /**
     * Get the name property: Line name. Must be unique within the node.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }
}
