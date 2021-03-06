/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties related to a storage container endpoint.
 */
public class RoutingStorageContainerProperties {
    /**
     * The connection string of the storage account.
     */
    @JsonProperty(value = "connectionString", required = true)
    private String connectionString;

    /**
     * The name that identifies this endpoint. The name can only include
     * alphanumeric characters, periods, underscores, hyphens and has a maximum
     * length of 64 characters. The following names are reserved:  events,
     * fileNotifications, $default. Endpoint names must be unique across
     * endpoint types.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The subscription identifier of the storage account.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /**
     * The name of the resource group of the storage account.
     */
    @JsonProperty(value = "resourceGroup")
    private String resourceGroup;

    /**
     * The name of storage container in the storage account.
     */
    @JsonProperty(value = "containerName", required = true)
    private String containerName;

    /**
     * File name format for the blob. Default format is
     * {iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}. All parameters are
     * mandatory but can be reordered.
     */
    @JsonProperty(value = "fileNameFormat")
    private String fileNameFormat;

    /**
     * Time interval at which blobs are written to storage. Value should be
     * between 60 and 720 seconds. Default value is 300 seconds.
     */
    @JsonProperty(value = "batchFrequencyInSeconds")
    private Integer batchFrequencyInSeconds;

    /**
     * Maximum number of bytes for each blob written to storage. Value should
     * be between 10485760(10MB) and 524288000(500MB). Default value is
     * 314572800(300MB).
     */
    @JsonProperty(value = "maxChunkSizeInBytes")
    private Integer maxChunkSizeInBytes;

    /**
     * Encoding that is used to serialize messages to blobs. Supported values
     * are 'avro', 'avrodeflate', and 'JSON'. Default value is 'avro'. Possible
     * values include: 'Avro', 'AvroDeflate', 'JSON'.
     */
    @JsonProperty(value = "encoding")
    private String encoding;

    /**
     * Get the connection string of the storage account.
     *
     * @return the connectionString value
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connection string of the storage account.
     *
     * @param connectionString the connectionString value to set
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
     *
     * @param name the name value to set
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the subscription identifier of the storage account.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscription identifier of the storage account.
     *
     * @param subscriptionId the subscriptionId value to set
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the name of the resource group of the storage account.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the name of the resource group of the storage account.
     *
     * @param resourceGroup the resourceGroup value to set
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Get the name of storage container in the storage account.
     *
     * @return the containerName value
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the name of storage container in the storage account.
     *
     * @param containerName the containerName value to set
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get file name format for the blob. Default format is {iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}. All parameters are mandatory but can be reordered.
     *
     * @return the fileNameFormat value
     */
    public String fileNameFormat() {
        return this.fileNameFormat;
    }

    /**
     * Set file name format for the blob. Default format is {iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}. All parameters are mandatory but can be reordered.
     *
     * @param fileNameFormat the fileNameFormat value to set
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withFileNameFormat(String fileNameFormat) {
        this.fileNameFormat = fileNameFormat;
        return this;
    }

    /**
     * Get time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds.
     *
     * @return the batchFrequencyInSeconds value
     */
    public Integer batchFrequencyInSeconds() {
        return this.batchFrequencyInSeconds;
    }

    /**
     * Set time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds.
     *
     * @param batchFrequencyInSeconds the batchFrequencyInSeconds value to set
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withBatchFrequencyInSeconds(Integer batchFrequencyInSeconds) {
        this.batchFrequencyInSeconds = batchFrequencyInSeconds;
        return this;
    }

    /**
     * Get maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
     *
     * @return the maxChunkSizeInBytes value
     */
    public Integer maxChunkSizeInBytes() {
        return this.maxChunkSizeInBytes;
    }

    /**
     * Set maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
     *
     * @param maxChunkSizeInBytes the maxChunkSizeInBytes value to set
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withMaxChunkSizeInBytes(Integer maxChunkSizeInBytes) {
        this.maxChunkSizeInBytes = maxChunkSizeInBytes;
        return this;
    }

    /**
     * Get encoding that is used to serialize messages to blobs. Supported values are 'avro', 'avrodeflate', and 'JSON'. Default value is 'avro'. Possible values include: 'Avro', 'AvroDeflate', 'JSON'.
     *
     * @return the encoding value
     */
    public String encoding() {
        return this.encoding;
    }

    /**
     * Set encoding that is used to serialize messages to blobs. Supported values are 'avro', 'avrodeflate', and 'JSON'. Default value is 'avro'. Possible values include: 'Avro', 'AvroDeflate', 'JSON'.
     *
     * @param encoding the encoding value to set
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

}
