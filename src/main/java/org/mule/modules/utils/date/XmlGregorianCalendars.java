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

import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.mule.modules.utils.date.internal.XmlGregorianCalendarFactory;

/**
 * @author Gaston Ponti
 * @since Dec 22, 2011
 */
public final class XmlGregorianCalendars
{
    private XmlGregorianCalendars()
    {
    }
    private static XmlGregorianCalendarFactory calendars = XmlGregorianCalendarFactory.newInstance();
   
    /**
     * Answers an {@link XMLGregorianCalendar} for the given {@link Date}
     * 
     * @param date nullable
     * @return an {@link XMLGregorianCalendar} that represents the given date, or
     *         null, if {@code date} is null
     */
    public static XMLGregorianCalendar nullSafeFrom(Date date)
    {
        return calendars.nullSafeToXmlCalendar(date);
    }
   
    /**
     * Answers an {@link XMLGregorianCalendar} for the given {@link Date}
     * 
     * @param date not nulls
     * @return an {@link XMLGregorianCalendar} that represents the given date
     */
    public static XMLGregorianCalendar from(Date date)
    {
        return calendars.toXmlCalendar(date);
    }
}
