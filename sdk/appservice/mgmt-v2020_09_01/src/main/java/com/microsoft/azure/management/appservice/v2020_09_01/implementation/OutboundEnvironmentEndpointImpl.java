/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import com.microsoft.azure.management.appservice.v2020_09_01.OutboundEnvironmentEndpoint;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.appservice.v2020_09_01.EndpointDependency;

class OutboundEnvironmentEndpointImpl extends WrapperImpl<OutboundEnvironmentEndpointInner> implements OutboundEnvironmentEndpoint {
    private final AppServiceManager manager;

    OutboundEnvironmentEndpointImpl(OutboundEnvironmentEndpointInner inner,  AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }



    @Override
    public String category() {
        return this.inner().category();
    }

    @Override
    public List<EndpointDependency> endpoints() {
        return this.inner().endpoints();
    }

}
