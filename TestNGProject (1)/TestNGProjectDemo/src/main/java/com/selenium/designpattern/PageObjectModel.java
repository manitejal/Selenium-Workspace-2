package com.selenium.designpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectModel {
	
	WebDriver driver;
	
	public PageObjectModel(WebDriver driver) {
		this.driver = driver;
	}
	


	
	By paragraph = By.className("intro");
	
	By themes = By.linkText("Themes");
	
	By radioChoice = By.xpath("//*[text()='Choice 1']");
	

	
	public void clickThemes() {
		driver.findElement(themes).click();
		
	}
	
	public void clickRadioChoice() {
		driver.findElement(radioChoice).click();
	}
	
	public String getIntrotext() {
		return driver.findElement(paragraph).getText();
		
	}
	
}
