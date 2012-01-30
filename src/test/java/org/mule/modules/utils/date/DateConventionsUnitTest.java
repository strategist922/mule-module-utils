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

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

public class DateConventionsUnitTest
{
    DateTimeFormatter parser = DateConventions.defaultDateTimeFormat();

    @Test
    public void parseDateTimeCentral()
    {
        assertDateEquals(new DateTime(2012, 1, 9, 12, 18, 14, 0, DateTimeZone.UTC),
            parser.parseDateTime("2012-01-09T12:18:14Z"));
    }

    @Test
    public void parseDateTimeWithTimeOffset()
    {
        assertDateEquals(new DateTime(2012, 1, 9, 12, 18, 14, 0, DateTimeZone.forOffsetHours(-2)),
            parser.parseDateTime("2012-01-09T12:18:14-02:00"));
    }

    @Test
    public void parseDateTime()
    {
        assertDateEquals(new DateTime(2012, 1, 9, 12, 18, 14, 0, DateTimeZone.getDefault()),
            parser.parseDateTime("2012-01-09T12:18:14"));
    }

    @Test
    public void parseDate()
    {
        assertDateEquals(new DateTime(2012, 1, 9, 0, 0, 0, 0, DateTimeZone.getDefault()),
            parser.parseDateTime("2012-01-09"));
    }

    private void assertDateEquals(DateTime expected, DateTime actual)
    {
        assertEquals(expected.withZone(DateTimeZone.UTC), actual.withZone(DateTimeZone.UTC));
    }
}
