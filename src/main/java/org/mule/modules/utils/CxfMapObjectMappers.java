package org.mule.modules.utils;

import ar.com.zauber.commons.mom.MapObjectMapperBuilder;
import ar.com.zauber.commons.mom.MapObjectMappers;
import ar.com.zauber.commons.mom.converter.TypeConverter;
import ar.com.zauber.commons.mom.converter.impl.jodatime.StringToXMLGregorianCalendarTypeConverter;
import ar.com.zauber.commons.mom.style.impl.CXFStyle;

/**
 * {@link ar.com.zauber.commons.mom.MapObjectMapper}s and
 * {@link MapObjectMapperBuilder}s configured to be used within a Mule context and
 * with CXF-generated classes
 *
 * @author Gaston Ponti
 * @since Dec 14, 2011
 */
public final class CxfMapObjectMappers
{
    private CxfMapObjectMappers()
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
     * {@link MapObjectMappers#defaultWithPackage(String)}, but which adds cxf-specfic configurations:
     * <ul>
     *  <li>Sets {@link CXFStyle#STYLE} for its {@link ar.com.zauber.commons.mom.style.SetterStyle}</li>
     *  <li>Adds a {@link #muleStringToXmlGregorianCalendarConverter()}</li>
     * </ul>
     *
     * @param packageName The name of the mapping package
     * @return a new cxf default {@link MapObjectMapperBuilder} for the given
     *         packageName
     */
    public static MapObjectMapperBuilder defaultWithPackage(String packageName)
    {
        return MapObjectMappers.defaultWithPackage(packageName)
                               .withConverter(muleStringToXmlGregorianCalendarConverter())
                               .withSetterStyle(CXFStyle.STYLE);
    }
}

