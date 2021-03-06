// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Gateway hostname configuration details. */
@JsonFlatten
@Fluent
public class GatewayHostnameConfigurationContractInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GatewayHostnameConfigurationContractInner.class);

    /*
     * Hostname value. Supports valid domain name, partial or full wildcard
     */
    @JsonProperty(value = "properties.hostname")
    private String hostname;

    /*
     * Identifier of Certificate entity that will be used for TLS connection
     * establishment
     */
    @JsonProperty(value = "properties.certificateId")
    private String certificateId;

    /*
     * Determines whether gateway requests client certificate
     */
    @JsonProperty(value = "properties.negotiateClientCertificate")
    private Boolean negotiateClientCertificate;

    /*
     * Specifies if TLS 1.0 is supported
     */
    @JsonProperty(value = "properties.tls10Enabled")
    private Boolean tls10Enabled;

    /*
     * Specifies if TLS 1.1 is supported
     */
    @JsonProperty(value = "properties.tls11Enabled")
    private Boolean tls11Enabled;

    /*
     * Specifies if HTTP/2.0 is supported
     */
    @JsonProperty(value = "properties.http2Enabled")
    private Boolean http2Enabled;

    /**
     * Get the hostname property: Hostname value. Supports valid domain name, partial or full wildcard.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: Hostname value. Supports valid domain name, partial or full wildcard.
     *
     * @param hostname the hostname value to set.
     * @return the GatewayHostnameConfigurationContractInner object itself.
     */
    public GatewayHostnameConfigurationContractInner withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the certificateId property: Identifier of Certificate entity that will be used for TLS connection
     * establishment.
     *
     * @return the certificateId value.
     */
    public String certificateId() {
        return this.certificateId;
    }

    /**
     * Set the certificateId property: Identifier of Certificate entity that will be used for TLS connection
     * establishment.
     *
     * @param certificateId the certificateId value to set.
     * @return the GatewayHostnameConfigurationContractInner object itself.
     */
    public GatewayHostnameConfigurationContractInner withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * Get the negotiateClientCertificate property: Determines whether gateway requests client certificate.
     *
     * @return the negotiateClientCertificate value.
     */
    public Boolean negotiateClientCertificate() {
        return this.negotiateClientCertificate;
    }

    /**
     * Set the negotiateClientCertificate property: Determines whether gateway requests client certificate.
     *
     * @param negotiateClientCertificate the negotiateClientCertificate value to set.
     * @return the GatewayHostnameConfigurationContractInner object itself.
     */
    public GatewayHostnameConfigurationContractInner withNegotiateClientCertificate(
        Boolean negotiateClientCertificate) {
        this.negotiateClientCertificate = negotiateClientCertificate;
        return this;
    }

    /**
     * Get the tls10Enabled property: Specifies if TLS 1.0 is supported.
     *
     * @return the tls10Enabled value.
     */
    public Boolean tls10Enabled() {
        return this.tls10Enabled;
    }

    /**
     * Set the tls10Enabled property: Specifies if TLS 1.0 is supported.
     *
     * @param tls10Enabled the tls10Enabled value to set.
     * @return the GatewayHostnameConfigurationContractInner object itself.
     */
    public GatewayHostnameConfigurationContractInner withTls10Enabled(Boolean tls10Enabled) {
        this.tls10Enabled = tls10Enabled;
        return this;
    }

    /**
     * Get the tls11Enabled property: Specifies if TLS 1.1 is supported.
     *
     * @return the tls11Enabled value.
     */
    public Boolean tls11Enabled() {
        return this.tls11Enabled;
    }

    /**
     * Set the tls11Enabled property: Specifies if TLS 1.1 is supported.
     *
     * @param tls11Enabled the tls11Enabled value to set.
     * @return the GatewayHostnameConfigurationContractInner object itself.
     */
    public GatewayHostnameConfigurationContractInner withTls11Enabled(Boolean tls11Enabled) {
        this.tls11Enabled = tls11Enabled;
        return this;
    }

    /**
     * Get the http2Enabled property: Specifies if HTTP/2.0 is supported.
     *
     * @return the http2Enabled value.
     */
    public Boolean http2Enabled() {
        return this.http2Enabled;
    }

    /**
     * Set the http2Enabled property: Specifies if HTTP/2.0 is supported.
     *
     * @param http2Enabled the http2Enabled value to set.
     * @return the GatewayHostnameConfigurationContractInner object itself.
     */
    public GatewayHostnameConfigurationContractInner withHttp2Enabled(Boolean http2Enabled) {
        this.http2Enabled = http2Enabled;
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
