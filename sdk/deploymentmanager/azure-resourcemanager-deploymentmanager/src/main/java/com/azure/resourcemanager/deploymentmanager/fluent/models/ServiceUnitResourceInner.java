// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.deploymentmanager.models.DeploymentMode;
import com.azure.resourcemanager.deploymentmanager.models.ServiceUnitArtifacts;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Represents the response of a service unit resource. */
@JsonFlatten
@Fluent
public class ServiceUnitResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceUnitResourceInner.class);

    /*
     * The Azure Resource Group to which the resources in the service unit
     * belong to or should be deployed to.
     */
    @JsonProperty(value = "properties.targetResourceGroup", required = true)
    private String targetResourceGroup;

    /*
     * Describes the type of ARM deployment to be performed on the resource.
     */
    @JsonProperty(value = "properties.deploymentMode", required = true)
    private DeploymentMode deploymentMode;

    /*
     * The artifacts for the service unit.
     */
    @JsonProperty(value = "properties.artifacts")
    private ServiceUnitArtifacts artifacts;

    /**
     * Get the targetResourceGroup property: The Azure Resource Group to which the resources in the service unit belong
     * to or should be deployed to.
     *
     * @return the targetResourceGroup value.
     */
    public String targetResourceGroup() {
        return this.targetResourceGroup;
    }

    /**
     * Set the targetResourceGroup property: The Azure Resource Group to which the resources in the service unit belong
     * to or should be deployed to.
     *
     * @param targetResourceGroup the targetResourceGroup value to set.
     * @return the ServiceUnitResourceInner object itself.
     */
    public ServiceUnitResourceInner withTargetResourceGroup(String targetResourceGroup) {
        this.targetResourceGroup = targetResourceGroup;
        return this;
    }

    /**
     * Get the deploymentMode property: Describes the type of ARM deployment to be performed on the resource.
     *
     * @return the deploymentMode value.
     */
    public DeploymentMode deploymentMode() {
        return this.deploymentMode;
    }

    /**
     * Set the deploymentMode property: Describes the type of ARM deployment to be performed on the resource.
     *
     * @param deploymentMode the deploymentMode value to set.
     * @return the ServiceUnitResourceInner object itself.
     */
    public ServiceUnitResourceInner withDeploymentMode(DeploymentMode deploymentMode) {
        this.deploymentMode = deploymentMode;
        return this;
    }

    /**
     * Get the artifacts property: The artifacts for the service unit.
     *
     * @return the artifacts value.
     */
    public ServiceUnitArtifacts artifacts() {
        return this.artifacts;
    }

    /**
     * Set the artifacts property: The artifacts for the service unit.
     *
     * @param artifacts the artifacts value to set.
     * @return the ServiceUnitResourceInner object itself.
     */
    public ServiceUnitResourceInner withArtifacts(ServiceUnitArtifacts artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceUnitResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceUnitResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetResourceGroup() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetResourceGroup in model ServiceUnitResourceInner"));
        }
        if (deploymentMode() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property deploymentMode in model ServiceUnitResourceInner"));
        }
        if (artifacts() != null) {
            artifacts().validate();
        }
    }
}
