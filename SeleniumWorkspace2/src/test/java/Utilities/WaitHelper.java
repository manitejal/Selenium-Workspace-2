package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

    public WebDriver driver;

  //constructor creation
  public WaitHelper(WebDriver driver){

      this.driver=driver;
  }

  public void WaitForElement(WebElement element, long Duration){
      WebDriverWait wait =new WebDriverWait(driver, Duration);
      wait.until(ExpectedConditions.visibilityOf(element));
  }
}
