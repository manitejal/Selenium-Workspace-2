package com.selenium.designpattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryDP {
	
	
	
	public PageFactoryDP(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(className = "intro")
	WebElement paragraph;
	
	
	@FindBy(linkText = "Themes")
	WebElement themes;
	
	@FindBy(xpath = "//*[text()='Choice 1']")
	WebElement radioChoice;
	
	
	
	public void clickThemes() {
		themes.click();
		
	}
	
	public void clickRadioChoice() {
		
		radioChoice.click();
	}
	
	public String getIntrotext() {
		return paragraph.getText();
		
	}
	
}
