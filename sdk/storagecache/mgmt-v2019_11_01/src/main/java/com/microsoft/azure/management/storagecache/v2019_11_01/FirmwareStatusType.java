/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2019_11_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for FirmwareStatusType.
 */
public final class FirmwareStatusType extends ExpandableStringEnum<FirmwareStatusType> {
    /** Static value available for FirmwareStatusType. */
    public static final FirmwareStatusType AVAILABLE = fromString("available");

    /** Static value unavailable for FirmwareStatusType. */
    public static final FirmwareStatusType UNAVAILABLE = fromString("unavailable");

    /**
     * Creates or finds a FirmwareStatusType from its string representation.
     * @param name a name to look for
     * @return the corresponding FirmwareStatusType
     */
    @JsonCreator
    public static FirmwareStatusType fromString(String name) {
        return fromString(name, FirmwareStatusType.class);
    }

    /**
     * @return known FirmwareStatusType values
     */
    public static Collection<FirmwareStatusType> values() {
        return values(FirmwareStatusType.class);
    }
}
