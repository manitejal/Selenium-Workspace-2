package SeleniumClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondAssesment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver() ;
		
		 driver.get("https://yahoo.com");
		 
		 driver.manage().window().maximize();
		 
         driver.findElement(By.linkText("Sign in")).click();
         
         /* driver.findElement(By.name("username")).sendKeys("Tejal");
          
         driver.findElement(By.id("signin")); */
       
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			
		}
		
        driver.findElement(By.partialLinkText("Create an account")).click();
         
       driver.findElement(By.id("usernamereg-firstName")).sendKeys("Tejal");
       driver.findElement(By.id("usernamereg-lastName")).sendKeys("L");
       driver.findElement(By.name("yid")).sendKeys("maniteja.l2015@yahoo.com");
       driver.findElement(By.className("password-field blurred")).sendKeys("1234");
       driver.findElement(By.name("phone")).sendKeys("+16025759586");
       driver.findElement(By.id("usernamereg-day")).sendKeys("4");
       driver.findElement(By.name("yyyy")).sendKeys("1996");
       driver.close(); 
	}

}
