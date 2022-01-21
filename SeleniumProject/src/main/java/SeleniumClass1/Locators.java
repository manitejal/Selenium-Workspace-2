package SeleniumClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Locators {

static WebDriver driver;

	public static void main(String[] args) {
		String browsertype = "chrome";
		if (browsertype.equals("chrome")) {
			System.out.println(System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"));
		}
		 
		 
		 System.setProperty("webdriver.edge.driver","C:/Users/manit/Downloads/edgedriver_win32/msedgedriver.exe");
		  driver=  new ChromeDriver();
		  
	 driver =new EdgeDriver();
		  
 

 driver.get("https://yahoo.com");
 
 
		
	 }
}

//Launch Amazon with credentials 
//use different methods and conditions within that 
//logout function and Url navigation is login page or not .
 //try to keep main method clean and create different methods for each scenario and launch the methods in main method 


