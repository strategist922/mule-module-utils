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

import org.apache.commons.lang.UnhandledException;
/**
 * @author flbulgarelli
 */
public class MuleSoftException extends UnhandledException
{

    public MuleSoftException(Throwable cause)
    {
        super(cause);
    }

    public static RuntimeException soften(Throwable e)
    {
        if (e instanceof RuntimeException)
        {
            return (RuntimeException) e;
        }
        return new MuleSoftException(e);
    }

}
