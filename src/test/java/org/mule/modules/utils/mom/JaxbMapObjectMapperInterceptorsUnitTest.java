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

import static org.junit.Assert.assertNull;

import java.util.Collections;

import org.junit.Test;

import com.zauberlabs.commons.mom.MapObjectMapper;

/**
 * Tests for {@link JaxbMapObjectMapperInterceptors}
 *
 * @author flbulgarelli
 */
public class JaxbMapObjectMapperInterceptorsUnitTest
{

    /** Test for {@link JaxbMapObjectMapperInterceptors#nullifier()} */
    @Test
    public void testNullifierInterceptorTransformsEmptyMapsIntoNulls()
    {
        Object result = nullifierMom().unmap(Collections.emptyMap(), Record.class);

        assertNull(result);
    }

    /** Test for {@link JaxbMapObjectMapperInterceptors#nullifier()} */
    @Test
    public void testNullifierInterceptorTransformsEmptyListsIntoNulls()
    {
        Object result = nullifierMom().unmap(Collections.emptyList(), Record.class);
        assertNull(result);
    }

    private MapObjectMapper nullifierMom()
    {
        return JaxbMapObjectMappers //
        .defaultWithPackage("org.mule.modules.utils.mom")
            .withInterceptor(JaxbMapObjectMapperInterceptors.nullifier())
            .build();
    }

}
