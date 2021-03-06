// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines metadata for table to be migrated. */
@Fluent
public final class NonSqlDataMigrationTable {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NonSqlDataMigrationTable.class);

    /*
     * Source table name
     */
    @JsonProperty(value = "sourceName")
    private String sourceName;

    /**
     * Get the sourceName property: Source table name.
     *
     * @return the sourceName value.
     */
    public String sourceName() {
        return this.sourceName;
    }

    /**
     * Set the sourceName property: Source table name.
     *
     * @param sourceName the sourceName value to set.
     * @return the NonSqlDataMigrationTable object itself.
     */
    public NonSqlDataMigrationTable withSourceName(String sourceName) {
        this.sourceName = sourceName;
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
