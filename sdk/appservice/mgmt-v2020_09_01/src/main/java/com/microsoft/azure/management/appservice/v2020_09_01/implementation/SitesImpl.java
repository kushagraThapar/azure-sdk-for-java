/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.appservice.v2020_09_01.Sites;
import rx.Observable;
import com.microsoft.azure.management.appservice.v2020_09_01.SitePatchResource;
import java.util.List;
import org.joda.time.DateTime;
import java.util.UUID;
import com.microsoft.azure.management.appservice.v2020_09_01.SystemData;
import com.microsoft.azure.management.appservice.v2020_09_01.UsageState;
import com.microsoft.azure.management.appservice.v2020_09_01.SiteAvailabilityState;
import com.microsoft.azure.management.appservice.v2020_09_01.HostNameSslState;
import com.microsoft.azure.management.appservice.v2020_09_01.SiteConfig;
import com.microsoft.azure.management.appservice.v2020_09_01.HostingEnvironmentProfile;
import com.microsoft.azure.management.appservice.v2020_09_01.ClientCertMode;
import com.microsoft.azure.management.appservice.v2020_09_01.CloningInfo;
import com.microsoft.azure.management.appservice.v2020_09_01.SlotSwapStatus;
import com.microsoft.azure.management.appservice.v2020_09_01.RedundancyMode;
import com.microsoft.azure.management.appservice.v2020_09_01.ManagedServiceIdentity;
import rx.functions.Func1;

class SitesImpl extends GroupableResourceCoreImpl<Sites, SiteInner, SitesImpl, AppServiceManager> implements Sites, Sites.Definition, Sites.Update {
    private SitePatchResource updateParameter;
    SitesImpl(String name, SiteInner inner, AppServiceManager manager) {
        super(name, inner, manager);
        this.updateParameter = new SitePatchResource();
    }

    @Override
    public Observable<Sites> createResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<SiteInner, SiteInner>() {
               @Override
               public SiteInner call(SiteInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Sites> updateResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<SiteInner, SiteInner>() {
               @Override
               public SiteInner call(SiteInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SiteInner> getInnerAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new SitePatchResource();
    }

    @Override
    public SiteAvailabilityState availabilityState() {
        return this.inner().availabilityState();
    }

    @Override
    public Boolean clientAffinityEnabled() {
        return this.inner().clientAffinityEnabled();
    }

    @Override
    public Boolean clientCertEnabled() {
        return this.inner().clientCertEnabled();
    }

    @Override
    public String clientCertExclusionPaths() {
        return this.inner().clientCertExclusionPaths();
    }

    @Override
    public ClientCertMode clientCertMode() {
        return this.inner().clientCertMode();
    }

    @Override
    public CloningInfo cloningInfo() {
        return this.inner().cloningInfo();
    }

    @Override
    public Integer containerSize() {
        return this.inner().containerSize();
    }

    @Override
    public String customDomainVerificationId() {
        return this.inner().customDomainVerificationId();
    }

    @Override
    public Integer dailyMemoryTimeQuota() {
        return this.inner().dailyMemoryTimeQuota();
    }

    @Override
    public String defaultHostName() {
        return this.inner().defaultHostName();
    }

    @Override
    public Boolean enabled() {
        return this.inner().enabled();
    }

    @Override
    public List<String> enabledHostNames() {
        return this.inner().enabledHostNames();
    }

    @Override
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.inner().hostingEnvironmentProfile();
    }

    @Override
    public List<String> hostNames() {
        return this.inner().hostNames();
    }

    @Override
    public Boolean hostNamesDisabled() {
        return this.inner().hostNamesDisabled();
    }

    @Override
    public List<HostNameSslState> hostNameSslStates() {
        return this.inner().hostNameSslStates();
    }

    @Override
    public Boolean httpsOnly() {
        return this.inner().httpsOnly();
    }

    @Override
    public Boolean hyperV() {
        return this.inner().hyperV();
    }

    @Override
    public ManagedServiceIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public UUID inProgressOperationId() {
        return this.inner().inProgressOperationId();
    }

    @Override
    public Boolean isDefaultContainer() {
        return this.inner().isDefaultContainer();
    }

    @Override
    public Boolean isXenon() {
        return this.inner().isXenon();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public DateTime lastModifiedTimeUtc() {
        return this.inner().lastModifiedTimeUtc();
    }

    @Override
    public Integer maxNumberOfWorkers() {
        return this.inner().maxNumberOfWorkers();
    }

    @Override
    public String outboundIpAddresses() {
        return this.inner().outboundIpAddresses();
    }

    @Override
    public String possibleOutboundIpAddresses() {
        return this.inner().possibleOutboundIpAddresses();
    }

    @Override
    public RedundancyMode redundancyMode() {
        return this.inner().redundancyMode();
    }

    @Override
    public String repositorySiteName() {
        return this.inner().repositorySiteName();
    }

    @Override
    public Boolean reserved() {
        return this.inner().reserved();
    }

    @Override
    public String resourceGroup() {
        return this.inner().resourceGroup();
    }

    @Override
    public Boolean scmSiteAlsoStopped() {
        return this.inner().scmSiteAlsoStopped();
    }

    @Override
    public String serverFarmId() {
        return this.inner().serverFarmId();
    }

    @Override
    public SiteConfig siteConfig() {
        return this.inner().siteConfig();
    }

    @Override
    public SlotSwapStatus slotSwapStatus() {
        return this.inner().slotSwapStatus();
    }

    @Override
    public String state() {
        return this.inner().state();
    }

    @Override
    public DateTime suspendedTill() {
        return this.inner().suspendedTill();
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public String targetSwapSlot() {
        return this.inner().targetSwapSlot();
    }

    @Override
    public List<String> trafficManagerHostNames() {
        return this.inner().trafficManagerHostNames();
    }

    @Override
    public UsageState usageState() {
        return this.inner().usageState();
    }

    @Override
    public SitesImpl withClientAffinityEnabled(Boolean clientAffinityEnabled) {
        if (isInCreateMode()) {
            this.inner().withClientAffinityEnabled(clientAffinityEnabled);
        } else {
            this.updateParameter.withClientAffinityEnabled(clientAffinityEnabled);
        }
        return this;
    }

    @Override
    public SitesImpl withClientCertEnabled(Boolean clientCertEnabled) {
        if (isInCreateMode()) {
            this.inner().withClientCertEnabled(clientCertEnabled);
        } else {
            this.updateParameter.withClientCertEnabled(clientCertEnabled);
        }
        return this;
    }

    @Override
    public SitesImpl withClientCertExclusionPaths(String clientCertExclusionPaths) {
        if (isInCreateMode()) {
            this.inner().withClientCertExclusionPaths(clientCertExclusionPaths);
        } else {
            this.updateParameter.withClientCertExclusionPaths(clientCertExclusionPaths);
        }
        return this;
    }

    @Override
    public SitesImpl withClientCertMode(ClientCertMode clientCertMode) {
        if (isInCreateMode()) {
            this.inner().withClientCertMode(clientCertMode);
        } else {
            this.updateParameter.withClientCertMode(clientCertMode);
        }
        return this;
    }

    @Override
    public SitesImpl withCloningInfo(CloningInfo cloningInfo) {
        if (isInCreateMode()) {
            this.inner().withCloningInfo(cloningInfo);
        } else {
            this.updateParameter.withCloningInfo(cloningInfo);
        }
        return this;
    }

    @Override
    public SitesImpl withContainerSize(Integer containerSize) {
        if (isInCreateMode()) {
            this.inner().withContainerSize(containerSize);
        } else {
            this.updateParameter.withContainerSize(containerSize);
        }
        return this;
    }

    @Override
    public SitesImpl withCustomDomainVerificationId(String customDomainVerificationId) {
        if (isInCreateMode()) {
            this.inner().withCustomDomainVerificationId(customDomainVerificationId);
        } else {
            this.updateParameter.withCustomDomainVerificationId(customDomainVerificationId);
        }
        return this;
    }

    @Override
    public SitesImpl withDailyMemoryTimeQuota(Integer dailyMemoryTimeQuota) {
        if (isInCreateMode()) {
            this.inner().withDailyMemoryTimeQuota(dailyMemoryTimeQuota);
        } else {
            this.updateParameter.withDailyMemoryTimeQuota(dailyMemoryTimeQuota);
        }
        return this;
    }

    @Override
    public SitesImpl withEnabled(Boolean enabled) {
        if (isInCreateMode()) {
            this.inner().withEnabled(enabled);
        } else {
            this.updateParameter.withEnabled(enabled);
        }
        return this;
    }

    @Override
    public SitesImpl withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        if (isInCreateMode()) {
            this.inner().withHostingEnvironmentProfile(hostingEnvironmentProfile);
        } else {
            this.updateParameter.withHostingEnvironmentProfile(hostingEnvironmentProfile);
        }
        return this;
    }

    @Override
    public SitesImpl withHostNamesDisabled(Boolean hostNamesDisabled) {
        if (isInCreateMode()) {
            this.inner().withHostNamesDisabled(hostNamesDisabled);
        } else {
            this.updateParameter.withHostNamesDisabled(hostNamesDisabled);
        }
        return this;
    }

    @Override
    public SitesImpl withHostNameSslStates(List<HostNameSslState> hostNameSslStates) {
        if (isInCreateMode()) {
            this.inner().withHostNameSslStates(hostNameSslStates);
        } else {
            this.updateParameter.withHostNameSslStates(hostNameSslStates);
        }
        return this;
    }

    @Override
    public SitesImpl withHttpsOnly(Boolean httpsOnly) {
        if (isInCreateMode()) {
            this.inner().withHttpsOnly(httpsOnly);
        } else {
            this.updateParameter.withHttpsOnly(httpsOnly);
        }
        return this;
    }

    @Override
    public SitesImpl withHyperV(Boolean hyperV) {
        if (isInCreateMode()) {
            this.inner().withHyperV(hyperV);
        } else {
            this.updateParameter.withHyperV(hyperV);
        }
        return this;
    }

    @Override
    public SitesImpl withIdentity(ManagedServiceIdentity identity) {
        if (isInCreateMode()) {
            this.inner().withIdentity(identity);
        } else {
            this.updateParameter.withIdentity(identity);
        }
        return this;
    }

    @Override
    public SitesImpl withIsXenon(Boolean isXenon) {
        if (isInCreateMode()) {
            this.inner().withIsXenon(isXenon);
        } else {
            this.updateParameter.withIsXenon(isXenon);
        }
        return this;
    }

    @Override
    public SitesImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.inner().withKind(kind);
        } else {
            this.updateParameter.withKind(kind);
        }
        return this;
    }

    @Override
    public SitesImpl withRedundancyMode(RedundancyMode redundancyMode) {
        if (isInCreateMode()) {
            this.inner().withRedundancyMode(redundancyMode);
        } else {
            this.updateParameter.withRedundancyMode(redundancyMode);
        }
        return this;
    }

    @Override
    public SitesImpl withReserved(Boolean reserved) {
        if (isInCreateMode()) {
            this.inner().withReserved(reserved);
        } else {
            this.updateParameter.withReserved(reserved);
        }
        return this;
    }

    @Override
    public SitesImpl withScmSiteAlsoStopped(Boolean scmSiteAlsoStopped) {
        if (isInCreateMode()) {
            this.inner().withScmSiteAlsoStopped(scmSiteAlsoStopped);
        } else {
            this.updateParameter.withScmSiteAlsoStopped(scmSiteAlsoStopped);
        }
        return this;
    }

    @Override
    public SitesImpl withServerFarmId(String serverFarmId) {
        if (isInCreateMode()) {
            this.inner().withServerFarmId(serverFarmId);
        } else {
            this.updateParameter.withServerFarmId(serverFarmId);
        }
        return this;
    }

    @Override
    public SitesImpl withSiteConfig(SiteConfig siteConfig) {
        if (isInCreateMode()) {
            this.inner().withSiteConfig(siteConfig);
        } else {
            this.updateParameter.withSiteConfig(siteConfig);
        }
        return this;
    }

    @Override
    public SitesImpl withSystemData(SystemData systemData) {
        if (isInCreateMode()) {
            this.inner().withSystemData(systemData);
        } else {
            this.updateParameter.withSystemData(systemData);
        }
        return this;
    }

}
