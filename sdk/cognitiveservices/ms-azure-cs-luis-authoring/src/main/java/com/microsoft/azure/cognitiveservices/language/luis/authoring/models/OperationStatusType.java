/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

import java.util.Collection;

/**
 * Defines values for OperationStatusType.
 */
public final class OperationStatusType extends ExpandableStringEnum<OperationStatusType> {
    /** Static value Failed for OperationStatusType. */
    public static final OperationStatusType FAILED = fromString("Failed");

    /** Static value FAILED for OperationStatusType. */
    public static final OperationStatusType FAILED_1 = fromString("FAILED");

    /** Static value Success for OperationStatusType. */
    public static final OperationStatusType SUCCESS = fromString("Success");

    /**
     * Creates or finds a OperationStatusType from its string representation.
     * @param name a name to look for
     * @return the corresponding OperationStatusType
     */
    @JsonCreator
    public static OperationStatusType fromString(String name) {
        return fromString(name, OperationStatusType.class);
    }

    /**
     * @return known OperationStatusType values
     */
    public static Collection<OperationStatusType> values() {
        return values(OperationStatusType.class);
    }
}
