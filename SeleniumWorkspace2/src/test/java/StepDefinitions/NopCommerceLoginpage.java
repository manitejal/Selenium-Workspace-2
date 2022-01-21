package StepDefinitions;

import PageObjects.AddCustomerPage;
import PageObjects.NOCLoginPage;
import PageObjects.SearchCustomerPage;
import Utilities.WaitHelper;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.URL;


public class NopCommerceLoginpage extends Base {

    @Before
    public void setup(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

 @Given("User Launched Edge browser")
    public void user_launched_edge_browser() {

        Loginpage = new NOCLoginPage(driver);
    }

    @When("User opens URL {string}")
    public void user_opens_url(String URL) {
        driver.get(URL);
    }

    @And("User enters Email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as(String Email, String password) {
        Loginpage.emailaddressfield().clear();
        Loginpage.emailaddressfield().sendKeys(Email);
        Loginpage.passwordfield().clear();
        Loginpage.passwordfield().sendKeys(password);
    }
    @And("Click on login")
    public void click_on_login() {
        Loginpage.loginbutton().click();
    }
    @Then("Page title should be {string}")
    public void page_title_should_be(String title) {

        title = driver.getTitle();
        driver.manage().window().maximize();

        if (driver.getPageSource().contains("Login was unsuccessful.")) {
            driver.close();
            Assert.assertTrue(false);
        } else {
            Assert.assertEquals(title, driver.getTitle());
        }
    }

    @When("User click on log out link")
    public void user_click_on_log_out_link() throws InterruptedException {
        Loginpage.logoutbutton().click();
        Thread.sleep(3000);
    }
    @And("Closing  browser")
    public void closing_browser() {
        driver.close();
    }

    /* Customer Feature step definations------------------------------------------------------------------------------------------ */

    @Then("User can view Dashboard")
    public void user_can_view_dashboard() {
    addcust= new AddCustomerPage(driver);
    Assert.assertEquals("Dashboard / nopCommerce administration",addcust.getpageTitle());
    }

    @When("User click on customers menu")
    public void user_click_on_customers_menu() throws InterruptedException {
        Thread.sleep(5000);
        addcust.ClickOnCustomersmenu();
    }

    @And("Click on customers menu Item")
    public void click_on_customers_menu_item() throws InterruptedException {
        Thread.sleep(3000);
        addcust.ClickonCustomerrsdropmenu();
    }

    @And("Click on add new button")
    public void click_on_add_new_button() throws InterruptedException {

        addcust.ClickonAddnew();
        Thread.sleep(3000);
    }

    @Then("User can view add new customer page")
    public void user_can_view_add_new_customer_page() {
 Assert.assertEquals("Add a new customer / nopCommerce administration",addcust.getpageTitle());
    }

    @When("User enter customer info")
    public void user_enter_customer_info() throws InterruptedException {
String email =randomeString() +"@gmail.com";
addcust.emailfield(email);
addcust.Passwordfield("test123");
addcust.Firstname("Tejal");
addcust.Lastname("LA");
addcust.Gender("Female");
Thread.sleep(3000);
addcust.DOB("01/01/2021");
addcust.Companyname("XYZ");
//addcust.Newsletter();



/*Registered -default
//The customer cannot be in both 'Guests' and 'Registered'customer roles
//Add the customer to 'guests'or 'Registered"customer role */


//addcust.Customerroles("Registered");
Thread.sleep(3000);

addcust.ManagerofVendor("Vendor 2");

addcust.Admincomment("This is for testing ...........");
    }

    @And("Click on save button")
    public void click_on_save_button() {
 addcust.clickOnSave();
    }
    @Then("User can view confirmation message {string}")
    public void user_can_view_confirmation_message(String string) {
Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully"));

    }
//------------Steps for searching  a customer using Email Id ---------------------------------------------------
@When("Enter customer Email")
public void enter_customer_email() {
    searchCust =new SearchCustomerPage(driver);
    searchCust.setEmail("victoria_victoria@nopCommerce.com");
}
    @When("Click on search button")
    public void click_on_search_button() throws InterruptedException {
        searchCust.Searchbutton();
        Thread.sleep(3000);
    }
    @Then("User should found Email in the search table")
    public void user_should_found_email_in_the_search_table() throws InterruptedException {

      boolean status =   searchCust.SearchCustomerByEmailID("victoria_victoria@nopCommerce.com");
        Thread.sleep(3000);
      Assert.assertEquals(true, status);

    }
//--------------steps for searching a customer using Firstname and lastname--------------------------
@When("Enter customer FirstName")
public void enter_customer_first_name() {
    searchCust =new SearchCustomerPage(driver);
    searchCust.setfirstname("Victoria");
}

    @When("Enter customer LastName")
    public void enter_customer_last_name() {
        searchCust.setlastname("Terces");
    }

    @Then("User should found Name in the search table")
    public void user_should_found_name_in_the_search_table() {
       boolean Status =  searchCust.SearchCustomerByName("Victoria Terces");

       Assert.assertEquals(true, Status);

    }

}