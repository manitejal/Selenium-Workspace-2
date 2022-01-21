package Tests;

import java.io.IOException;import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import pageobjects.LandingPage;
import pageobjects.Welcomepage;
import pageobjects.loginPage;

public class LoginTest extends Base {
	public WebDriver driver;
	@BeforeMethod
	public void openApplication() throws IOException {
		
		driver = initializedriver(); 
		driver.get(prop.getProperty("url"));
		}
//============================================================	
	@Test(dataProvider="getlogindata")
	public void login(String email,String password, String Exspectedresult) throws IOException, InterruptedException {
		
	LandingPage landingpage=new LandingPage(driver);
	landingpage.Loginbutton().click();
	
	loginPage Loginpage =new loginPage(driver);
	Loginpage.emailaddressfield().sendKeys(email);
	Loginpage.passwordfield().sendKeys(password);
	Loginpage.loginbutton().click();
	
	Welcomepage welcomepage =new Welcomepage(driver);
	
	String Actualresult = null;
	try {
		if(welcomepage.Welcometoourpage().isDisplayed()) {
		Actualresult ="Successfull"; }
	} catch (Exception e) {
		
		Actualresult ="Failure";
		
	}
	//Assert.assertEquals(Exspectedresult , Actualresult);
	
	System.out.println(Actualresult);
	System.out.println(Exspectedresult);
	
	}
//===============================================================
	@AfterMethod
	public void closure() {
		driver.quit();
	}
//============================================================
	@DataProvider
    public Object[][] getlogindata() {
    	Object[][] data ={{"tejal@gmail.com", "tejal@123", "successfull"},{"dummy@test.com","dummy","failure"}};
    	
    	return data;
    }
//=================================================================================
}
