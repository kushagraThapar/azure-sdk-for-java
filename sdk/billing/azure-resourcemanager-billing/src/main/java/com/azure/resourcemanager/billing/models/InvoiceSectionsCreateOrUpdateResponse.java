// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.billing.fluent.models.InvoiceSectionInner;

/** Contains all response data for the createOrUpdate operation. */
public final class InvoiceSectionsCreateOrUpdateResponse
    extends ResponseBase<InvoiceSectionsCreateOrUpdateHeaders, InvoiceSectionInner> {
    /**
     * Creates an instance of InvoiceSectionsCreateOrUpdateResponse.
     *
     * @param request the request which resulted in this InvoiceSectionsCreateOrUpdateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public InvoiceSectionsCreateOrUpdateResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        InvoiceSectionInner value,
        InvoiceSectionsCreateOrUpdateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public InvoiceSectionInner getValue() {
        return super.getValue();
    }
}
