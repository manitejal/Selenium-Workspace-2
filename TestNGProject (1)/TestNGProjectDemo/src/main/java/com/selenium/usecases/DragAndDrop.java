package com.selenium.usecases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragAndDrop {

WebDriver driver;
	
	@BeforeClass
	public void BeforeClass() {
		
		System.setProperty("webdriver.chrome.driver", ".//src//test//resources//chromedriver.exe");
		
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void verifyListBox() {
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement draggableObj = driver.findElement(By.id("draggable"));
		
		WebElement droppableObj = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(draggableObj, droppableObj).build().perform();
		
		
		
	}
	
	@Test
	public void verifyToolTip() throws InterruptedException {
		
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement txtbx = driver.findElement(By.id("age"));
		
		String toolTipValue = txtbx.getAttribute("title");
		
		System.out.println(toolTipValue);
		
		Actions action = new Actions(driver);
		
		action.contextClick().build().perform();
		
		Thread.sleep(3000);
		
	}
	
	@AfterClass
	public void AfterClass() {
		
		driver.quit();
	}
	
	
	
	
	
}
