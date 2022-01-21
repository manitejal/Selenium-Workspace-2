package SeleniumClass1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alibaba {
 
WebDriver driver;

public static void main(String[] args) {
		Alibaba shoppingobject =new Alibaba();
		shoppingobject.websiteInfo();
		shoppingobject.loginInfo();
		shoppingobject.performance();
}
//===============================================================
public  void websiteInfo() {
System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
 driver =new ChromeDriver();
}
//==================================================================
public void loginInfo() {
driver.get("https://www.alibaba.com/");
driver.manage().window().maximize();

Actions Clicking =new Actions(driver);
Clicking.moveToElement(driver.findElement(By.xpath("//a[text()='Sign In']"))).build().perform();
driver.findElement(By.xpath("//a[text()='Sign In']")).click();
driver.findElement(By.id("fm-login-id")).sendKeys("maniteja.l2015@gmail.com");
driver.findElement(By.id("fm-login-password")).sendKeys("tejal");
}
 
//===================================================================
public void performance() {
	//getting page title 
	String tittle = driver.getTitle();
	System.out.println(tittle);
	
	//getting current URL 
	String currenturl =driver.getCurrentUrl();
	System.out.println("URL is " + currenturl);
	
	//navigating back to home page and searching for mobile
	driver.navigate().to("https://www.alibaba.com");
	driver.findElement(By.name("SearchText")).sendKeys("mobiles");
	
	//alert
		try {
			WebDriverWait wait  =new WebDriverWait(driver,10);
			Alert alert =wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert();
			String text = alert.getText();
			System.out.println(text);
			alert.dismiss();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	driver.findElement(By.name("SearchText")).sendKeys(Keys.ENTER);
	
	
	//Searching for oneplus and getting the information 
	driver.findElement(By.linkText("Oneplus")).click();
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	WebElement alltags =driver.findElement(By.cssSelector("div[data-content='productItem']"));
	System.out.println("Size is "  +  alltags.getSize());
	System.out.println(alltags.getText());
	
	//clicking xiomi mobile 
		driver.findElement(By.linkText("Xiaomi")).click();
		if(driver.getCurrentUrl().matches("https://www.alibaba.com")) {
			
		System.out.println("pagesource is "  + driver.getPageSource());
		}else {
			System.out.println("Page title is " +  driver.getTitle());
		}
		
//Explicit wait 
// Initialize and wait till element(link) became clickable - timeout in 10 seconds //How can we come to know that it worked ?
		WebElement title  = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@title='CATEGORIES']"))));
		System.out.println(title.getText());
		
		
		String name =driver.findElement(By.className("cpv-refine-filter-item__img-cover")).getText();
		System.out.println(name);
		
	//trying to print page content -no go
	
	String word  = driver.findElement(By.className("virus-faq__content")).getText();
	System.out.println("linktext is "  +  word);
	
	
	
	
	
}



}

