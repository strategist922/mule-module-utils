/**
 * Mule Modules Utils
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.utils.internal;

import java.util.List;
import java.util.Map;

public final class Nullifier
{
    private Nullifier()
    {
    }

    public static Object nullify(Object value)
    {
        return isNullifiable(value) ? null : value;
    }

    public static boolean isNullifiable(Object value)
    {
        return value == null || isEmptyMap(value) || isEmptyList(value);
    }

    @SuppressWarnings("unchecked")
    private static boolean isEmptyList(Object value)
    {
        return value instanceof List && ((List) value).isEmpty();
    }

    @SuppressWarnings("unchecked")
    private static boolean isEmptyMap(Object value)
    {
        return value instanceof Map && ((Map) value).isEmpty();
    }
}


