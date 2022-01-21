package StepDefinitions;

import PageObjects.AddCustomerPage;
import PageObjects.NOCLoginPage;
import PageObjects.SearchCustomerPage;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

public class Base {

    public WebDriver driver;
    public NOCLoginPage Loginpage;
    public AddCustomerPage addcust;
    public SearchCustomerPage searchCust;


    //this method created for generating random String for unique email
    public static String randomeString(){
        String generatedString1 = RandomStringUtils.randomAlphabetic(5);

        return (generatedString1);
    }
}
