/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.StreamingJobs;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.StreamingJob;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class StreamingJobsImpl extends GroupableResourcesCoreImpl<StreamingJob, StreamingJobImpl, StreamingJobInner, StreamingJobsInner, StreamAnalyticsManager>  implements StreamingJobs {
    protected StreamingJobsImpl(StreamAnalyticsManager manager) {
        super(manager.inner().streamingJobs(), manager);
    }

    @Override
    protected Observable<StreamingJobInner> getInnerAsync(String resourceGroupName, String name) {
        StreamingJobsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        StreamingJobsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<StreamingJob> listByResourceGroup(String resourceGroupName) {
        StreamingJobsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<StreamingJob> listByResourceGroupAsync(String resourceGroupName) {
        StreamingJobsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<StreamingJobInner>, Iterable<StreamingJobInner>>() {
            @Override
            public Iterable<StreamingJobInner> call(Page<StreamingJobInner> page) {
                return page.items();
            }
        })
        .map(new Func1<StreamingJobInner, StreamingJob>() {
            @Override
            public StreamingJob call(StreamingJobInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<StreamingJob> list() {
        StreamingJobsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<StreamingJob> listAsync() {
        StreamingJobsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<StreamingJobInner>, Iterable<StreamingJobInner>>() {
            @Override
            public Iterable<StreamingJobInner> call(Page<StreamingJobInner> page) {
                return page.items();
            }
        })
        .map(new Func1<StreamingJobInner, StreamingJob>() {
            @Override
            public StreamingJob call(StreamingJobInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public StreamingJobImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Completable startAsync(String resourceGroupName, String jobName) {
        StreamingJobsInner client = this.inner();
        return client.startAsync(resourceGroupName, jobName).toCompletable();
    }

    @Override
    public Completable stopAsync(String resourceGroupName, String jobName) {
        StreamingJobsInner client = this.inner();
        return client.stopAsync(resourceGroupName, jobName).toCompletable();
    }

    @Override
    protected StreamingJobImpl wrapModel(StreamingJobInner inner) {
        return  new StreamingJobImpl(inner.name(), inner, manager());
    }

    @Override
    protected StreamingJobImpl wrapModel(String name) {
        return new StreamingJobImpl(name, new StreamingJobInner(), this.manager());
    }

}
