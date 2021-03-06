/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2018_11_01.VirtualWAN;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2018_11_01.OfficeTrafficCategory;
import com.microsoft.azure.management.network.v2018_11_01.ProvisioningState;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2018_11_01.P2SVpnServerConfiguration;

class VirtualWANImpl extends GroupableResourceCoreImpl<VirtualWAN, VirtualWANInner, VirtualWANImpl, NetworkManager> implements VirtualWAN, VirtualWAN.Definition, VirtualWAN.Update {
    VirtualWANImpl(String name, VirtualWANInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<VirtualWAN> createResourceAsync() {
        VirtualWansInner client = this.manager().inner().virtualWans();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualWAN> updateResourceAsync() {
        VirtualWansInner client = this.manager().inner().virtualWans();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualWANInner> getInnerAsync() {
        VirtualWansInner client = this.manager().inner().virtualWans();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public Boolean allowBranchToBranchTraffic() {
        return this.inner().allowBranchToBranchTraffic();
    }

    @Override
    public Boolean allowVnetToVnetTraffic() {
        return this.inner().allowVnetToVnetTraffic();
    }

    @Override
    public Boolean disableVpnEncryption() {
        return this.inner().disableVpnEncryption();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public OfficeTrafficCategory office365LocalBreakoutCategory() {
        return this.inner().office365LocalBreakoutCategory();
    }

    @Override
    public List<P2SVpnServerConfiguration> p2SVpnServerConfigurations() {
        List<P2SVpnServerConfiguration> lst = new ArrayList<P2SVpnServerConfiguration>();
        if (this.inner().p2SVpnServerConfigurations() != null) {
            for (P2SVpnServerConfigurationInner inner : this.inner().p2SVpnServerConfigurations()) {
                lst.add( new P2SVpnServerConfigurationImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String securityProviderName() {
        return this.inner().securityProviderName();
    }

    @Override
    public List<SubResource> virtualHubs() {
        return this.inner().virtualHubs();
    }

    @Override
    public List<SubResource> vpnSites() {
        return this.inner().vpnSites();
    }

    @Override
    public VirtualWANImpl withAllowBranchToBranchTraffic(Boolean allowBranchToBranchTraffic) {
        this.inner().withAllowBranchToBranchTraffic(allowBranchToBranchTraffic);
        return this;
    }

    @Override
    public VirtualWANImpl withAllowVnetToVnetTraffic(Boolean allowVnetToVnetTraffic) {
        this.inner().withAllowVnetToVnetTraffic(allowVnetToVnetTraffic);
        return this;
    }

    @Override
    public VirtualWANImpl withDisableVpnEncryption(Boolean disableVpnEncryption) {
        this.inner().withDisableVpnEncryption(disableVpnEncryption);
        return this;
    }

    @Override
    public VirtualWANImpl withOffice365LocalBreakoutCategory(OfficeTrafficCategory office365LocalBreakoutCategory) {
        this.inner().withOffice365LocalBreakoutCategory(office365LocalBreakoutCategory);
        return this;
    }

    @Override
    public VirtualWANImpl withP2SVpnServerConfigurations(List<P2SVpnServerConfigurationInner> p2SVpnServerConfigurations) {
        this.inner().withP2SVpnServerConfigurations(p2SVpnServerConfigurations);
        return this;
    }

    @Override
    public VirtualWANImpl withProvisioningState(ProvisioningState provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

    @Override
    public VirtualWANImpl withSecurityProviderName(String securityProviderName) {
        this.inner().withSecurityProviderName(securityProviderName);
        return this;
    }

}
