// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the setAccessControlRecursive operation. */
public final class PathsSetAccessControlRecursiveResponse
        extends ResponseBase<PathsSetAccessControlRecursiveHeaders, SetAccessControlRecursiveResponse> {
    /**
     * Creates an instance of PathsSetAccessControlRecursiveResponse.
     *
     * @param request the request which resulted in this PathsSetAccessControlRecursiveResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public PathsSetAccessControlRecursiveResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            SetAccessControlRecursiveResponse value,
            PathsSetAccessControlRecursiveHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public SetAccessControlRecursiveResponse getValue() {
        return super.getValue();
    }
}
