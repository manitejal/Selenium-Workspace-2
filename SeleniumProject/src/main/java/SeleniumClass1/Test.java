package SeleniumClass1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();	

			Actions object =new Actions(driver);
			object.moveToElement(driver.findElement(By.xpath("//span[text()='Account & Lists']"))).build().perform();
			
	driver.findElement(By.xpath("//span[text()='Orders']")).click();
			
	
			
			
//=====================================================			
	List<WebElement> alltags =driver.findElements(By.tagName("a"));	
	System.out.println("total tags are " + alltags.size());
	for(int i=0; i<alltags.size(); i++) {
	
		System.out.println("links on page are"  +alltags.get(i).getAttribute("href"));
		System.out.println("links on page are" + alltags.get(i).getText());
	}
	
				
			}
		 }
	


