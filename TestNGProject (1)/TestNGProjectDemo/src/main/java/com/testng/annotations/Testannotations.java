package com.testng.annotations;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testannotations {

	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("Before Suite");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Before Method");
	}
	
	@Parameters("testName")
	@Test(priority = 1)
	public void test(String name) {
		
		System.out.println("Test Method"+ name);
	}
	
	@Test(priority = 0)
	public void test1() {
		
		System.out.println("Test Method - 1");
	}
	
	
}
