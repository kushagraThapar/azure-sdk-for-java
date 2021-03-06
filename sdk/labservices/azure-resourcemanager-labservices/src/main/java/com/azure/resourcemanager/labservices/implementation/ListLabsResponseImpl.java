// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.implementation;

import com.azure.resourcemanager.labservices.fluent.models.ListLabsResponseInner;
import com.azure.resourcemanager.labservices.models.LabDetails;
import com.azure.resourcemanager.labservices.models.ListLabsResponse;
import java.util.Collections;
import java.util.List;

public final class ListLabsResponseImpl implements ListLabsResponse {
    private ListLabsResponseInner innerObject;

    private final com.azure.resourcemanager.labservices.ManagedLabsManager serviceManager;

    ListLabsResponseImpl(
        ListLabsResponseInner innerObject, com.azure.resourcemanager.labservices.ManagedLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<LabDetails> labs() {
        List<LabDetails> inner = this.innerModel().labs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ListLabsResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.labservices.ManagedLabsManager manager() {
        return this.serviceManager;
    }
}
