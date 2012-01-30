/**
 * Mule Modules Utils
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.utils.date;

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
     * The Mule date format. By convention, dates are expressed in ISO date time. For
     * example, the following date strings are accepted:
     * <ul>
     * <li>2012-01-09T12:18:14Z</li>
     * <li>2012-01-09T12:18:14-02:00</li>
     * <li>2012-01-09T12:18:14</li>
     * <li>2012-01-09</li>
     * </ul>
     *
     * @return A {@link DateTimeFormatter} with mule date format.
     */
    public static DateTimeFormatter defaultDateTimeFormat()
    {
        return ISODateTimeFormat.dateTimeParser();
    }
}
