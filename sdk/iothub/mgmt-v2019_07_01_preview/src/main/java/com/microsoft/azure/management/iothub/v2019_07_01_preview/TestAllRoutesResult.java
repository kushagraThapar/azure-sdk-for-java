/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_07_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.iothub.v2019_07_01_preview.implementation.IoTHubManager;
import com.microsoft.azure.management.iothub.v2019_07_01_preview.implementation.TestAllRoutesResultInner;
import java.util.List;

/**
 * Type representing TestAllRoutesResult.
 */
public interface TestAllRoutesResult extends HasInner<TestAllRoutesResultInner>, HasManager<IoTHubManager> {
    /**
     * @return the routes value.
     */
    List<MatchedRoute> routes();

}
