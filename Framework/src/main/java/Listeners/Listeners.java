package Listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Resources.Base;
import Utilities.ExtentReporter;

public class Listeners extends Base  implements ITestListener{
	WebDriver driver = null;
	ExtentReports extentReport = ExtentReporter.getExtentReport();
	ExtentTest extentTest;

	@Override
	public void onTestStart(ITestResult result) {
		String testName =result.getName();
	extentTest= extentReport.createTest(testName );
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		String testName =result.getName();
		extentTest.log(Status.PASS,testName );	
	}

	@Override
	public void onTestFailure(ITestResult result) {          // you have to add listeners tags to testng.xml  then only it will work 
		extentTest.fail(result.getThrowable());
		//extentTestThread.get().fail(result.getThrowable());
		String testName= result.getName();   //getting testname and that name passing to string 
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());  //getting failured driver and passing to screenshot method 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
		String ScreenshotFilePath= 	Takescreenshot(testName, driver); //these 2 inside parameters which is testname and driver which are declared above
		extentTest.addScreenCaptureFromPath(ScreenshotFilePath, testName);   //adding screenshot to extent reports 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
	
		extentReport.flush();  //after updating this only report will generate 
		
		
	}
	
	

}
