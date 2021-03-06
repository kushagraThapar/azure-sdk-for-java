// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Results for schema comparison between the source and target. */
@Fluent
public final class SchemaComparisonValidationResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SchemaComparisonValidationResult.class);

    /*
     * List of schema differences between the source and target databases
     */
    @JsonProperty(value = "schemaDifferences", access = JsonProperty.Access.WRITE_ONLY)
    private SchemaComparisonValidationResultType schemaDifferences;

    /*
     * List of errors that happened while performing schema compare validation
     */
    @JsonProperty(value = "validationErrors", access = JsonProperty.Access.WRITE_ONLY)
    private ValidationError validationErrors;

    /*
     * Count of source database objects
     */
    @JsonProperty(value = "sourceDatabaseObjectCount")
    private Map<String, Long> sourceDatabaseObjectCount;

    /*
     * Count of target database objects
     */
    @JsonProperty(value = "targetDatabaseObjectCount")
    private Map<String, Long> targetDatabaseObjectCount;

    /**
     * Get the schemaDifferences property: List of schema differences between the source and target databases.
     *
     * @return the schemaDifferences value.
     */
    public SchemaComparisonValidationResultType schemaDifferences() {
        return this.schemaDifferences;
    }

    /**
     * Get the validationErrors property: List of errors that happened while performing schema compare validation.
     *
     * @return the validationErrors value.
     */
    public ValidationError validationErrors() {
        return this.validationErrors;
    }

    /**
     * Get the sourceDatabaseObjectCount property: Count of source database objects.
     *
     * @return the sourceDatabaseObjectCount value.
     */
    public Map<String, Long> sourceDatabaseObjectCount() {
        return this.sourceDatabaseObjectCount;
    }

    /**
     * Set the sourceDatabaseObjectCount property: Count of source database objects.
     *
     * @param sourceDatabaseObjectCount the sourceDatabaseObjectCount value to set.
     * @return the SchemaComparisonValidationResult object itself.
     */
    public SchemaComparisonValidationResult withSourceDatabaseObjectCount(Map<String, Long> sourceDatabaseObjectCount) {
        this.sourceDatabaseObjectCount = sourceDatabaseObjectCount;
        return this;
    }

    /**
     * Get the targetDatabaseObjectCount property: Count of target database objects.
     *
     * @return the targetDatabaseObjectCount value.
     */
    public Map<String, Long> targetDatabaseObjectCount() {
        return this.targetDatabaseObjectCount;
    }

    /**
     * Set the targetDatabaseObjectCount property: Count of target database objects.
     *
     * @param targetDatabaseObjectCount the targetDatabaseObjectCount value to set.
     * @return the SchemaComparisonValidationResult object itself.
     */
    public SchemaComparisonValidationResult withTargetDatabaseObjectCount(Map<String, Long> targetDatabaseObjectCount) {
        this.targetDatabaseObjectCount = targetDatabaseObjectCount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (schemaDifferences() != null) {
            schemaDifferences().validate();
        }
        if (validationErrors() != null) {
            validationErrors().validate();
        }
    }
}
