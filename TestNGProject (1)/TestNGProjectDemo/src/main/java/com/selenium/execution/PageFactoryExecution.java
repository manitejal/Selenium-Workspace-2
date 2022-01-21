package com.selenium.execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium.designpattern.PageFactoryDP;
import com.selenium.designpattern.PageObjectModel;

public class PageFactoryExecution {
	
	WebDriver driver;
	
	PageFactoryDP pfObj;
	
	PageObjectModel pom;

	@BeforeClass
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/");
	}
	
	@Test
	public void testMethod() {
		
		pfObj = new PageFactoryDP(driver);
		
		String introText = pfObj.getIntrotext();
		
		System.out.println(introText);
		
		pfObj.clickThemes();
		
		pfObj.clickRadioChoice();
	}
	
	@Test
	public void testMethod1() {
		
		driver.get("https://jqueryui.com/");
		pom = new PageObjectModel(driver);
		
		String introText = pom.getIntrotext();
		
		System.out.println(introText);
		
		pom.clickThemes();
		
		pom.clickRadioChoice();
	}
	
	@AfterClass
	public void afterTest() {
		
		driver.close();
	}
	
	
	
}
