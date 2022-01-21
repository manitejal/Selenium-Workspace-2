package StepDefinations;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ninja {
	WebDriver driver ;
	   @Before("@register")
	   public void openbrowser() {
		   WebDriverManager.edgedriver().setup();
		   driver =new EdgeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   }
	@Given("^I navigate to registeration page$")
	public void I_navigate_to_registeration_page() {
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
	}
	
	@When("^I entered the below details$")
	public void I_entered_the_below_details(DataTable data) {
		Map<String, String> datamap = data.asMap(String.class, String.class);
		driver.findElement(By.id("input-firstname")).sendKeys(datamap.get("Firstname"));
		driver.findElement(By.id("input-lastname")).sendKeys(datamap.get("Lastname"));
		driver.findElement(By.id("input-email")).sendKeys(datamap.get("Email"));
		driver.findElement(By.id("input-telephone")).sendKeys(datamap.get("Telephone"));
		driver.findElement(By.id("input-password")).sendKeys(datamap.get("Password"));
		driver.findElement(By.id("input-confirm")).sendKeys(datamap.get("Password"));
		
	}
	@And("^I Selected the privacypolicy option$")
	public void I_Selected_the_privacypolicy_option() {
		driver.findElement(By.name("agree")).click();
	}
	@And("^I clicked on continue button$")
	public void I_clicked_on_continue_button() {
		driver.findElement(By.cssSelector("input[value='Continue']")).click();
	}
	@Then("^User should be able to register successfully$")
	public void User_should_be_able_to_register_successfully() {
	String Successtext = driver.findElement(By.xpath("//*[@class='breadcrumb']//a[text()='Success']")).getText();
	System.out.println(Successtext);	
	}

}
