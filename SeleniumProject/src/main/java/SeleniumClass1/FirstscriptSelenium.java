package SeleniumClass1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class FirstscriptSelenium {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\manit\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		
		
		
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://gmail.com");

		
	}
//launching browser for 3 drivers 
	//use global variables
}
