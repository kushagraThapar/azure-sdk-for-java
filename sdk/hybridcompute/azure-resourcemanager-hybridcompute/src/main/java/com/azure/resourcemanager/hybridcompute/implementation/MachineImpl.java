// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.hybridcompute.fluent.models.MachineInner;
import com.azure.resourcemanager.hybridcompute.models.Identity;
import com.azure.resourcemanager.hybridcompute.models.Machine;
import com.azure.resourcemanager.hybridcompute.models.MachineProperties;
import java.util.Collections;
import java.util.Map;

public final class MachineImpl implements Machine {
    private MachineInner innerObject;

    private final com.azure.resourcemanager.hybridcompute.HybridComputeManager serviceManager;

    MachineImpl(MachineInner innerObject, com.azure.resourcemanager.hybridcompute.HybridComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public MachineProperties properties() {
        return this.innerModel().properties();
    }

    public Identity identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public MachineInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybridcompute.HybridComputeManager manager() {
        return this.serviceManager;
    }
}
