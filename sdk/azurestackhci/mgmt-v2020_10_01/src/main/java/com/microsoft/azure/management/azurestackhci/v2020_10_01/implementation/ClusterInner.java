/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestackhci.v2020_10_01.implementation;

import com.microsoft.azure.management.azurestackhci.v2020_10_01.ProvisioningState;
import com.microsoft.azure.management.azurestackhci.v2020_10_01.Status;
import com.microsoft.azure.management.azurestackhci.v2020_10_01.ClusterReportedProperties;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Cluster details.
 */
@JsonFlatten
public class ClusterInner extends Resource {
    /**
     * Provisioning state. Possible values include: 'Succeeded', 'Failed',
     * 'Canceled', 'Accepted', 'Provisioning'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Status of the cluster agent. Possible values include:
     * 'NotYetRegistered', 'ConnectedRecently', 'NotConnectedRecently',
     * 'Disconnected', 'Error'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private Status status;

    /**
     * Unique, immutable resource id.
     */
    @JsonProperty(value = "properties.cloudId", access = JsonProperty.Access.WRITE_ONLY)
    private String cloudId;

    /**
     * App id of cluster AAD identity.
     */
    @JsonProperty(value = "properties.aadClientId", required = true)
    private String aadClientId;

    /**
     * Tenant id of cluster AAD identity.
     */
    @JsonProperty(value = "properties.aadTenantId", required = true)
    private String aadTenantId;

    /**
     * Properties reported by cluster agent.
     */
    @JsonProperty(value = "properties.reportedProperties")
    private ClusterReportedProperties reportedProperties;

    /**
     * Number of days remaining in the trial period.
     */
    @JsonProperty(value = "properties.trialDaysRemaining", access = JsonProperty.Access.WRITE_ONLY)
    private Double trialDaysRemaining;

    /**
     * Type of billing applied to the resource.
     */
    @JsonProperty(value = "properties.billingModel", access = JsonProperty.Access.WRITE_ONLY)
    private String billingModel;

    /**
     * First cluster sync timestamp.
     */
    @JsonProperty(value = "properties.registrationTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime registrationTimestamp;

    /**
     * Most recent cluster sync timestamp.
     */
    @JsonProperty(value = "properties.lastSyncTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastSyncTimestamp;

    /**
     * Most recent billing meter timestamp.
     */
    @JsonProperty(value = "properties.lastBillingTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastBillingTimestamp;

    /**
     * Get provisioning state. Possible values include: 'Succeeded', 'Failed', 'Canceled', 'Accepted', 'Provisioning'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get status of the cluster agent. Possible values include: 'NotYetRegistered', 'ConnectedRecently', 'NotConnectedRecently', 'Disconnected', 'Error'.
     *
     * @return the status value
     */
    public Status status() {
        return this.status;
    }

    /**
     * Get unique, immutable resource id.
     *
     * @return the cloudId value
     */
    public String cloudId() {
        return this.cloudId;
    }

    /**
     * Get app id of cluster AAD identity.
     *
     * @return the aadClientId value
     */
    public String aadClientId() {
        return this.aadClientId;
    }

    /**
     * Set app id of cluster AAD identity.
     *
     * @param aadClientId the aadClientId value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withAadClientId(String aadClientId) {
        this.aadClientId = aadClientId;
        return this;
    }

    /**
     * Get tenant id of cluster AAD identity.
     *
     * @return the aadTenantId value
     */
    public String aadTenantId() {
        return this.aadTenantId;
    }

    /**
     * Set tenant id of cluster AAD identity.
     *
     * @param aadTenantId the aadTenantId value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withAadTenantId(String aadTenantId) {
        this.aadTenantId = aadTenantId;
        return this;
    }

    /**
     * Get properties reported by cluster agent.
     *
     * @return the reportedProperties value
     */
    public ClusterReportedProperties reportedProperties() {
        return this.reportedProperties;
    }

    /**
     * Set properties reported by cluster agent.
     *
     * @param reportedProperties the reportedProperties value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withReportedProperties(ClusterReportedProperties reportedProperties) {
        this.reportedProperties = reportedProperties;
        return this;
    }

    /**
     * Get number of days remaining in the trial period.
     *
     * @return the trialDaysRemaining value
     */
    public Double trialDaysRemaining() {
        return this.trialDaysRemaining;
    }

    /**
     * Get type of billing applied to the resource.
     *
     * @return the billingModel value
     */
    public String billingModel() {
        return this.billingModel;
    }

    /**
     * Get first cluster sync timestamp.
     *
     * @return the registrationTimestamp value
     */
    public DateTime registrationTimestamp() {
        return this.registrationTimestamp;
    }

    /**
     * Get most recent cluster sync timestamp.
     *
     * @return the lastSyncTimestamp value
     */
    public DateTime lastSyncTimestamp() {
        return this.lastSyncTimestamp;
    }

    /**
     * Get most recent billing meter timestamp.
     *
     * @return the lastBillingTimestamp value
     */
    public DateTime lastBillingTimestamp() {
        return this.lastBillingTimestamp;
    }

}
