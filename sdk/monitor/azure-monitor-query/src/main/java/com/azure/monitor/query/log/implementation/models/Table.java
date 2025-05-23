// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.log.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Contains the columns and rows for one table in a query response. */
@Fluent
public final class Table {
    /*
     * The name of the table.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The list of columns in this table.
     */
    @JsonProperty(value = "columns", required = true)
    private List<Column> columns;

    /*
     * The resulting rows from this query.
     */
    @JsonProperty(value = "rows", required = true)
    private List<List<String>> rows;

    /**
     * Creates an instance of Table class.
     *
     * @param name the name value to set.
     * @param columns the columns value to set.
     * @param rows the rows value to set.
     */
    @JsonCreator
    public Table(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "columns", required = true) List<Column> columns,
            @JsonProperty(value = "rows", required = true) List<List<String>> rows) {
        this.name = name;
        this.columns = columns;
        this.rows = rows;
    }

    /**
     * Get the name property: The name of the table.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the columns property: The list of columns in this table.
     *
     * @return the columns value.
     */
    public List<Column> getColumns() {
        return this.columns;
    }

    /**
     * Get the rows property: The resulting rows from this query.
     *
     * @return the rows value.
     */
    public List<List<String>> getRows() {
        return this.rows;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getName() == null) {
            throw new IllegalArgumentException("Missing required property name in model Table");
        }
        if (getColumns() == null) {
            throw new IllegalArgumentException("Missing required property columns in model Table");
        } else {
            getColumns().forEach(e -> e.validate());
        }
        if (getRows() == null) {
            throw new IllegalArgumentException("Missing required property rows in model Table");
        }
    }
}
