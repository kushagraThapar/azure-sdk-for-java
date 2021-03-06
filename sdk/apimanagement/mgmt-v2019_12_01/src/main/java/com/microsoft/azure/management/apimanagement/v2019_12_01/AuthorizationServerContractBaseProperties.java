/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * External OAuth authorization server Update settings contract.
 */
public class AuthorizationServerContractBaseProperties {
    /**
     * Description of the authorization server. Can contain HTML formatting
     * tags.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * HTTP verbs supported by the authorization endpoint. GET must be always
     * present. POST is optional.
     */
    @JsonProperty(value = "authorizationMethods")
    private List<AuthorizationMethod> authorizationMethods;

    /**
     * Method of authentication supported by the token endpoint of this
     * authorization server. Possible values are Basic and/or Body. When Body
     * is specified, client credentials and other parameters are passed within
     * the request body in the application/x-www-form-urlencoded format.
     */
    @JsonProperty(value = "clientAuthenticationMethod")
    private List<ClientAuthenticationMethod> clientAuthenticationMethod;

    /**
     * Additional parameters required by the token endpoint of this
     * authorization server represented as an array of JSON objects with name
     * and value string properties, i.e. {"name" : "name value", "value": "a
     * value"}.
     */
    @JsonProperty(value = "tokenBodyParameters")
    private List<TokenBodyParameterContract> tokenBodyParameters;

    /**
     * OAuth token endpoint. Contains absolute URI to entity being referenced.
     */
    @JsonProperty(value = "tokenEndpoint")
    private String tokenEndpoint;

    /**
     * If true, authorization server will include state parameter from the
     * authorization request to its response. Client may use state parameter to
     * raise protocol security.
     */
    @JsonProperty(value = "supportState")
    private Boolean supportState;

    /**
     * Access token scope that is going to be requested by default. Can be
     * overridden at the API level. Should be provided in the form of a string
     * containing space-delimited values.
     */
    @JsonProperty(value = "defaultScope")
    private String defaultScope;

    /**
     * Specifies the mechanism by which access token is passed to the API.
     */
    @JsonProperty(value = "bearerTokenSendingMethods")
    private List<BearerTokenSendingMethod> bearerTokenSendingMethods;

    /**
     * Can be optionally specified when resource owner password grant type is
     * supported by this authorization server. Default resource owner username.
     */
    @JsonProperty(value = "resourceOwnerUsername")
    private String resourceOwnerUsername;

    /**
     * Can be optionally specified when resource owner password grant type is
     * supported by this authorization server. Default resource owner password.
     */
    @JsonProperty(value = "resourceOwnerPassword")
    private String resourceOwnerPassword;

    /**
     * Get description of the authorization server. Can contain HTML formatting tags.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of the authorization server. Can contain HTML formatting tags.
     *
     * @param description the description value to set
     * @return the AuthorizationServerContractBaseProperties object itself.
     */
    public AuthorizationServerContractBaseProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get hTTP verbs supported by the authorization endpoint. GET must be always present. POST is optional.
     *
     * @return the authorizationMethods value
     */
    public List<AuthorizationMethod> authorizationMethods() {
        return this.authorizationMethods;
    }

    /**
     * Set hTTP verbs supported by the authorization endpoint. GET must be always present. POST is optional.
     *
     * @param authorizationMethods the authorizationMethods value to set
     * @return the AuthorizationServerContractBaseProperties object itself.
     */
    public AuthorizationServerContractBaseProperties withAuthorizationMethods(List<AuthorizationMethod> authorizationMethods) {
        this.authorizationMethods = authorizationMethods;
        return this;
    }

    /**
     * Get method of authentication supported by the token endpoint of this authorization server. Possible values are Basic and/or Body. When Body is specified, client credentials and other parameters are passed within the request body in the application/x-www-form-urlencoded format.
     *
     * @return the clientAuthenticationMethod value
     */
    public List<ClientAuthenticationMethod> clientAuthenticationMethod() {
        return this.clientAuthenticationMethod;
    }

    /**
     * Set method of authentication supported by the token endpoint of this authorization server. Possible values are Basic and/or Body. When Body is specified, client credentials and other parameters are passed within the request body in the application/x-www-form-urlencoded format.
     *
     * @param clientAuthenticationMethod the clientAuthenticationMethod value to set
     * @return the AuthorizationServerContractBaseProperties object itself.
     */
    public AuthorizationServerContractBaseProperties withClientAuthenticationMethod(List<ClientAuthenticationMethod> clientAuthenticationMethod) {
        this.clientAuthenticationMethod = clientAuthenticationMethod;
        return this;
    }

    /**
     * Get additional parameters required by the token endpoint of this authorization server represented as an array of JSON objects with name and value string properties, i.e. {"name" : "name value", "value": "a value"}.
     *
     * @return the tokenBodyParameters value
     */
    public List<TokenBodyParameterContract> tokenBodyParameters() {
        return this.tokenBodyParameters;
    }

    /**
     * Set additional parameters required by the token endpoint of this authorization server represented as an array of JSON objects with name and value string properties, i.e. {"name" : "name value", "value": "a value"}.
     *
     * @param tokenBodyParameters the tokenBodyParameters value to set
     * @return the AuthorizationServerContractBaseProperties object itself.
     */
    public AuthorizationServerContractBaseProperties withTokenBodyParameters(List<TokenBodyParameterContract> tokenBodyParameters) {
        this.tokenBodyParameters = tokenBodyParameters;
        return this;
    }

    /**
     * Get oAuth token endpoint. Contains absolute URI to entity being referenced.
     *
     * @return the tokenEndpoint value
     */
    public String tokenEndpoint() {
        return this.tokenEndpoint;
    }

    /**
     * Set oAuth token endpoint. Contains absolute URI to entity being referenced.
     *
     * @param tokenEndpoint the tokenEndpoint value to set
     * @return the AuthorizationServerContractBaseProperties object itself.
     */
    public AuthorizationServerContractBaseProperties withTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
        return this;
    }

    /**
     * Get if true, authorization server will include state parameter from the authorization request to its response. Client may use state parameter to raise protocol security.
     *
     * @return the supportState value
     */
    public Boolean supportState() {
        return this.supportState;
    }

    /**
     * Set if true, authorization server will include state parameter from the authorization request to its response. Client may use state parameter to raise protocol security.
     *
     * @param supportState the supportState value to set
     * @return the AuthorizationServerContractBaseProperties object itself.
     */
    public AuthorizationServerContractBaseProperties withSupportState(Boolean supportState) {
        this.supportState = supportState;
        return this;
    }

    /**
     * Get access token scope that is going to be requested by default. Can be overridden at the API level. Should be provided in the form of a string containing space-delimited values.
     *
     * @return the defaultScope value
     */
    public String defaultScope() {
        return this.defaultScope;
    }

    /**
     * Set access token scope that is going to be requested by default. Can be overridden at the API level. Should be provided in the form of a string containing space-delimited values.
     *
     * @param defaultScope the defaultScope value to set
     * @return the AuthorizationServerContractBaseProperties object itself.
     */
    public AuthorizationServerContractBaseProperties withDefaultScope(String defaultScope) {
        this.defaultScope = defaultScope;
        return this;
    }

    /**
     * Get specifies the mechanism by which access token is passed to the API.
     *
     * @return the bearerTokenSendingMethods value
     */
    public List<BearerTokenSendingMethod> bearerTokenSendingMethods() {
        return this.bearerTokenSendingMethods;
    }

    /**
     * Set specifies the mechanism by which access token is passed to the API.
     *
     * @param bearerTokenSendingMethods the bearerTokenSendingMethods value to set
     * @return the AuthorizationServerContractBaseProperties object itself.
     */
    public AuthorizationServerContractBaseProperties withBearerTokenSendingMethods(List<BearerTokenSendingMethod> bearerTokenSendingMethods) {
        this.bearerTokenSendingMethods = bearerTokenSendingMethods;
        return this;
    }

    /**
     * Get can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner username.
     *
     * @return the resourceOwnerUsername value
     */
    public String resourceOwnerUsername() {
        return this.resourceOwnerUsername;
    }

    /**
     * Set can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner username.
     *
     * @param resourceOwnerUsername the resourceOwnerUsername value to set
     * @return the AuthorizationServerContractBaseProperties object itself.
     */
    public AuthorizationServerContractBaseProperties withResourceOwnerUsername(String resourceOwnerUsername) {
        this.resourceOwnerUsername = resourceOwnerUsername;
        return this;
    }

    /**
     * Get can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner password.
     *
     * @return the resourceOwnerPassword value
     */
    public String resourceOwnerPassword() {
        return this.resourceOwnerPassword;
    }

    /**
     * Set can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner password.
     *
     * @param resourceOwnerPassword the resourceOwnerPassword value to set
     * @return the AuthorizationServerContractBaseProperties object itself.
     */
    public AuthorizationServerContractBaseProperties withResourceOwnerPassword(String resourceOwnerPassword) {
        this.resourceOwnerPassword = resourceOwnerPassword;
        return this;
    }

}
