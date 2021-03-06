// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Apple model. */
@JsonFlatten
@Fluent
public class Apple extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Apple.class);

    /*
     * The enabled property.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /*
     * The registration property.
     */
    @JsonProperty(value = "properties.registration")
    private AppleRegistration registration;

    /*
     * The login property.
     */
    @JsonProperty(value = "properties.login")
    private LoginScopes login;

    /**
     * Get the enabled property: The enabled property.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: The enabled property.
     *
     * @param enabled the enabled value to set.
     * @return the Apple object itself.
     */
    public Apple withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the registration property: The registration property.
     *
     * @return the registration value.
     */
    public AppleRegistration registration() {
        return this.registration;
    }

    /**
     * Set the registration property: The registration property.
     *
     * @param registration the registration value to set.
     * @return the Apple object itself.
     */
    public Apple withRegistration(AppleRegistration registration) {
        this.registration = registration;
        return this;
    }

    /**
     * Get the login property: The login property.
     *
     * @return the login value.
     */
    public LoginScopes login() {
        return this.login;
    }

    /**
     * Set the login property: The login property.
     *
     * @param login the login value to set.
     * @return the Apple object itself.
     */
    public Apple withLogin(LoginScopes login) {
        this.login = login;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Apple withKind(String kind) {
        super.withKind(kind);
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
        if (registration() != null) {
            registration().validate();
        }
        if (login() != null) {
            login().validate();
        }
    }
}
