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

import org.mule.modules.utils.date.converter.internal.XmlGregorianCalendarFactory;

/**
 * @author Gaston Ponti
 * @since Dec 22, 2011
 */

public class XmlGregorianCalendars
{
    private static XmlGregorianCalendarFactory calendars = XmlGregorianCalendarFactory.newInstance();
    
    public static XMLGregorianCalendar toGregorianCalendar(Date date)
    {
        return calendars.nullSafeToXmlCalendar(date);
    }
}

	