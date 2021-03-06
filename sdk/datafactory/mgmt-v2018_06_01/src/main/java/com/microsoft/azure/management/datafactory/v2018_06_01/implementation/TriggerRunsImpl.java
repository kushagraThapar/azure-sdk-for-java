/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datafactory.v2018_06_01.TriggerRuns;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.datafactory.v2018_06_01.TriggerRunsQueryResponse;
import com.microsoft.azure.management.datafactory.v2018_06_01.RunFilterParameters;

class TriggerRunsImpl extends WrapperImpl<TriggerRunsInner> implements TriggerRuns {
    private final DataFactoryManager manager;

    TriggerRunsImpl(DataFactoryManager manager) {
        super(manager.inner().triggerRuns());
        this.manager = manager;
    }

    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public Completable rerunAsync(String resourceGroupName, String factoryName, String triggerName, String runId) {
        TriggerRunsInner client = this.inner();
        return client.rerunAsync(resourceGroupName, factoryName, triggerName, runId).toCompletable();
    }

    @Override
    public Completable cancelAsync(String resourceGroupName, String factoryName, String triggerName, String runId) {
        TriggerRunsInner client = this.inner();
        return client.cancelAsync(resourceGroupName, factoryName, triggerName, runId).toCompletable();
    }

    @Override
    public Observable<TriggerRunsQueryResponse> queryByFactoryAsync(String resourceGroupName, String factoryName, RunFilterParameters filterParameters) {
        TriggerRunsInner client = this.inner();
        return client.queryByFactoryAsync(resourceGroupName, factoryName, filterParameters)
        .map(new Func1<TriggerRunsQueryResponseInner, TriggerRunsQueryResponse>() {
            @Override
            public TriggerRunsQueryResponse call(TriggerRunsQueryResponseInner inner) {
                return new TriggerRunsQueryResponseImpl(inner, manager());
            }
        });
    }

}
