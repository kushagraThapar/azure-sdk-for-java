// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters used to create a new firewall rule while creating a new Data Lake Store account. */
@JsonFlatten
@Fluent
public class CreateFirewallRuleWithAccountParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CreateFirewallRuleWithAccountParameters.class);

    /*
     * The unique name of the firewall rule to create.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The start IP address for the firewall rule. This can be either ipv4 or
     * ipv6. Start and End should be in the same protocol.
     */
    @JsonProperty(value = "properties.startIpAddress", required = true)
    private String startIpAddress;

    /*
     * The end IP address for the firewall rule. This can be either ipv4 or
     * ipv6. Start and End should be in the same protocol.
     */
    @JsonProperty(value = "properties.endIpAddress", required = true)
    private String endIpAddress;

    /**
     * Get the name property: The unique name of the firewall rule to create.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The unique name of the firewall rule to create.
     *
     * @param name the name value to set.
     * @return the CreateFirewallRuleWithAccountParameters object itself.
     */
    public CreateFirewallRuleWithAccountParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the startIpAddress property: The start IP address for the firewall rule. This can be either ipv4 or ipv6.
     * Start and End should be in the same protocol.
     *
     * @return the startIpAddress value.
     */
    public String startIpAddress() {
        return this.startIpAddress;
    }

    /**
     * Set the startIpAddress property: The start IP address for the firewall rule. This can be either ipv4 or ipv6.
     * Start and End should be in the same protocol.
     *
     * @param startIpAddress the startIpAddress value to set.
     * @return the CreateFirewallRuleWithAccountParameters object itself.
     */
    public CreateFirewallRuleWithAccountParameters withStartIpAddress(String startIpAddress) {
        this.startIpAddress = startIpAddress;
        return this;
    }

    /**
     * Get the endIpAddress property: The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start
     * and End should be in the same protocol.
     *
     * @return the endIpAddress value.
     */
    public String endIpAddress() {
        return this.endIpAddress;
    }

    /**
     * Set the endIpAddress property: The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start
     * and End should be in the same protocol.
     *
     * @param endIpAddress the endIpAddress value to set.
     * @return the CreateFirewallRuleWithAccountParameters object itself.
     */
    public CreateFirewallRuleWithAccountParameters withEndIpAddress(String endIpAddress) {
        this.endIpAddress = endIpAddress;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model CreateFirewallRuleWithAccountParameters"));
        }
        if (startIpAddress() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property startIpAddress in model CreateFirewallRuleWithAccountParameters"));
        }
        if (endIpAddress() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property endIpAddress in model CreateFirewallRuleWithAccountParameters"));
        }
    }
}
