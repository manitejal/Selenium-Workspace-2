package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NOCLoginPage {
     WebDriver driver;

    public  NOCLoginPage (WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }
     @FindBy(id="Email")
        WebElement emailaddressfield;

        @FindBy(id="Password")
        WebElement passwordfield;

        @FindBy(xpath="//button[text()='Log in']")
        WebElement loginbutton;

        @FindBy(xpath = "//a[text()='Logout']")
        WebElement logoutbutton;

        public WebElement emailaddressfield() {

            return emailaddressfield;
        }
        public WebElement passwordfield() {

            return passwordfield;
        }
        public WebElement loginbutton() {

            return loginbutton;
        }

public WebElement logoutbutton(){

            return logoutbutton;
}
    }
