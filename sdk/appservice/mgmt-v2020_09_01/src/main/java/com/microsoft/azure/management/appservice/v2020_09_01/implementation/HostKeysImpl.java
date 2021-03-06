/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import com.microsoft.azure.management.appservice.v2020_09_01.HostKeys;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.Map;

class HostKeysImpl extends WrapperImpl<HostKeysInner> implements HostKeys {
    private final AppServiceManager manager;
    HostKeysImpl(HostKeysInner inner, AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public Map<String, String> functionKeys() {
        return this.inner().functionKeys();
    }

    @Override
    public String masterKey() {
        return this.inner().masterKey();
    }

    @Override
    public Map<String, String> systemKeys() {
        return this.inner().systemKeys();
    }

}
