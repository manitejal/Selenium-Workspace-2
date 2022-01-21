package StepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Resources.Base;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LandingPage;
import pageobjects.Welcomepage;
import pageobjects.loginPage;

public class Login extends Base {
	WebDriver driver;
	loginPage Loginpage;
	Welcomepage welcomepage;
	
	@Given("^Open any Browser$")
	public void Open_any_Browser() throws IOException {
		
		 driver = initializedriver(); 
	}

	@And("^Navigate to Login page$")
	public void Navigate_to_Login_page() {
		driver.get(prop.getProperty("url"));
		LandingPage landingpage=new LandingPage(driver);
		landingpage.Loginbutton().click();
		
	}
	@When("^User enters username as \"(.*)\" and password as \"(.*)\" into the fields$")
	public void User_enters_username_as_something_and_password_as_something_into_the_fields(String email, String password) {
	    Loginpage =new loginPage(driver);
		Loginpage.emailaddressfield().sendKeys(email);
		Loginpage.passwordfield().sendKeys(password);
		
	}
	@And("^User clicks on Login button$")
	public void User_clicks_on_login_button() {
		Loginpage.loginbutton().click();
	}
	@Then("^Verify user is able to successfully login$")
	public void Verify_user_is_able_to_successfully_login() {
		 welcomepage =new Welcomepage(driver);
		Assert.assertTrue(welcomepage.Welcometoourpage().isDisplayed());
	}
	@After
	public void closebrowser() {
		driver.quit();
	}
}
