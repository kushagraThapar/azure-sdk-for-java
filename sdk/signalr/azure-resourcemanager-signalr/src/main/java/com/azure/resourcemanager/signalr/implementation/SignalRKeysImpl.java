// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.implementation;

import com.azure.resourcemanager.signalr.fluent.models.SignalRKeysInner;
import com.azure.resourcemanager.signalr.models.SignalRKeys;

public final class SignalRKeysImpl implements SignalRKeys {
    private SignalRKeysInner innerObject;

    private final com.azure.resourcemanager.signalr.SignalRManager serviceManager;

    SignalRKeysImpl(SignalRKeysInner innerObject, com.azure.resourcemanager.signalr.SignalRManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String primaryKey() {
        return this.innerModel().primaryKey();
    }

    public String secondaryKey() {
        return this.innerModel().secondaryKey();
    }

    public String primaryConnectionString() {
        return this.innerModel().primaryConnectionString();
    }

    public String secondaryConnectionString() {
        return this.innerModel().secondaryConnectionString();
    }

    public SignalRKeysInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.signalr.SignalRManager manager() {
        return this.serviceManager;
    }
}
