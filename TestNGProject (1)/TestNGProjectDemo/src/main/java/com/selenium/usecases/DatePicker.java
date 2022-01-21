package com.selenium.usecases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DatePicker {

WebDriver driver;
	
	@BeforeClass
	public void BeforeClass() {
		
		System.setProperty("webdriver.chrome.driver", ".//src//test//resources//chromedriver.exe");
		
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void verifyListBox() {
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		WebElement we = driver.findElement(By.id("ui-datepicker-div"));
		
		List<WebElement> columns = we.findElements(By.tagName("td"));
		
		for (WebElement webElement : columns) {
		
			System.out.println(webElement.getText());
			
			if(webElement.getText().equals("10")) {
				webElement.click();
				break;
			}
		}
		
	}
	
	@AfterClass
	public void AfterClass() {
		
		driver.quit();
	}
	
	
	
	
	
}
