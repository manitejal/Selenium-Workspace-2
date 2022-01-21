package StepDefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;
	@Before("@ninja")
	public void openBrowser() {
	
    WebDriverManager.edgedriver().setup();
    driver =new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	}
	@Given("^I navigate to login page of the application$")
	public void I_navigate_to_login_page_of_the_application() {
		driver.get("http://www.tutorialsninja.com/demo/");
	}
	
	@When("^I enter email address as \"([^\"]*)\" and password as \"([^\"]*)\" into the fields$")
	public void I_enter_email_address_as_Something_and_password_as_Something_into_the_fields(String emailaddress,String password){
		driver.findElement(By.id("input-email")).sendKeys(emailaddress);
		driver.findElement(By.id("input-password")).sendKeys(password);
	
	}
	
	@And("^I click on the login button$")
	public void i_click_on_the_login_button() {
		driver.findElement(By.cssSelector("input[value='Login']")).click();
	}
	
	@Then("^I the user should be able to successfully login$")
   public void I_the_user_should_be_able_to_successfully_login() {
		WebElement Account=null;
	   
	   try {
	  Account = driver.findElement(By.xpath("//*[@class=\"breadcrumb\"]//a[text()='Account']"));
	   }catch(Exception e){
		   System.out.println("login has failed");
	   }
	   Assert.fail("Account login failed");
	}
	@After("@ninja")
	public void closure() {
		driver.quit();
	}
}

