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

import org.mule.modules.utils.date.DateConventions;

import com.zauberlabs.commons.mom.MapObjectMapper;
import com.zauberlabs.commons.mom.MapObjectMapperBuilder;
import com.zauberlabs.commons.mom.MapObjectMappers;
import com.zauberlabs.commons.mom.converter.TypeConverter;
import com.zauberlabs.commons.mom.converter.impl.jodatime.StringToXMLGregorianCalendarTypeConverter;
import com.zauberlabs.commons.mom.style.impl.JaxbStyle;

/**
 * {@link ar.com.zauber.commons.mom.MapObjectMapper}s and
 * {@link MapObjectMapperBuilder}s configured to be used within a Mule context and
 * with Jaxb-generated classes
 *
 * @author Gaston Ponti
 * @since Dec 14, 2011
 */
public final class JaxbMapObjectMappers
{
    private JaxbMapObjectMappers()
    {
    }

    /**
     * Makes a converter for the mom that converts a String to a XmlGregorianCalendar
     * with the IsoDateTime convention.
     *
     * @return A {@link TypeConverter} for the MapObjectMapper.
     */
    public static TypeConverter muleStringToXmlGregorianCalendarConverter()
    {
        return StringToXMLGregorianCalendarTypeConverter.from(DateConventions.defaultDateTimeFormat());
    }

    /**
     * Answers a default {@link MapObjectMapperBuilder}, based on
     * {@link MapObjectMappers#defaultWithPackage(String)}, but which adds jaxb-specfic configurations:
     * <ul>
     *  <li>Sets {@link JaxbStyle#STYLE} for its {@link ar.com.zauber.commons.mom.style.SetterStyle}</li>
     *  <li>Adds a {@link #muleStringToXmlGregorianCalendarConverter()}</li>
     * </ul>
     *
     * @param packageName The name of the mapping package
     * @return a new jaxb default {@link MapObjectMapperBuilder} for the given
     *         packageName
     */
    public static MapObjectMapperBuilder defaultWithPackage(String packageName)
    {
        return MapObjectMappers.defaultWithPackage(packageName)
                               .withConverter(muleStringToXmlGregorianCalendarConverter())
                               .withSetterStyle(JaxbStyle.STYLE);
    }

    /**
     * Answers a default {@link MapObjectMapper}, based on
     * {@link MapObjectMappers#defaultWithPackage(String)}, but which adds jaxb-specfic configurations:
     * <ul>
     *  <li>Sets {@link JaxbStyle#STYLE} for its {@link ar.com.zauber.commons.mom.style.SetterStyle}</li>
     *  <li>Adds a {@link #muleStringToXmlGregorianCalendarConverter()}</li>
     * </ul>
     *
     * @param packageName The name of the mapping package
     * @return a new jaxb default {@link MapObjectMapper} for the given
     *         packageName
     */
    public static MapObjectMapper default_(String packageName)
    {
        return defaultWithPackage(packageName).build();
    }
}

