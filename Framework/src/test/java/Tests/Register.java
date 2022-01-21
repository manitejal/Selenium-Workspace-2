package Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resources.Base;
import pageobjects.Registrationpage;

public class Register extends Base{
	public WebDriver driver;
	@BeforeMethod
	public void openwebsite() throws IOException {
		driver =initializedriver();
		driver.get(prop.getProperty("RegisterURL"));
	}
	@Test
	public void process() throws InterruptedException {
		
		Registrationpage registrationpage =new Registrationpage(driver);
		registrationpage.Registerbutton().click();
		
		registrationpage.genderSelection().click();
		registrationpage.firstname().sendKeys("tejal");
		registrationpage.lastname().sendKeys("la");
		
		WebElement Dropdown1 = driver.findElement(By.name("DateOfBirthDay"));
		Select select =new Select(Dropdown1);
		select.selectByIndex(2);
		
		WebElement Dropdown2 = driver.findElement(By.name("DateOfBirthMonth"));
		Select select2 =new Select(Dropdown2);
		select2.selectByVisibleText("January");
		
		Thread.sleep(3000);
		WebElement Dropdown3 = driver.findElement(By.name("DateOfBirthYear"));
		Select select3 =new Select(Dropdown3);
		select3.selectByIndex(6);
        
		registrationpage.email().sendKeys("tejal@gmail.com");
		registrationpage.company().sendKeys("XYZ");
		registrationpage.Password().sendKeys("123456");
		registrationpage.ConfirmPassword().sendKeys("123456");
		registrationpage.registerbutton().click();
			
	}

}
