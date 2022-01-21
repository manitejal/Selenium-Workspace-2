package com.selenium.usecases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcases {

	WebDriver driver;
	
	@BeforeClass
	public void BeforeClass() {
		
		System.setProperty("webdriver.chrome.driver", ".//src//test//resources//chromedriver.exe");
		
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void verifyListBox() {
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		WebElement we = driver.findElement(By.id("searchDropdownBox"));
		
		Select select = new Select(we);
		
		// fetch all options from dropdown
		System.out.println(select.getOptions());
		
		List<WebElement> options = select.getOptions();
		
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		
		// click the option based on text
		select.selectByVisibleText("Deals");
		
		// print the selected option
		System.out.println(select.getFirstSelectedOption().getText());
		
		// click the option based on value
		select.selectByValue("search-alias=appliances");
		
		// print the selected option
		System.out.println(select.getFirstSelectedOption().getText());
				
				
		
	}
	
	@AfterClass
	public void AfterClass() {
		
		driver.quit();
	}
	
	
}
