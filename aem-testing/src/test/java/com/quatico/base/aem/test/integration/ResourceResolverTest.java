/*
 * Copyright 2016 Quatico Solutions Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.quatico.base.aem.test.integration;


import static com.quatico.base.aem.test.api.setup.AemClient.Type.Integration;
import static org.junit.Assert.assertEquals;

import com.quatico.base.aem.test.api.IAemClient;
import com.quatico.base.aem.test.api.setup.AemClient;
import com.quatico.base.aem.test.common.ResourceResolverTestDriver;

import org.junit.Test;


public class ResourceResolverTest extends ResourceResolverTestDriver {
	@Override
	protected IAemClient createClient() throws Exception {
		return new AemClient(Integration);
	}
	
	@Test
	public void resolveRequestResourceWithNullRequestAndNullResourceReturnsRootResource() throws Exception {
		assertEquals("rep:root", this.testObj.resolve(null, null).getResourceType());
	}
}
