/**
 * Mule Modules Utils
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.utils.mom.internal;

import net.sf.staccatocommons.defs.Applicable;
import net.sf.staccatocommons.defs.Applicable2;
import ar.com.zauber.commons.mom.MapObjectMapperInterceptor;

public final class NullifierMapObjectMapperInterceptor implements MapObjectMapperInterceptor
{
    @Override
    public Object unmap(Object value, Class<?> type, Applicable2<Object, Class<?>, Object> proceed)
    {
        return proceed.apply(Nullifier.nullify(value), type);
    }

    @Override
    public Object unamp(Object value, Applicable<Object, Object> proceed)
    {
        return proceed.apply(Nullifier.nullify(value));
    }

    @Override
    public Object map(Object value, Applicable<Object, Object> proceed)
    {
        return proceed.apply(value);
    }   
}

