package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
 WebDriver driver;
 
 public loginPage(WebDriver driver) {
	 
	 this.driver =driver;
	 
	 PageFactory.initElements(driver, this);
	 
 }
	 
	 @FindBy(id="Email")
	 WebElement emailaddressfield;
	 
	 @FindBy(id="Password")
	 WebElement passwordfield;
	 
	 @FindBy(xpath="//div[@class='buttons']//button[text()='Log in']")
	 WebElement loginbutton;
	 
	 public WebElement emailaddressfield() {
		 
		 return emailaddressfield;
	 }
	 public WebElement passwordfield() {
		 
		 return passwordfield;
	 }
	 public WebElement loginbutton() {
		 
		 return loginbutton;
	 }
 
}
