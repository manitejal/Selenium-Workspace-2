package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	WebDriver driver;
	public Properties prop;
	public WebDriver initializedriver() throws IOException {
		
	  prop =new Properties();
		String propPath =System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties";
		FileInputStream fis =new FileInputStream(propPath);
		prop.load(fis);
		
		
		String Browsername =prop.getProperty("browser");
		if(Browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver =new EdgeDriver();
		}else if(Browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver =new FirefoxDriver();
		}else if(Browsername.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			 driver= new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
	}
  
	
	//creating a reusable taking screenshot 
	
	public String Takescreenshot(String testName,WebDriver driver) throws IOException {
		
		File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destinationFilePath = System.getProperty("user.dir")+"\\screenshots\\"+testName+".png";
		FileUtils.copyFile(SourceFile,new File(destinationFilePath));
		
		
		return destinationFilePath;
	
	}
}
