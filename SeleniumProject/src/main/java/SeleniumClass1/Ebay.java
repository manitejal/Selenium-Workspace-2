package SeleniumClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Ebay {

	static WebDriver driver;
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		

		Actions object =new Actions(driver);
		object.moveToElement(driver.findElement(By.xpath("//i[text()='Notification']"))).build().perform();
		
		driver.findElement(By.xpath("//span[text()='sign-in']/..")).click();
		

	}

	
}
