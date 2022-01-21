package SeleniumClass1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {
	 WebDriver driver;
	
	
public static void main(String[] args) {
	Flipkart object=new Flipkart();	
	 object.prerequirements();
	 object.login();
	 object.Action();
     object.Webelement();
	}
//================================================
public void prerequirements() {
	System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	driver =new ChromeDriver();
	}
//================================================
public void login() {
	
driver.get("https://www.flipkart.com");
driver.manage().window().maximize();

 driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8095899333");
driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("maniteja");
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

}
//=========================================================================
public void Action() {
driver.findElement(By.name("q")).sendKeys("mobiles" + Keys.ENTER);
// Initialize and wait till element(link) became clickable - timeout in 10 seconds
WebElement REDMI = new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.elementToBeClickable(By.className("_4rR01T")));
// Print the  result
System.out.println(REDMI.getText());
driver.findElement(By.className("_4rR01T")).click();


String Currenturl =driver.getCurrentUrl();
System.out.println(driver.getCurrentUrl());
if(Currenturl.matches("https://www.flipkart.com")) {
	System.out.println("URL matched");
}else {
	System.out.println("URL didnt Matched ");
}

String tittle=driver.getTitle();
System.out.println(tittle);


}

//============================================================
public void Webelement() {
	List<WebElement> alltags=driver.findElements(By.xpath("//div[@class='_1YokD2 _2GoDe3']/div[2]//a"));
	System.out.println(alltags.size());
	for(int M=0; M<alltags.size(); M++) {
		if(alltags.get(M).getText().contains("REDMI")) {
		String mobName = alltags.get(M).getText();
	alltags.get(M).click();
	
	System.out.println("linkson page are " + alltags.get(M).getText());
	
	break;
		}
		
		
	}
	
//================================================
	}

}

