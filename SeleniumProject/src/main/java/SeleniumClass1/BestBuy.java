package SeleniumClass1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BestBuy {
WebDriver driver;

	
public static void main(String[] args) throws IOException  {
BestBuy Website =new BestBuy();	
   Website.IntrouductionToWebsite();
   Website.Login();
   Website.Screenshot();
   Website.Items();
   
	}
public void IntrouductionToWebsite() {
	
System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
driver=new ChromeDriver();
}
//=====================================================================
public void Login() {
	
driver.get("https://www.bestbuy.com/");

driver.manage().window().maximize();
driver.findElement(By.cssSelector("input[type='email']")).sendKeys("maniteja.l2015@gmail.com");
String button =driver.findElement(By.xpath("//input[@class='btn btn-primary']")).getAttribute("value");
System.out.println(button);
driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();





//exsplicit wait 

WebDriverWait Wait = new WebDriverWait(driver,15);
Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Close_Cancel_Line")));

driver.findElement(By.id("Close_Cancel_Line")).click();

//wait 
//driver.findElement(By.className("c-close-icon-svg")).click();

WebElement result = new WebDriverWait(driver, Duration.ofSeconds(10))
.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("c-modal-grid col-xs-6"))));
//driver.findElement(By.cssSelector("input[type='email']")).sendKeys("maniteja.l2015@gmail.com");
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//driver.findElement(By.cssSelector("input[type='email']")).sendKeys("maniteja.l2015@gmail.com");

}
//=====================================================================================
public void Screenshot() throws IOException {
	File SrcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(SrcFile,new File("./image.png"));
	
	//taking Element Screenshot 
	WebElement element =driver.findElement(By.className("logo"));
	File Image =element.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Image,new File("./image.png"));
}
//==================================================================================
public void Items() {
	driver.navigate().to("https://www.bestbuy.com");
	driver.findElement(By.id("gh-search-input")).sendKeys("laptops" +Keys.ENTER);
	driver.findElement(By.className("flex-image-inner-wrapper flex-fluid-image")).getText();
	driver.findElement(By.className("flex-image-inner-wrapper flex-fluid-image")).click();
	String text = driver.findElement(By.className("block-title")).getText();
	System.out.println(text);
	
}

}
