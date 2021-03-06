// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.vmwarecloudsimple.models.PrivateCloudResourceType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** Private cloud model. */
@JsonFlatten
@Fluent
public class PrivateCloudInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateCloudInner.class);

    /*
     * Azure Id, e.g.
     * "/subscriptions/4da99247-a172-4ed6-8ae9-ebed2d12f839/providers/Microsoft.VMwareCloudSimple/privateClouds"
         + "/cloud123"
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Location where private cloud created, e.g "westus"
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Private cloud name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Azure Resource type
     */
    @JsonProperty(value = "type")
    private PrivateCloudResourceType type;

    /*
     * Availability Zone id, e.g. "az1"
     */
    @JsonProperty(value = "properties.availabilityZoneId")
    private String availabilityZoneId;

    /*
     * Availability Zone name, e.g. "Availability Zone 1"
     */
    @JsonProperty(value = "properties.availabilityZoneName")
    private String availabilityZoneName;

    /*
     * Number of clusters
     */
    @JsonProperty(value = "properties.clustersNumber")
    private Integer clustersNumber;

    /*
     * User's emails who created cloud
     */
    @JsonProperty(value = "properties.createdBy")
    private String createdBy;

    /*
     * When private cloud was created
     */
    @JsonProperty(value = "properties.createdOn")
    private OffsetDateTime createdOn;

    /*
     * Array of DNS servers
     */
    @JsonProperty(value = "properties.dnsServers")
    private List<String> dnsServers;

    /*
     * Expiration date of PC
     */
    @JsonProperty(value = "properties.expires")
    private String expires;

    /*
     * Nsx Type, e.g. "Advanced"
     */
    @JsonProperty(value = "properties.nsxType")
    private String nsxType;

    /*
     * Placement Group id, e.g. "n1"
     */
    @JsonProperty(value = "properties.placementGroupId")
    private String placementGroupId;

    /*
     * Placement Group name
     */
    @JsonProperty(value = "properties.placementGroupName")
    private String placementGroupName;

    /*
     * Id of a private cloud
     */
    @JsonProperty(value = "properties.privateCloudId")
    private UUID privateCloudId;

    /*
     * The list of Resource Pools
     */
    @JsonProperty(value = "properties.resourcePools")
    private List<ResourcePoolInner> resourcePools;

    /*
     * Private Cloud state, e.g. "operational"
     */
    @JsonProperty(value = "properties.state")
    private String state;

    /*
     * Number of cores
     */
    @JsonProperty(value = "properties.totalCpuCores")
    private Integer totalCpuCores;

    /*
     * Number of nodes
     */
    @JsonProperty(value = "properties.totalNodes")
    private Integer totalNodes;

    /*
     * Memory size
     */
    @JsonProperty(value = "properties.totalRam")
    private Integer totalRam;

    /*
     * Disk space in TB
     */
    @JsonProperty(value = "properties.totalStorage")
    private Float totalStorage;

    /*
     * Virtualization type e.g. "vSphere"
     */
    @JsonProperty(value = "properties.type")
    private String typePropertiesType;

    /*
     * e.g. "6.5u2"
     */
    @JsonProperty(value = "properties.vSphereVersion")
    private String vSphereVersion;

    /*
     * FQDN for vcenter access
     */
    @JsonProperty(value = "properties.vcenterFqdn")
    private String vcenterFqdn;

    /*
     * Vcenter ip address
     */
    @JsonProperty(value = "properties.vcenterRefid")
    private String vcenterRefid;

    /*
     * The list of Virtual Machine Templates
     */
    @JsonProperty(value = "properties.virtualMachineTemplates")
    private List<VirtualMachineTemplateInner> virtualMachineTemplates;

    /*
     * The list of Virtual Networks
     */
    @JsonProperty(value = "properties.virtualNetworks")
    private List<VirtualNetworkInner> virtualNetworks;

    /*
     * Is Vrops enabled/disabled
     */
    @JsonProperty(value = "properties.vrOpsEnabled")
    private Boolean vrOpsEnabled;

    /**
     * Get the id property: Azure Id, e.g.
     * "/subscriptions/4da99247-a172-4ed6-8ae9-ebed2d12f839/providers/Microsoft.VMwareCloudSimple/privateClouds"
         + "/cloud123".
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Azure Id, e.g.
     * "/subscriptions/4da99247-a172-4ed6-8ae9-ebed2d12f839/providers/Microsoft.VMwareCloudSimple/privateClouds"
         + "/cloud123".
     *
     * @param id the id value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the location property: Location where private cloud created, e.g "westus".
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location where private cloud created, e.g "westus".
     *
     * @param location the location value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the name property: Private cloud name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Private cloud name.
     *
     * @param name the name value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Azure Resource type.
     *
     * @return the type value.
     */
    public PrivateCloudResourceType type() {
        return this.type;
    }

    /**
     * Set the type property: Azure Resource type.
     *
     * @param type the type value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withType(PrivateCloudResourceType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the availabilityZoneId property: Availability Zone id, e.g. "az1".
     *
     * @return the availabilityZoneId value.
     */
    public String availabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * Set the availabilityZoneId property: Availability Zone id, e.g. "az1".
     *
     * @param availabilityZoneId the availabilityZoneId value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * Get the availabilityZoneName property: Availability Zone name, e.g. "Availability Zone 1".
     *
     * @return the availabilityZoneName value.
     */
    public String availabilityZoneName() {
        return this.availabilityZoneName;
    }

    /**
     * Set the availabilityZoneName property: Availability Zone name, e.g. "Availability Zone 1".
     *
     * @param availabilityZoneName the availabilityZoneName value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withAvailabilityZoneName(String availabilityZoneName) {
        this.availabilityZoneName = availabilityZoneName;
        return this;
    }

    /**
     * Get the clustersNumber property: Number of clusters.
     *
     * @return the clustersNumber value.
     */
    public Integer clustersNumber() {
        return this.clustersNumber;
    }

    /**
     * Set the clustersNumber property: Number of clusters.
     *
     * @param clustersNumber the clustersNumber value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withClustersNumber(Integer clustersNumber) {
        this.clustersNumber = clustersNumber;
        return this;
    }

    /**
     * Get the createdBy property: User's emails who created cloud.
     *
     * @return the createdBy value.
     */
    public String createdBy() {
        return this.createdBy;
    }

    /**
     * Set the createdBy property: User's emails who created cloud.
     *
     * @param createdBy the createdBy value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the createdOn property: When private cloud was created.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.createdOn;
    }

    /**
     * Set the createdOn property: When private cloud was created.
     *
     * @param createdOn the createdOn value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withCreatedOn(OffsetDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Get the dnsServers property: Array of DNS servers.
     *
     * @return the dnsServers value.
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }

    /**
     * Set the dnsServers property: Array of DNS servers.
     *
     * @param dnsServers the dnsServers value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    /**
     * Get the expires property: Expiration date of PC.
     *
     * @return the expires value.
     */
    public String expires() {
        return this.expires;
    }

    /**
     * Set the expires property: Expiration date of PC.
     *
     * @param expires the expires value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withExpires(String expires) {
        this.expires = expires;
        return this;
    }

    /**
     * Get the nsxType property: Nsx Type, e.g. "Advanced".
     *
     * @return the nsxType value.
     */
    public String nsxType() {
        return this.nsxType;
    }

    /**
     * Set the nsxType property: Nsx Type, e.g. "Advanced".
     *
     * @param nsxType the nsxType value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withNsxType(String nsxType) {
        this.nsxType = nsxType;
        return this;
    }

    /**
     * Get the placementGroupId property: Placement Group id, e.g. "n1".
     *
     * @return the placementGroupId value.
     */
    public String placementGroupId() {
        return this.placementGroupId;
    }

    /**
     * Set the placementGroupId property: Placement Group id, e.g. "n1".
     *
     * @param placementGroupId the placementGroupId value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withPlacementGroupId(String placementGroupId) {
        this.placementGroupId = placementGroupId;
        return this;
    }

    /**
     * Get the placementGroupName property: Placement Group name.
     *
     * @return the placementGroupName value.
     */
    public String placementGroupName() {
        return this.placementGroupName;
    }

    /**
     * Set the placementGroupName property: Placement Group name.
     *
     * @param placementGroupName the placementGroupName value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withPlacementGroupName(String placementGroupName) {
        this.placementGroupName = placementGroupName;
        return this;
    }

    /**
     * Get the privateCloudId property: Id of a private cloud.
     *
     * @return the privateCloudId value.
     */
    public UUID privateCloudId() {
        return this.privateCloudId;
    }

    /**
     * Set the privateCloudId property: Id of a private cloud.
     *
     * @param privateCloudId the privateCloudId value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withPrivateCloudId(UUID privateCloudId) {
        this.privateCloudId = privateCloudId;
        return this;
    }

    /**
     * Get the resourcePools property: The list of Resource Pools.
     *
     * @return the resourcePools value.
     */
    public List<ResourcePoolInner> resourcePools() {
        return this.resourcePools;
    }

    /**
     * Set the resourcePools property: The list of Resource Pools.
     *
     * @param resourcePools the resourcePools value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withResourcePools(List<ResourcePoolInner> resourcePools) {
        this.resourcePools = resourcePools;
        return this;
    }

    /**
     * Get the state property: Private Cloud state, e.g. "operational".
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: Private Cloud state, e.g. "operational".
     *
     * @param state the state value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the totalCpuCores property: Number of cores.
     *
     * @return the totalCpuCores value.
     */
    public Integer totalCpuCores() {
        return this.totalCpuCores;
    }

    /**
     * Set the totalCpuCores property: Number of cores.
     *
     * @param totalCpuCores the totalCpuCores value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withTotalCpuCores(Integer totalCpuCores) {
        this.totalCpuCores = totalCpuCores;
        return this;
    }

    /**
     * Get the totalNodes property: Number of nodes.
     *
     * @return the totalNodes value.
     */
    public Integer totalNodes() {
        return this.totalNodes;
    }

    /**
     * Set the totalNodes property: Number of nodes.
     *
     * @param totalNodes the totalNodes value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withTotalNodes(Integer totalNodes) {
        this.totalNodes = totalNodes;
        return this;
    }

    /**
     * Get the totalRam property: Memory size.
     *
     * @return the totalRam value.
     */
    public Integer totalRam() {
        return this.totalRam;
    }

    /**
     * Set the totalRam property: Memory size.
     *
     * @param totalRam the totalRam value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withTotalRam(Integer totalRam) {
        this.totalRam = totalRam;
        return this;
    }

    /**
     * Get the totalStorage property: Disk space in TB.
     *
     * @return the totalStorage value.
     */
    public Float totalStorage() {
        return this.totalStorage;
    }

    /**
     * Set the totalStorage property: Disk space in TB.
     *
     * @param totalStorage the totalStorage value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withTotalStorage(Float totalStorage) {
        this.totalStorage = totalStorage;
        return this;
    }

    /**
     * Get the typePropertiesType property: Virtualization type e.g. "vSphere".
     *
     * @return the typePropertiesType value.
     */
    public String typePropertiesType() {
        return this.typePropertiesType;
    }

    /**
     * Set the typePropertiesType property: Virtualization type e.g. "vSphere".
     *
     * @param typePropertiesType the typePropertiesType value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withTypePropertiesType(String typePropertiesType) {
        this.typePropertiesType = typePropertiesType;
        return this;
    }

    /**
     * Get the vSphereVersion property: e.g. "6.5u2".
     *
     * @return the vSphereVersion value.
     */
    public String vSphereVersion() {
        return this.vSphereVersion;
    }

    /**
     * Set the vSphereVersion property: e.g. "6.5u2".
     *
     * @param vSphereVersion the vSphereVersion value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withVSphereVersion(String vSphereVersion) {
        this.vSphereVersion = vSphereVersion;
        return this;
    }

    /**
     * Get the vcenterFqdn property: FQDN for vcenter access.
     *
     * @return the vcenterFqdn value.
     */
    public String vcenterFqdn() {
        return this.vcenterFqdn;
    }

    /**
     * Set the vcenterFqdn property: FQDN for vcenter access.
     *
     * @param vcenterFqdn the vcenterFqdn value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withVcenterFqdn(String vcenterFqdn) {
        this.vcenterFqdn = vcenterFqdn;
        return this;
    }

    /**
     * Get the vcenterRefid property: Vcenter ip address.
     *
     * @return the vcenterRefid value.
     */
    public String vcenterRefid() {
        return this.vcenterRefid;
    }

    /**
     * Set the vcenterRefid property: Vcenter ip address.
     *
     * @param vcenterRefid the vcenterRefid value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withVcenterRefid(String vcenterRefid) {
        this.vcenterRefid = vcenterRefid;
        return this;
    }

    /**
     * Get the virtualMachineTemplates property: The list of Virtual Machine Templates.
     *
     * @return the virtualMachineTemplates value.
     */
    public List<VirtualMachineTemplateInner> virtualMachineTemplates() {
        return this.virtualMachineTemplates;
    }

    /**
     * Set the virtualMachineTemplates property: The list of Virtual Machine Templates.
     *
     * @param virtualMachineTemplates the virtualMachineTemplates value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withVirtualMachineTemplates(List<VirtualMachineTemplateInner> virtualMachineTemplates) {
        this.virtualMachineTemplates = virtualMachineTemplates;
        return this;
    }

    /**
     * Get the virtualNetworks property: The list of Virtual Networks.
     *
     * @return the virtualNetworks value.
     */
    public List<VirtualNetworkInner> virtualNetworks() {
        return this.virtualNetworks;
    }

    /**
     * Set the virtualNetworks property: The list of Virtual Networks.
     *
     * @param virtualNetworks the virtualNetworks value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withVirtualNetworks(List<VirtualNetworkInner> virtualNetworks) {
        this.virtualNetworks = virtualNetworks;
        return this;
    }

    /**
     * Get the vrOpsEnabled property: Is Vrops enabled/disabled.
     *
     * @return the vrOpsEnabled value.
     */
    public Boolean vrOpsEnabled() {
        return this.vrOpsEnabled;
    }

    /**
     * Set the vrOpsEnabled property: Is Vrops enabled/disabled.
     *
     * @param vrOpsEnabled the vrOpsEnabled value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withVrOpsEnabled(Boolean vrOpsEnabled) {
        this.vrOpsEnabled = vrOpsEnabled;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourcePools() != null) {
            resourcePools().forEach(e -> e.validate());
        }
        if (virtualMachineTemplates() != null) {
            virtualMachineTemplates().forEach(e -> e.validate());
        }
        if (virtualNetworks() != null) {
            virtualNetworks().forEach(e -> e.validate());
        }
    }
}
