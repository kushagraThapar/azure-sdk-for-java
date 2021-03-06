/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybridcompute.v2019_12_12;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the Machine Extension Instance View.
 */
public class MachineExtensionInstanceView {
    /**
     * The machine extension name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Specifies the type of the extension; an example is
     * "CustomScriptExtension".
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Specifies the version of the script handler.
     */
    @JsonProperty(value = "typeHandlerVersion")
    private String typeHandlerVersion;

    /**
     * Instance view status.
     */
    @JsonProperty(value = "status")
    private MachineExtensionInstanceViewStatus status;

    /**
     * Get the machine extension name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the machine extension name.
     *
     * @param name the name value to set
     * @return the MachineExtensionInstanceView object itself.
     */
    public MachineExtensionInstanceView withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @param type the type value to set
     * @return the MachineExtensionInstanceView object itself.
     */
    public MachineExtensionInstanceView withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get specifies the version of the script handler.
     *
     * @return the typeHandlerVersion value
     */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set specifies the version of the script handler.
     *
     * @param typeHandlerVersion the typeHandlerVersion value to set
     * @return the MachineExtensionInstanceView object itself.
     */
    public MachineExtensionInstanceView withTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
        return this;
    }

    /**
     * Get instance view status.
     *
     * @return the status value
     */
    public MachineExtensionInstanceViewStatus status() {
        return this.status;
    }

    /**
     * Set instance view status.
     *
     * @param status the status value to set
     * @return the MachineExtensionInstanceView object itself.
     */
    public MachineExtensionInstanceView withStatus(MachineExtensionInstanceViewStatus status) {
        this.status = status;
        return this;
    }

}
