package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
@Test
 public void methodA() {
	 
	System.out.println("methodA"); 
	 
 }
@BeforeTest
public void methodB() {
	 
	System.out.println("methodB"); 
	 
 }
}
