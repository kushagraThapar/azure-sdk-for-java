/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Xml source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = XmlSource.class)
@JsonTypeName("XmlSource")
public class XmlSource extends CopySource {
    /**
     * Xml store settings.
     */
    @JsonProperty(value = "storeSettings")
    private StoreReadSettings storeSettings;

    /**
     * Xml format settings.
     */
    @JsonProperty(value = "formatSettings")
    private XmlReadSettings formatSettings;

    /**
     * Specifies the additional columns to be added to source data. Type: array
     * of objects (or Expression with resultType array of objects).
     */
    @JsonProperty(value = "additionalColumns")
    private List<AdditionalColumns> additionalColumns;

    /**
     * Get xml store settings.
     *
     * @return the storeSettings value
     */
    public StoreReadSettings storeSettings() {
        return this.storeSettings;
    }

    /**
     * Set xml store settings.
     *
     * @param storeSettings the storeSettings value to set
     * @return the XmlSource object itself.
     */
    public XmlSource withStoreSettings(StoreReadSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get xml format settings.
     *
     * @return the formatSettings value
     */
    public XmlReadSettings formatSettings() {
        return this.formatSettings;
    }

    /**
     * Set xml format settings.
     *
     * @param formatSettings the formatSettings value to set
     * @return the XmlSource object itself.
     */
    public XmlSource withFormatSettings(XmlReadSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }

    /**
     * Get specifies the additional columns to be added to source data. Type: array of objects (or Expression with resultType array of objects).
     *
     * @return the additionalColumns value
     */
    public List<AdditionalColumns> additionalColumns() {
        return this.additionalColumns;
    }

    /**
     * Set specifies the additional columns to be added to source data. Type: array of objects (or Expression with resultType array of objects).
     *
     * @param additionalColumns the additionalColumns value to set
     * @return the XmlSource object itself.
     */
    public XmlSource withAdditionalColumns(List<AdditionalColumns> additionalColumns) {
        this.additionalColumns = additionalColumns;
        return this;
    }

}
