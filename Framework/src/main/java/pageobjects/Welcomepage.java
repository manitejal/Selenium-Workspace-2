package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
	
	WebDriver driver;
	
	public Welcomepage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
@FindBy(xpath= "//h2[text()='Welcome to our store']")
WebElement Welcometoourpage;

public WebElement Welcometoourpage() {
	
	return Welcometoourpage;
}
}

