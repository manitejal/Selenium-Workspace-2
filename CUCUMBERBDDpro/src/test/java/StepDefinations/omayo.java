package StepDefinations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class omayo {
	WebDriver driver;

	@Given("^Navigate to application URL$")
	public void Navigate_to_application_URL() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

	}

	// ([^\"]*) =string , [^\"]* = anytype of data

	@When("^I enter username as \"([^\"]*)\" and passworda as \"([^\"]*)\" into the fields$")
	public void I_enter_username_as_Someusername_and_passworda_as_somepassword_into_the_fields(String username,String password) {

		driver.findElement(By.name("userid")).sendKeys(username);
		driver.findElement(By.name("pswrd")).sendKeys(password);

	}
	@And("^Clicked on login button$") public void i_click_on_login_button() {
		  driver.findElement(By.cssSelector("input[value='Login']")); }
		  
		 
	
	@Then("^I Should be able to login based on \"([^\"]*)\" login status$")
		 public void user_should_be_able_to_login_based_on_exspected_login_status(String exspectedresults) { 

	
		String actualResult = null;
		Alert alert = driver.switchTo().alert();

		if (alert.getText().contains("Error password or username")) {
			actualResult = "failure";

		}
	Assert.assertEquals(exspectedresults, actualResult);
	}
//===================================================================
	/*
	 * String actualResult =null; Alert alert
	 * =driver.switchTo().alert();
	 * 
	 * if(alert.getText().contains("Error password or username")) { actualResult =
	 * "failure";
	 * 
	 * } Assert.assertEquals(exspectedresults, actualResult);
	 * 
	 * 
	 * }
	 */

}
