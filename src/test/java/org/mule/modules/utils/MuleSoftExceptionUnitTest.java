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

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.junit.Test;

/**
 * Test for {@link MuleSoftException}
 *
 * @author flbulgarelli
 */
public class MuleSoftExceptionUnitTest
{
    @Test
    public void softenAnIoExceptionAnswersAMuleSoftException()
    {
        RuntimeException soften = MuleSoftException.soften(new IOException());
        assertThat(soften, instanceOf(MuleSoftException.class));
    }

    @Test
    public void softenARuntimeExceptionAnswersIt()
    {
        IndexOutOfBoundsException e = new IndexOutOfBoundsException();
        assertSame(e, MuleSoftException.soften(e));
    }

}
