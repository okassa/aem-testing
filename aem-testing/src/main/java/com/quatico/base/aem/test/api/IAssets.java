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
package com.quatico.base.aem.test.api;


import com.quatico.base.aem.test.api.builders.AssetBuilder;
import com.quatico.base.aem.test.api.builders.RenditionBuilder;

import org.apache.sling.api.resource.Resource;


public interface IAssets {
	
	String DEFAULT_MIMETYPE = "image/jpeg";
	
	Resource anAsset(String path, Object... properties) throws Exception;
	
	AssetBuilder anAsset();
	
	RenditionBuilder anAssetRendition();
}
