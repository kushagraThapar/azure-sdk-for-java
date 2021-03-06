// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents resource specific settings. */
@Fluent
public final class ResourceSettingCreationParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceSettingCreationParameters.class);

    /*
     * The location where the virtual machine will live
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * The name of the resource setting
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The resource id of the gallery image used for creating the virtual
     * machine
     */
    @JsonProperty(value = "galleryImageResourceId", required = true)
    private String galleryImageResourceId;

    /*
     * The size of the virtual machine
     */
    @JsonProperty(value = "size")
    private ManagedLabVmSize size;

    /*
     * Creation parameters for Reference Vm
     */
    @JsonProperty(value = "referenceVmCreationParameters", required = true)
    private ReferenceVmCreationParameters referenceVmCreationParameters;

    /**
     * Get the location property: The location where the virtual machine will live.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location where the virtual machine will live.
     *
     * @param location the location value to set.
     * @return the ResourceSettingCreationParameters object itself.
     */
    public ResourceSettingCreationParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the name property: The name of the resource setting.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource setting.
     *
     * @param name the name value to set.
     * @return the ResourceSettingCreationParameters object itself.
     */
    public ResourceSettingCreationParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the galleryImageResourceId property: The resource id of the gallery image used for creating the virtual
     * machine.
     *
     * @return the galleryImageResourceId value.
     */
    public String galleryImageResourceId() {
        return this.galleryImageResourceId;
    }

    /**
     * Set the galleryImageResourceId property: The resource id of the gallery image used for creating the virtual
     * machine.
     *
     * @param galleryImageResourceId the galleryImageResourceId value to set.
     * @return the ResourceSettingCreationParameters object itself.
     */
    public ResourceSettingCreationParameters withGalleryImageResourceId(String galleryImageResourceId) {
        this.galleryImageResourceId = galleryImageResourceId;
        return this;
    }

    /**
     * Get the size property: The size of the virtual machine.
     *
     * @return the size value.
     */
    public ManagedLabVmSize size() {
        return this.size;
    }

    /**
     * Set the size property: The size of the virtual machine.
     *
     * @param size the size value to set.
     * @return the ResourceSettingCreationParameters object itself.
     */
    public ResourceSettingCreationParameters withSize(ManagedLabVmSize size) {
        this.size = size;
        return this;
    }

    /**
     * Get the referenceVmCreationParameters property: Creation parameters for Reference Vm.
     *
     * @return the referenceVmCreationParameters value.
     */
    public ReferenceVmCreationParameters referenceVmCreationParameters() {
        return this.referenceVmCreationParameters;
    }

    /**
     * Set the referenceVmCreationParameters property: Creation parameters for Reference Vm.
     *
     * @param referenceVmCreationParameters the referenceVmCreationParameters value to set.
     * @return the ResourceSettingCreationParameters object itself.
     */
    public ResourceSettingCreationParameters withReferenceVmCreationParameters(
        ReferenceVmCreationParameters referenceVmCreationParameters) {
        this.referenceVmCreationParameters = referenceVmCreationParameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (galleryImageResourceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property galleryImageResourceId in model ResourceSettingCreationParameters"));
        }
        if (referenceVmCreationParameters() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property referenceVmCreationParameters in model"
                            + " ResourceSettingCreationParameters"));
        } else {
            referenceVmCreationParameters().validate();
        }
    }
}
