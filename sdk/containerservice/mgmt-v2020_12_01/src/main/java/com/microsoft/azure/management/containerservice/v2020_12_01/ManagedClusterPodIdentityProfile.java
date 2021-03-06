/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ManagedClusterPodIdentityProfile model.
 */
public class ManagedClusterPodIdentityProfile {
    /**
     * Whether the pod identity addon is enabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * User assigned pod identity settings.
     */
    @JsonProperty(value = "userAssignedIdentities")
    private List<ManagedClusterPodIdentity> userAssignedIdentities;

    /**
     * User assigned pod identity exception settings.
     */
    @JsonProperty(value = "userAssignedIdentityExceptions")
    private List<ManagedClusterPodIdentityException> userAssignedIdentityExceptions;

    /**
     * Get whether the pod identity addon is enabled.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set whether the pod identity addon is enabled.
     *
     * @param enabled the enabled value to set
     * @return the ManagedClusterPodIdentityProfile object itself.
     */
    public ManagedClusterPodIdentityProfile withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get user assigned pod identity settings.
     *
     * @return the userAssignedIdentities value
     */
    public List<ManagedClusterPodIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set user assigned pod identity settings.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set
     * @return the ManagedClusterPodIdentityProfile object itself.
     */
    public ManagedClusterPodIdentityProfile withUserAssignedIdentities(List<ManagedClusterPodIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Get user assigned pod identity exception settings.
     *
     * @return the userAssignedIdentityExceptions value
     */
    public List<ManagedClusterPodIdentityException> userAssignedIdentityExceptions() {
        return this.userAssignedIdentityExceptions;
    }

    /**
     * Set user assigned pod identity exception settings.
     *
     * @param userAssignedIdentityExceptions the userAssignedIdentityExceptions value to set
     * @return the ManagedClusterPodIdentityProfile object itself.
     */
    public ManagedClusterPodIdentityProfile withUserAssignedIdentityExceptions(List<ManagedClusterPodIdentityException> userAssignedIdentityExceptions) {
        this.userAssignedIdentityExceptions = userAssignedIdentityExceptions;
        return this;
    }

}
