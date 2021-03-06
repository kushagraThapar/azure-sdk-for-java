/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The OpenIdConnectClientCredential model.
 */
@JsonFlatten
public class OpenIdConnectClientCredential extends ProxyOnlyResource {
    /**
     * Possible values include: 'ClientSecretPost'.
     */
    @JsonProperty(value = "properties.method")
    private ClientCredentialMethod method;

    /**
     * The clientSecretSettingName property.
     */
    @JsonProperty(value = "properties.clientSecretSettingName")
    private String clientSecretSettingName;

    /**
     * Get possible values include: 'ClientSecretPost'.
     *
     * @return the method value
     */
    public ClientCredentialMethod method() {
        return this.method;
    }

    /**
     * Set possible values include: 'ClientSecretPost'.
     *
     * @param method the method value to set
     * @return the OpenIdConnectClientCredential object itself.
     */
    public OpenIdConnectClientCredential withMethod(ClientCredentialMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get the clientSecretSettingName value.
     *
     * @return the clientSecretSettingName value
     */
    public String clientSecretSettingName() {
        return this.clientSecretSettingName;
    }

    /**
     * Set the clientSecretSettingName value.
     *
     * @param clientSecretSettingName the clientSecretSettingName value to set
     * @return the OpenIdConnectClientCredential object itself.
     */
    public OpenIdConnectClientCredential withClientSecretSettingName(String clientSecretSettingName) {
        this.clientSecretSettingName = clientSecretSettingName;
        return this;
    }

}
