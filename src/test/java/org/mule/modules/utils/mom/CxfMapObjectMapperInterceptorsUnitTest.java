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

import static org.junit.Assert.*;

import java.util.Collections;

import org.junit.Test;

import com.zauberlabs.commons.mom.MapObjectMapper;

/**
 * Tests for {@link CxfMapObjectMapperInterceptors}
 *
 * @author flbulgarelli
 */
public class CxfMapObjectMapperInterceptorsUnitTest
{

    /** Test for {@link CxfMapObjectMapperInterceptors#nullifier()} */
    @Test
    public void testNullifierInterceptorTransformsEmptyMapsIntoNulls()
    {
        Object result = nullifierMom().unmap(Collections.emptyMap(), Record.class);

        assertNull(result);
    }

    /** Test for {@link CxfMapObjectMapperInterceptors#nullifier()} */
    @Test
    public void testNullifierInterceptorTransformsEmptyListsIntoNulls()
    {
        Object result = nullifierMom().unmap(Collections.emptyList(), Record.class);
        assertNull(result);
    }

    private MapObjectMapper nullifierMom()
    {
        return CxfMapObjectMappers //
        .defaultWithPackage("org.mule.modules.utils.mom")
            .withInterceptor(CxfMapObjectMapperInterceptors.nullifier())
            .build();
    }

}
