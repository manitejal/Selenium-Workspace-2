package SeleniumClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAssignment {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\manit\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://youtube.com");
		 driver.manage().window().maximize();
		  
		  String title =driver.getTitle();
	     
	     String currenturl=driver.getCurrentUrl();
	     if(currenturl.contains("youtube")) {
	    	 
	    	 System.out.println("URL" + currenturl);
	    	 
	     }
	    		
	 
		if(title.contains("you")) {
		System.out.println("Print name contains");
		}else {
			System.out.println("print name invalid");
		}
		
		
		 driver.navigate().back();
		 
	if( title.equalsIgnoreCase("YOUTUBE")) {
		System.out.println("print ignored");
	}
		
	driver.getCurrentUrl();
		 
		 driver.navigate().forward();
		 
		 Object youtube = title;
		if(title.equals(youtube)) {
			
			System.out.println("Print successful ");
		}
		 
		 driver.close();
	}

}
