/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TextStyle.
 */
public final class TextStyle extends ExpandableStringEnum<TextStyle> {
    /** Static value other for TextStyle. */
    public static final TextStyle OTHER = fromString("other");

    /** Static value handwriting for TextStyle. */
    public static final TextStyle HANDWRITING = fromString("handwriting");

    /**
     * Creates or finds a TextStyle from its string representation.
     * @param name a name to look for
     * @return the corresponding TextStyle
     */
    @JsonCreator
    public static TextStyle fromString(String name) {
        return fromString(name, TextStyle.class);
    }

    /**
     * @return known TextStyle values
     */
    public static Collection<TextStyle> values() {
        return values(TextStyle.class);
    }
}
