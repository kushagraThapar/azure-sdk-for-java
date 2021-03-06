// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/** licenseDetails. */
@Fluent
public final class MicrosoftGraphLicenseDetailsInner extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphLicenseDetailsInner.class);

    /*
     * Information about the service plans assigned with the license.
     * Read-only, Not nullable
     */
    @JsonProperty(value = "servicePlans")
    private List<MicrosoftGraphServicePlanInfo> servicePlans;

    /*
     * Unique identifier (GUID) for the service SKU. Equal to the skuId
     * property on the related SubscribedSku object. Read-only
     */
    @JsonProperty(value = "skuId")
    private UUID skuId;

    /*
     * Unique SKU display name. Equal to the skuPartNumber on the related
     * SubscribedSku object; for example: 'AAD_Premium'. Read-only
     */
    @JsonProperty(value = "skuPartNumber")
    private String skuPartNumber;

    /*
     * licenseDetails
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the servicePlans property: Information about the service plans assigned with the license. Read-only, Not
     * nullable.
     *
     * @return the servicePlans value.
     */
    public List<MicrosoftGraphServicePlanInfo> servicePlans() {
        return this.servicePlans;
    }

    /**
     * Set the servicePlans property: Information about the service plans assigned with the license. Read-only, Not
     * nullable.
     *
     * @param servicePlans the servicePlans value to set.
     * @return the MicrosoftGraphLicenseDetailsInner object itself.
     */
    public MicrosoftGraphLicenseDetailsInner withServicePlans(List<MicrosoftGraphServicePlanInfo> servicePlans) {
        this.servicePlans = servicePlans;
        return this;
    }

    /**
     * Get the skuId property: Unique identifier (GUID) for the service SKU. Equal to the skuId property on the related
     * SubscribedSku object. Read-only.
     *
     * @return the skuId value.
     */
    public UUID skuId() {
        return this.skuId;
    }

    /**
     * Set the skuId property: Unique identifier (GUID) for the service SKU. Equal to the skuId property on the related
     * SubscribedSku object. Read-only.
     *
     * @param skuId the skuId value to set.
     * @return the MicrosoftGraphLicenseDetailsInner object itself.
     */
    public MicrosoftGraphLicenseDetailsInner withSkuId(UUID skuId) {
        this.skuId = skuId;
        return this;
    }

    /**
     * Get the skuPartNumber property: Unique SKU display name. Equal to the skuPartNumber on the related SubscribedSku
     * object; for example: 'AAD_Premium'. Read-only.
     *
     * @return the skuPartNumber value.
     */
    public String skuPartNumber() {
        return this.skuPartNumber;
    }

    /**
     * Set the skuPartNumber property: Unique SKU display name. Equal to the skuPartNumber on the related SubscribedSku
     * object; for example: 'AAD_Premium'. Read-only.
     *
     * @param skuPartNumber the skuPartNumber value to set.
     * @return the MicrosoftGraphLicenseDetailsInner object itself.
     */
    public MicrosoftGraphLicenseDetailsInner withSkuPartNumber(String skuPartNumber) {
        this.skuPartNumber = skuPartNumber;
        return this;
    }

    /**
     * Get the additionalProperties property: licenseDetails.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: licenseDetails.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphLicenseDetailsInner object itself.
     */
    public MicrosoftGraphLicenseDetailsInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphLicenseDetailsInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (servicePlans() != null) {
            servicePlans().forEach(e -> e.validate());
        }
    }
}
