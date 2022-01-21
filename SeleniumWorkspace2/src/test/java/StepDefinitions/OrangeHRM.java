package StepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeHRM {

    WebDriver driver;
    @Given("I launch edge  browser")
    public void iLaunchEdgeBrowser() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }
    @When("I open orange HRM homepage")
    public void iopen_orange_hrm_homepage() {
     driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @Then("I verify that logo present on page")
    public void i_verify_that_logo_present_on_page() {
        boolean Status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertEquals(true, Status );
    }
    @And("Close browser")
    public void close_browser() {

driver.quit();
    }

}
