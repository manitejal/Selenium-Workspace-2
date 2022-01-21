package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage {
	
	WebDriver driver;
	
	public Registrationpage(WebDriver driver) {
		this.driver=driver;
		
	PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[text()='Register']")
	WebElement Registerbutton;
	
	public WebElement Registerbutton() {
		
		return Registerbutton;
	}
  @FindBy(id="gender-female")
  WebElement genderSelection;
  public WebElement genderSelection() {
	  return genderSelection;
  }
  
  @FindBy(id="FirstName")
  WebElement firstname;
  public WebElement firstname() {
	  return firstname;
  }
  @FindBy(id="LastName")
  WebElement lastname;
  public WebElement lastname() {
	  return lastname;
  }
  @FindBy(id="Email")
  WebElement email;
  public WebElement email() {
	  return email;
  }
  @FindBy(id="Company")
  WebElement company;
  public WebElement company() {
	  return company;
  }
  
 @FindBy(name="Password")
 WebElement Password;
 public WebElement Password() {
	 return Password;
	 
 }
 @FindBy(name="ConfirmPassword")
 WebElement ConfirmPassword;
 public WebElement ConfirmPassword() {
	 return ConfirmPassword;
 }
 
 @FindBy(id="register-button")
 WebElement registerbutton;
 public WebElement registerbutton() {
	 return registerbutton;
 }
}
