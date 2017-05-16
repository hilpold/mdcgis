/*******************************************************************************
 * Copyright 2014 Miami-Dade County
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.sharegov.mdcgis

import org.junit.Before
import org.junit.Test
import org.sharegov.mdcgis.utils.AppContext
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

class AddressControllerTests {

	private AddressController addressController
	
		@Before
		public void setUp() throws Exception {
			new ClassPathXmlApplicationContext("configtest.xml");
	
			ApplicationContext ctx = AppContext.getApplicationContext();
			addressController = (AddressController) ctx
					.getBean("ADDRESS_CONTROLLER");
		}
		
		@Test
		public void testEmail() throws Exception {
		//	addressController.sendMail("This is a test coming from AddressControllerTests.testEmail ")
		}
	
}
