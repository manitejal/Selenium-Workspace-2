package SeleniumClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browsers{
	 static WebDriver driver;

	 public static void main(String[] args ) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manit\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();  //maximizing browser 
		driver.get("https://gmail.com");
		
		
		System.out.println(driver.getCurrentUrl()); //return to browser 
		
		
	driver.findElement(null) ;//finding dom single  element in html page.
	 driver.findElement(null); // finding more elements 
	  driver.getPageSource();  // written whole Html page 
	  driver.navigate().to("https://gmail.com");  // navigating to different page 
	  driver.navigate().back(); // backward page 
	  driver.navigate().refresh(); //refreshing page 
	  driver.navigate().forward();  //forwarding page 
	  driver.getTitle();     //windows name or title
	  driver.switchTo().alert();  //switching to alert
	  String windowname =driver.getWindowHandle();   //  before switching to child window we are storing parent window 
	  driver.switchTo().window(windowname);
	   
	  driver.switchTo().frame(0); //navigating to frames in html  iframe 
	 
driver.close();  
		 
		
	 }	
		
}

	 
