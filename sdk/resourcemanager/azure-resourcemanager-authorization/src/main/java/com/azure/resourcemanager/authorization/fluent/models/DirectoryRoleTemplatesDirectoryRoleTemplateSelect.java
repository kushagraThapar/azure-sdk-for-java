// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DirectoryRoleTemplatesDirectoryRoleTemplateSelect. */
public final class DirectoryRoleTemplatesDirectoryRoleTemplateSelect
    extends ExpandableStringEnum<DirectoryRoleTemplatesDirectoryRoleTemplateSelect> {
    /** Static value id for DirectoryRoleTemplatesDirectoryRoleTemplateSelect. */
    public static final DirectoryRoleTemplatesDirectoryRoleTemplateSelect ID = fromString("id");

    /** Static value deletedDateTime for DirectoryRoleTemplatesDirectoryRoleTemplateSelect. */
    public static final DirectoryRoleTemplatesDirectoryRoleTemplateSelect DELETED_DATE_TIME =
        fromString("deletedDateTime");

    /** Static value description for DirectoryRoleTemplatesDirectoryRoleTemplateSelect. */
    public static final DirectoryRoleTemplatesDirectoryRoleTemplateSelect DESCRIPTION = fromString("description");

    /** Static value displayName for DirectoryRoleTemplatesDirectoryRoleTemplateSelect. */
    public static final DirectoryRoleTemplatesDirectoryRoleTemplateSelect DISPLAY_NAME = fromString("displayName");

    /**
     * Creates or finds a DirectoryRoleTemplatesDirectoryRoleTemplateSelect from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DirectoryRoleTemplatesDirectoryRoleTemplateSelect.
     */
    @JsonCreator
    public static DirectoryRoleTemplatesDirectoryRoleTemplateSelect fromString(String name) {
        return fromString(name, DirectoryRoleTemplatesDirectoryRoleTemplateSelect.class);
    }

    /** @return known DirectoryRoleTemplatesDirectoryRoleTemplateSelect values. */
    public static Collection<DirectoryRoleTemplatesDirectoryRoleTemplateSelect> values() {
        return values(DirectoryRoleTemplatesDirectoryRoleTemplateSelect.class);
    }
}
