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

import org.mule.modules.utils.mom.internal.CollectionInlinerMapObjectMapperInterceptor;
import org.mule.modules.utils.mom.internal.NullifierMapObjectMapperInterceptor;

import ar.com.zauber.commons.mom.MapObjectMapperInterceptor;

/**
 * Interceptors
 *
 * @author flbulgarelli
 */
public class CxfMapObjectMapperInterceptors
{
    private static final CollectionInlinerMapObjectMapperInterceptor INLINER = new CollectionInlinerMapObjectMapperInterceptor();
    private static final NullifierMapObjectMapperInterceptor NULLIFIER = new NullifierMapObjectMapperInterceptor();

    public static MapObjectMapperInterceptor nullifier()
    {
        return NULLIFIER;
    }

    public static MapObjectMapperInterceptor collectionInliner()
    {
        return INLINER;
    }
}
