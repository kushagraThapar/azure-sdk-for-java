// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DirectoryRolesOrderby. */
public final class DirectoryRolesOrderby extends ExpandableStringEnum<DirectoryRolesOrderby> {
    /** Static value id for DirectoryRolesOrderby. */
    public static final DirectoryRolesOrderby ID = fromString("id");

    /** Static value id desc for DirectoryRolesOrderby. */
    public static final DirectoryRolesOrderby ID_DESC = fromString("id desc");

    /** Static value deletedDateTime for DirectoryRolesOrderby. */
    public static final DirectoryRolesOrderby DELETED_DATE_TIME = fromString("deletedDateTime");

    /** Static value deletedDateTime desc for DirectoryRolesOrderby. */
    public static final DirectoryRolesOrderby DELETED_DATE_TIME_DESC = fromString("deletedDateTime desc");

    /**
     * Creates or finds a DirectoryRolesOrderby from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DirectoryRolesOrderby.
     */
    @JsonCreator
    public static DirectoryRolesOrderby fromString(String name) {
        return fromString(name, DirectoryRolesOrderby.class);
    }

    /** @return known DirectoryRolesOrderby values. */
    public static Collection<DirectoryRolesOrderby> values() {
        return values(DirectoryRolesOrderby.class);
    }
}
