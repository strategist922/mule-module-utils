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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Calendar;

import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Test;

/**
 * Test for {@link XmlGregorianCalendarsUnitTest}
 */
public class XmlGregorianCalendarsUnitTest
{

    /**
     * test for {@link XmlGregorianCalendars#nullSafeFrom(java.util.Date)}
     */
    @Test
    public void testNullSafeFrom()
    {
        assertNull(XmlGregorianCalendars.nullSafeFrom(null));
    }

    /**
     * test for {@link XmlGregorianCalendars#from(java.util.Date)}
     */
    @Test
    public void testFrom()
    {
        Calendar calendar = Calendar.getInstance();

        XMLGregorianCalendar xmlCalendar = XmlGregorianCalendars.from(calendar.getTime());

        assertEquals(calendar.get(Calendar.DAY_OF_MONTH), xmlCalendar.getDay());
        assertEquals(calendar.get(Calendar.MONTH) + 1, xmlCalendar.getMonth());
        assertEquals(calendar.get(Calendar.HOUR_OF_DAY), xmlCalendar.getHour());
    }

}
