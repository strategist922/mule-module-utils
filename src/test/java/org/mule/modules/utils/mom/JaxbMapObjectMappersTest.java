/**
 * Mule Modules Utils
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.utils.mom;

import static org.junit.Assert.assertEquals;

import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Before;
import org.junit.Test;

import com.zauberlabs.commons.mom.MapObjectMapper;

/**
 * @author Gaston Ponti
 * @since Dec 14, 2011
 */
public class JaxbMapObjectMappersTest
{
    private MapObjectMapper mom;

    @Before
    public void initMapperBuilder()
    {
        mom = JaxbMapObjectMappers.defaultWithPackage("workday").build();
    }

    @Test
    public void stringToXmlGregorianCalendarConvertionFromMom()
    { // YYYY-MM-DDThh:mm:ss
        XMLGregorianCalendar date = (XMLGregorianCalendar) mom.unmap("1988-06-05T23:55:07",
            XMLGregorianCalendar.class);
        assertEquals(5, date.getDay());
        assertEquals(23, date.getHour());
    }
}
