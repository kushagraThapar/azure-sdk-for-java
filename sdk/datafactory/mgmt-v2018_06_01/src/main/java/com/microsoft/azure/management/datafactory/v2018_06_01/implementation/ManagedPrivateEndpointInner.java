/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import java.util.Map;
import com.microsoft.azure.management.datafactory.v2018_06_01.ConnectionStateProperties;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of a managed private endpoint.
 */
public class ManagedPrivateEndpointInner {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * The managed private endpoint connection state.
     */
    @JsonProperty(value = "connectionState")
    private ConnectionStateProperties connectionState;

    /**
     * Fully qualified domain names.
     */
    @JsonProperty(value = "fqdns")
    private List<String> fqdns;

    /**
     * The groupId to which the managed private endpoint is created.
     */
    @JsonProperty(value = "groupId")
    private String groupId;

    /**
     * Denotes whether the managed private endpoint is reserved.
     */
    @JsonProperty(value = "isReserved", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isReserved;

    /**
     * The ARM resource ID of the resource to which the managed private
     * endpoint is created.
     */
    @JsonProperty(value = "privateLinkResourceId")
    private String privateLinkResourceId;

    /**
     * The managed private endpoint provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the ManagedPrivateEndpointInner object itself.
     */
    public ManagedPrivateEndpointInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the managed private endpoint connection state.
     *
     * @return the connectionState value
     */
    public ConnectionStateProperties connectionState() {
        return this.connectionState;
    }

    /**
     * Set the managed private endpoint connection state.
     *
     * @param connectionState the connectionState value to set
     * @return the ManagedPrivateEndpointInner object itself.
     */
    public ManagedPrivateEndpointInner withConnectionState(ConnectionStateProperties connectionState) {
        this.connectionState = connectionState;
        return this;
    }

    /**
     * Get fully qualified domain names.
     *
     * @return the fqdns value
     */
    public List<String> fqdns() {
        return this.fqdns;
    }

    /**
     * Set fully qualified domain names.
     *
     * @param fqdns the fqdns value to set
     * @return the ManagedPrivateEndpointInner object itself.
     */
    public ManagedPrivateEndpointInner withFqdns(List<String> fqdns) {
        this.fqdns = fqdns;
        return this;
    }

    /**
     * Get the groupId to which the managed private endpoint is created.
     *
     * @return the groupId value
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId to which the managed private endpoint is created.
     *
     * @param groupId the groupId value to set
     * @return the ManagedPrivateEndpointInner object itself.
     */
    public ManagedPrivateEndpointInner withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get denotes whether the managed private endpoint is reserved.
     *
     * @return the isReserved value
     */
    public Boolean isReserved() {
        return this.isReserved;
    }

    /**
     * Get the ARM resource ID of the resource to which the managed private endpoint is created.
     *
     * @return the privateLinkResourceId value
     */
    public String privateLinkResourceId() {
        return this.privateLinkResourceId;
    }

    /**
     * Set the ARM resource ID of the resource to which the managed private endpoint is created.
     *
     * @param privateLinkResourceId the privateLinkResourceId value to set
     * @return the ManagedPrivateEndpointInner object itself.
     */
    public ManagedPrivateEndpointInner withPrivateLinkResourceId(String privateLinkResourceId) {
        this.privateLinkResourceId = privateLinkResourceId;
        return this;
    }

    /**
     * Get the managed private endpoint provisioning state.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

}
