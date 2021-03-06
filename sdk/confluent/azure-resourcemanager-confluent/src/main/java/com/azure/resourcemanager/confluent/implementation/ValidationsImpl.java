// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.confluent.fluent.ValidationsClient;
import com.azure.resourcemanager.confluent.fluent.models.OrganizationResourceInner;
import com.azure.resourcemanager.confluent.models.OrganizationResource;
import com.azure.resourcemanager.confluent.models.Validations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ValidationsImpl implements Validations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ValidationsImpl.class);

    private final ValidationsClient innerClient;

    private final com.azure.resourcemanager.confluent.ConfluentManager serviceManager;

    public ValidationsImpl(
        ValidationsClient innerClient, com.azure.resourcemanager.confluent.ConfluentManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public OrganizationResource validateOrganization(
        String resourceGroupName, String organizationName, OrganizationResourceInner body) {
        OrganizationResourceInner inner =
            this.serviceClient().validateOrganization(resourceGroupName, organizationName, body);
        if (inner != null) {
            return new OrganizationResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OrganizationResource> validateOrganizationWithResponse(
        String resourceGroupName, String organizationName, OrganizationResourceInner body, Context context) {
        Response<OrganizationResourceInner> inner =
            this.serviceClient().validateOrganizationWithResponse(resourceGroupName, organizationName, body, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OrganizationResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ValidationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.confluent.ConfluentManager manager() {
        return this.serviceManager;
    }
}
