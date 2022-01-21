package SeleniumClass1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	
	static WebDriver driver;
	

public static void main(String[] args) {
Amazon abc =new Amazon();//creating object 
abc.login();
abc.action();
abc.logout();
abc.webelemts1();
	}
public  void login() {
System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
driver =new ChromeDriver();
driver.get("https://www.amazon.com/");
driver.manage().window().maximize();	
driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();		
driver.findElement(By.name("email")).sendKeys("karnatakam.2@wright.edu");
driver.findElement(By.id("continue")).click();
driver.findElement(By.name("password")).sendKeys("Mahesh3699");
driver.findElement(By.id("signInSubmit")).click();
}
public void action() {
	
	
	String title =driver.getTitle();
	
	System.out.println(driver.getTitle());
	if(title.contains("Amazon")) {
	System.out.println("Print name contains");
	}else {
		System.out.println("print name invalid");
	}
	
String currentURL =driver.getCurrentUrl();
System.out.println(driver.getCurrentUrl());
if (currentURL.contains("amazon")) {
	System.out.println("URL" + currentURL);
}else{
	System.out.println("URL is not available");
	}
}
public void webelemts1() {
	
	List<WebElement> alltags =driver.findElements(By.tagName("a"));	
	System.out.println("total tags are " + alltags.size());
	for(int i=0; i<alltags.size(); i++) {
	
		System.out.println("links on page are"  +alltags.get(i).getAttribute("href"));
		System.out.println("links on page are" + alltags.get(i).getText());
}
}
	
	
public  void logout() {

Actions object =new Actions(driver);
object.moveToElement(driver.findElement(By.xpath("//span[text()='Account & Lists']"))).build().perform();
driver.findElement(By.xpath("//span[text()='Sign Out']")).click();

	
}

}
