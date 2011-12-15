/**
 * Mule Modules Utils
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package org.mule.modules.utils;

import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * Mule date conventions.
 *
 * @author Gaston Ponti
 * @since Dec 14, 2011
 */
public final class DateConventions
{
    private DateConventions()
    {
    }

    /**
     * The Mule date format, iso date time.
     *
     * @return A {@link DateTimeFormatter} with mule date format.
     */
    public static DateTimeFormatter defaultDateTimeFormat()
    {
        return ISODateTimeFormat.dateTimeParser();
    }
}
