/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_30.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.healthcareapis.v2020_03_30.ServicesDescription;
import rx.Observable;
import com.microsoft.azure.management.healthcareapis.v2020_03_30.ServicesPatchDescription;
import com.microsoft.azure.management.healthcareapis.v2020_03_30.Kind;
import com.microsoft.azure.management.healthcareapis.v2020_03_30.ServicesResourceIdentity;
import com.microsoft.azure.management.healthcareapis.v2020_03_30.ServicesProperties;
import com.microsoft.azure.management.healthcareapis.v2020_03_30.PublicNetworkAccess;
import rx.functions.Func1;

class ServicesDescriptionImpl extends GroupableResourceCoreImpl<ServicesDescription, ServicesDescriptionInner, ServicesDescriptionImpl, HealthcareApisManager> implements ServicesDescription, ServicesDescription.Definition, ServicesDescription.Update {
    private ServicesPatchDescription updateParameter;
    ServicesDescriptionImpl(String name, ServicesDescriptionInner inner, HealthcareApisManager manager) {
        super(name, inner, manager);
        this.updateParameter = new ServicesPatchDescription();
    }

    @Override
    public Observable<ServicesDescription> createResourceAsync() {
        ServicesInner client = this.manager().inner().services();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<ServicesDescriptionInner, ServicesDescriptionInner>() {
               @Override
               public ServicesDescriptionInner call(ServicesDescriptionInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ServicesDescription> updateResourceAsync() {
        ServicesInner client = this.manager().inner().services();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<ServicesDescriptionInner, ServicesDescriptionInner>() {
               @Override
               public ServicesDescriptionInner call(ServicesDescriptionInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ServicesDescriptionInner> getInnerAsync() {
        ServicesInner client = this.manager().inner().services();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ServicesPatchDescription();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public ServicesResourceIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public Kind kind() {
        return this.inner().kind();
    }

    @Override
    public ServicesProperties properties() {
        return this.inner().properties();
    }

    @Override
    public ServicesDescriptionImpl withKind(Kind kind) {
        this.inner().withKind(kind);
        return this;
    }

    @Override
    public ServicesDescriptionImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public ServicesDescriptionImpl withIdentity(ServicesResourceIdentity identity) {
        this.inner().withIdentity(identity);
        return this;
    }

    @Override
    public ServicesDescriptionImpl withProperties(ServicesProperties properties) {
        this.inner().withProperties(properties);
        return this;
    }

    @Override
    public ServicesDescriptionImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.updateParameter.withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

}
