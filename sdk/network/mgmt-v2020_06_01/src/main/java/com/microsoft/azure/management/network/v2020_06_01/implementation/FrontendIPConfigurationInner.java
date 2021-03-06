/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_06_01.IPAllocationMethod;
import com.microsoft.azure.management.network.v2020_06_01.IPVersion;
import com.microsoft.azure.management.network.v2020_06_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Frontend IP address of the load balancer.
 */
@JsonFlatten
public class FrontendIPConfigurationInner extends SubResource {
    /**
     * An array of references to inbound rules that use this frontend IP.
     */
    @JsonProperty(value = "properties.inboundNatRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> inboundNatRules;

    /**
     * An array of references to inbound pools that use this frontend IP.
     */
    @JsonProperty(value = "properties.inboundNatPools", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> inboundNatPools;

    /**
     * An array of references to outbound rules that use this frontend IP.
     */
    @JsonProperty(value = "properties.outboundRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> outboundRules;

    /**
     * An array of references to load balancing rules that use this frontend
     * IP.
     */
    @JsonProperty(value = "properties.loadBalancingRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> loadBalancingRules;

    /**
     * The private IP address of the IP configuration.
     */
    @JsonProperty(value = "properties.privateIPAddress")
    private String privateIPAddress;

    /**
     * The Private IP allocation method. Possible values include: 'Static',
     * 'Dynamic'.
     */
    @JsonProperty(value = "properties.privateIPAllocationMethod")
    private IPAllocationMethod privateIPAllocationMethod;

    /**
     * Whether the specific ipconfiguration is IPv4 or IPv6. Default is taken
     * as IPv4. Possible values include: 'IPv4', 'IPv6'.
     */
    @JsonProperty(value = "properties.privateIPAddressVersion")
    private IPVersion privateIPAddressVersion;

    /**
     * The reference to the subnet resource.
     */
    @JsonProperty(value = "properties.subnet")
    private SubnetInner subnet;

    /**
     * The reference to the Public IP resource.
     */
    @JsonProperty(value = "properties.publicIPAddress")
    private PublicIPAddressInner publicIPAddress;

    /**
     * The reference to the Public IP Prefix resource.
     */
    @JsonProperty(value = "properties.publicIPPrefix")
    private SubResource publicIPPrefix;

    /**
     * The provisioning state of the frontend IP configuration resource.
     * Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The name of the resource that is unique within the set of frontend IP
     * configurations used by the load balancer. This name can be used to
     * access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * A list of availability zones denoting the IP allocated for the resource
     * needs to come from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * Get an array of references to inbound rules that use this frontend IP.
     *
     * @return the inboundNatRules value
     */
    public List<SubResource> inboundNatRules() {
        return this.inboundNatRules;
    }

    /**
     * Get an array of references to inbound pools that use this frontend IP.
     *
     * @return the inboundNatPools value
     */
    public List<SubResource> inboundNatPools() {
        return this.inboundNatPools;
    }

    /**
     * Get an array of references to outbound rules that use this frontend IP.
     *
     * @return the outboundRules value
     */
    public List<SubResource> outboundRules() {
        return this.outboundRules;
    }

    /**
     * Get an array of references to load balancing rules that use this frontend IP.
     *
     * @return the loadBalancingRules value
     */
    public List<SubResource> loadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * Get the private IP address of the IP configuration.
     *
     * @return the privateIPAddress value
     */
    public String privateIPAddress() {
        return this.privateIPAddress;
    }

    /**
     * Set the private IP address of the IP configuration.
     *
     * @param privateIPAddress the privateIPAddress value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withPrivateIPAddress(String privateIPAddress) {
        this.privateIPAddress = privateIPAddress;
        return this;
    }

    /**
     * Get the Private IP allocation method. Possible values include: 'Static', 'Dynamic'.
     *
     * @return the privateIPAllocationMethod value
     */
    public IPAllocationMethod privateIPAllocationMethod() {
        return this.privateIPAllocationMethod;
    }

    /**
     * Set the Private IP allocation method. Possible values include: 'Static', 'Dynamic'.
     *
     * @param privateIPAllocationMethod the privateIPAllocationMethod value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withPrivateIPAllocationMethod(IPAllocationMethod privateIPAllocationMethod) {
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        return this;
    }

    /**
     * Get whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values include: 'IPv4', 'IPv6'.
     *
     * @return the privateIPAddressVersion value
     */
    public IPVersion privateIPAddressVersion() {
        return this.privateIPAddressVersion;
    }

    /**
     * Set whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values include: 'IPv4', 'IPv6'.
     *
     * @param privateIPAddressVersion the privateIPAddressVersion value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withPrivateIPAddressVersion(IPVersion privateIPAddressVersion) {
        this.privateIPAddressVersion = privateIPAddressVersion;
        return this;
    }

    /**
     * Get the reference to the subnet resource.
     *
     * @return the subnet value
     */
    public SubnetInner subnet() {
        return this.subnet;
    }

    /**
     * Set the reference to the subnet resource.
     *
     * @param subnet the subnet value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withSubnet(SubnetInner subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the reference to the Public IP resource.
     *
     * @return the publicIPAddress value
     */
    public PublicIPAddressInner publicIPAddress() {
        return this.publicIPAddress;
    }

    /**
     * Set the reference to the Public IP resource.
     *
     * @param publicIPAddress the publicIPAddress value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withPublicIPAddress(PublicIPAddressInner publicIPAddress) {
        this.publicIPAddress = publicIPAddress;
        return this;
    }

    /**
     * Get the reference to the Public IP Prefix resource.
     *
     * @return the publicIPPrefix value
     */
    public SubResource publicIPPrefix() {
        return this.publicIPPrefix;
    }

    /**
     * Set the reference to the Public IP Prefix resource.
     *
     * @param publicIPPrefix the publicIPPrefix value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withPublicIPPrefix(SubResource publicIPPrefix) {
        this.publicIPPrefix = publicIPPrefix;
        return this;
    }

    /**
     * Get the provisioning state of the frontend IP configuration resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the name of the resource that is unique within the set of frontend IP configurations used by the load balancer. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within the set of frontend IP configurations used by the load balancer. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get a list of availability zones denoting the IP allocated for the resource needs to come from.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set a list of availability zones denoting the IP allocated for the resource needs to come from.
     *
     * @param zones the zones value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

}
