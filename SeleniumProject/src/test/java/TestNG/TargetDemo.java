package TestNG;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class TargetDemo {

	WebDriver driver;
	@Test
	public  void sample() throws IOException {
	 TargetDemo Shopping  = new TargetDemo();	
	Shopping.login();	
    Shopping.Screenshot();
    Shopping.Windows();
	}

	public void login() {
	System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("https://www.target.com");
	driver.findElement(By.id("search")).sendKeys("laptops");
	driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
	
	}

	public void Screenshot() throws IOException {
	
 File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(scrFile, new File("C:\\Users\\manit\\Pictures/image.png"));	
 System.out.println(scrFile);
 //wait 
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
 driver.findElement(By.partialLinkText("Dell")).click();
 
 //Taking element screenshot 
try {
	WebElement element =driver.findElement(By.partialLinkText("Dell Latitude 3189 Pentium N4200 1.1GHz, 4GB, 128GB SSD"));
	File screenFile =element.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenFile, new File("./image1.png"));
	element.click();
	 System.out.println(screenFile);
} catch (WebDriverException e) {

	e.printStackTrace();
} catch (IOException e) {

	e.printStackTrace();
}

	}
	public void Windows(){
String Currentwindow =driver.getWindowHandle();	
 driver.findElement(By.linkText("Joy Systems")).click();
 Set<String> windowHandles = driver.getWindowHandles();
driver.getWindowHandles().size(); 
driver.switchTo().newWindow(WindowType.TAB);
driver.switchTo().window(Currentwindow);
	}

}


