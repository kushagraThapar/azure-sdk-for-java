// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Linked service for Sybase data source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Sybase")
@JsonFlatten
@Fluent
public class SybaseLinkedService extends LinkedService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SybaseLinkedService.class);

    /*
     * Server name for connection. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.server", required = true)
    private Object server;

    /*
     * Database name for connection. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.database", required = true)
    private Object database;

    /*
     * Schema name for connection. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.schema")
    private Object schema;

    /*
     * AuthenticationType to be used for connection.
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private SybaseAuthenticationType authenticationType;

    /*
     * Username for authentication. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /*
     * Password for authentication.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the server property: Server name for connection. Type: string (or Expression with resultType string).
     *
     * @return the server value.
     */
    public Object server() {
        return this.server;
    }

    /**
     * Set the server property: Server name for connection. Type: string (or Expression with resultType string).
     *
     * @param server the server value to set.
     * @return the SybaseLinkedService object itself.
     */
    public SybaseLinkedService withServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the database property: Database name for connection. Type: string (or Expression with resultType string).
     *
     * @return the database value.
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set the database property: Database name for connection. Type: string (or Expression with resultType string).
     *
     * @param database the database value to set.
     * @return the SybaseLinkedService object itself.
     */
    public SybaseLinkedService withDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get the schema property: Schema name for connection. Type: string (or Expression with resultType string).
     *
     * @return the schema value.
     */
    public Object schema() {
        return this.schema;
    }

    /**
     * Set the schema property: Schema name for connection. Type: string (or Expression with resultType string).
     *
     * @param schema the schema value to set.
     * @return the SybaseLinkedService object itself.
     */
    public SybaseLinkedService withSchema(Object schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get the authenticationType property: AuthenticationType to be used for connection.
     *
     * @return the authenticationType value.
     */
    public SybaseAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: AuthenticationType to be used for connection.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the SybaseLinkedService object itself.
     */
    public SybaseLinkedService withAuthenticationType(SybaseAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: Username for authentication. Type: string (or Expression with resultType string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: Username for authentication. Type: string (or Expression with resultType string).
     *
     * @param username the username value to set.
     * @return the SybaseLinkedService object itself.
     */
    public SybaseLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password for authentication.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password for authentication.
     *
     * @param password the password value to set.
     * @return the SybaseLinkedService object itself.
     */
    public SybaseLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SybaseLinkedService object itself.
     */
    public SybaseLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SybaseLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SybaseLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SybaseLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SybaseLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (server() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property server in model SybaseLinkedService"));
        }
        if (database() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property database in model SybaseLinkedService"));
        }
        if (password() != null) {
            password().validate();
        }
    }
}
