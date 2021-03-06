/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcemover.v2021_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the dependency of the move resource.
 */
public class MoveResourceDependency {
    /**
     * Gets the source ARM ID of the dependent resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Gets the dependency resolution status.
     */
    @JsonProperty(value = "resolutionStatus")
    private String resolutionStatus;

    /**
     * Possible values include: 'Manual', 'Automatic'.
     */
    @JsonProperty(value = "resolutionType")
    private ResolutionType resolutionType;

    /**
     * Possible values include: 'RequiredForPrepare', 'RequiredForMove'.
     */
    @JsonProperty(value = "dependencyType")
    private DependencyType dependencyType;

    /**
     * The manualResolution property.
     */
    @JsonProperty(value = "manualResolution")
    private ManualResolutionProperties manualResolution;

    /**
     * The automaticResolution property.
     */
    @JsonProperty(value = "automaticResolution")
    private AutomaticResolutionProperties automaticResolution;

    /**
     * Gets or sets a value indicating whether the dependency is optional.
     */
    @JsonProperty(value = "isOptional")
    private String isOptional;

    /**
     * Get gets the source ARM ID of the dependent resource.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set gets the source ARM ID of the dependent resource.
     *
     * @param id the id value to set
     * @return the MoveResourceDependency object itself.
     */
    public MoveResourceDependency withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get gets the dependency resolution status.
     *
     * @return the resolutionStatus value
     */
    public String resolutionStatus() {
        return this.resolutionStatus;
    }

    /**
     * Set gets the dependency resolution status.
     *
     * @param resolutionStatus the resolutionStatus value to set
     * @return the MoveResourceDependency object itself.
     */
    public MoveResourceDependency withResolutionStatus(String resolutionStatus) {
        this.resolutionStatus = resolutionStatus;
        return this;
    }

    /**
     * Get possible values include: 'Manual', 'Automatic'.
     *
     * @return the resolutionType value
     */
    public ResolutionType resolutionType() {
        return this.resolutionType;
    }

    /**
     * Set possible values include: 'Manual', 'Automatic'.
     *
     * @param resolutionType the resolutionType value to set
     * @return the MoveResourceDependency object itself.
     */
    public MoveResourceDependency withResolutionType(ResolutionType resolutionType) {
        this.resolutionType = resolutionType;
        return this;
    }

    /**
     * Get possible values include: 'RequiredForPrepare', 'RequiredForMove'.
     *
     * @return the dependencyType value
     */
    public DependencyType dependencyType() {
        return this.dependencyType;
    }

    /**
     * Set possible values include: 'RequiredForPrepare', 'RequiredForMove'.
     *
     * @param dependencyType the dependencyType value to set
     * @return the MoveResourceDependency object itself.
     */
    public MoveResourceDependency withDependencyType(DependencyType dependencyType) {
        this.dependencyType = dependencyType;
        return this;
    }

    /**
     * Get the manualResolution value.
     *
     * @return the manualResolution value
     */
    public ManualResolutionProperties manualResolution() {
        return this.manualResolution;
    }

    /**
     * Set the manualResolution value.
     *
     * @param manualResolution the manualResolution value to set
     * @return the MoveResourceDependency object itself.
     */
    public MoveResourceDependency withManualResolution(ManualResolutionProperties manualResolution) {
        this.manualResolution = manualResolution;
        return this;
    }

    /**
     * Get the automaticResolution value.
     *
     * @return the automaticResolution value
     */
    public AutomaticResolutionProperties automaticResolution() {
        return this.automaticResolution;
    }

    /**
     * Set the automaticResolution value.
     *
     * @param automaticResolution the automaticResolution value to set
     * @return the MoveResourceDependency object itself.
     */
    public MoveResourceDependency withAutomaticResolution(AutomaticResolutionProperties automaticResolution) {
        this.automaticResolution = automaticResolution;
        return this;
    }

    /**
     * Get gets or sets a value indicating whether the dependency is optional.
     *
     * @return the isOptional value
     */
    public String isOptional() {
        return this.isOptional;
    }

    /**
     * Set gets or sets a value indicating whether the dependency is optional.
     *
     * @param isOptional the isOptional value to set
     * @return the MoveResourceDependency object itself.
     */
    public MoveResourceDependency withIsOptional(String isOptional) {
        this.isOptional = isOptional;
        return this;
    }

}
