package com.testng.annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCases {

	
	
	@Test(dataProvider = "dataProviderTestData")
	public void testcase01(Object[] testdata) {
		System.out.println(testdata[0]);
		
	}
	
	/**
	 * 	return single dimensional arrays
	 * 
	 *   when we are using dataprovider we need to return Object[] or Object[][]
	 *   
	 */
	
	@DataProvider(name="dataProviderTestData")
	public Object[] dataProvider() {
		
		Object[] obj = new Object[2];
		
		obj[0] = "Vinod";
		
		obj[1] = 12;
		
		return obj;
	}
	
	
	
	
}
