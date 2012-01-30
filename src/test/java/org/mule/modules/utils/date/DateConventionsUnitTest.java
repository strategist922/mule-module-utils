
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
