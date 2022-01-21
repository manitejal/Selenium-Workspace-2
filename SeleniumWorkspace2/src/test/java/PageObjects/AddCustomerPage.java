package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class AddCustomerPage {
    WebDriver ldriver;

    public AddCustomerPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(ldriver, this);
    }


    By Customers = By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");

    public void ClickOnCustomersmenu() {

        ldriver.findElement(Customers).click();
    }

    By CustomersMenu = By.xpath("//a[@href='/Admin/Customer/List']");

    public void ClickonCustomerrsdropmenu() {
        ldriver.findElement(CustomersMenu).click();
    }

    By Addnewbutton = By.xpath("//a[@href='/Admin/Customer/Create']");

    public void ClickonAddnew() {
        ldriver.findElement(Addnewbutton).click();
    }

    By Emailfield = By.id("Email");

    public void emailfield(String Email) {
        ldriver.findElement(Emailfield).sendKeys(Email);
    }

    By Passwordfield = By.id("Password");

    public void Passwordfield(String password) {
        ldriver.findElement(Passwordfield).sendKeys(password);
    }

    By Firstname = By.id("FirstName");

    public void Firstname(String FirstName) {
        ldriver.findElement(Firstname).sendKeys(FirstName);
    }

    By Lastname = By.id("LastName");

    public void Lastname(String LastName) {
        ldriver.findElement(Lastname).sendKeys(LastName);
    }

    By Gender = By.id("Gender_Female");
    By Malegender = By.id("Gender_Male");

    public void Gender(String gender) {
        if (gender.equals("Male")) {
            ldriver.findElement(Malegender).click();
        } else if (gender.equals("Female")) {
            ldriver.findElement(Gender).click();
        } else {
            ldriver.findElement(Gender).click(); //default
        }
    }

    By DOB = By.id("DateOfBirth");

    public void DOB(String dob) throws InterruptedException {
        Thread.sleep(3000);
        ldriver.findElement(DOB);
    }

    By Companyname = By.id("Company");

    public void Companyname(String xyz) {
        ldriver.findElement(Companyname);
    }

/*
    By Newsletter = By.xpath("//ul[@id=\"SelectedNewsletterSubscriptionStoreIds_taglist\"]");

    public void Newsletter() {
        ldriver.findElement(Newsletter).click();
        By Newsletteroption = By.xpath("//li[text()='Test store 2']");
        ldriver.findElement(Newsletteroption).click(); }*/


    By ManagerofVendor = By.id("VendorId");
    By Vendoroption = By.xpath("//option[text()='Vendor 1']");

    public void ManagerofVendor(String Value) {

        ldriver.findElement(ManagerofVendor).click();
    WebElement dropdown = ldriver.findElement(Vendoroption);
    ldriver.findElement(Vendoroption).click();
    }


    By Admincomment = By.id("AdminComment");

    public void Admincomment(String s) {

        ldriver.findElement(Admincomment);
    }

    //Actions methods
    public String getpageTitle() {
        return ldriver.getTitle();
    }

    By btnSave = By.xpath("//button[@name='save']");

    public void clickOnSave() {
        ldriver.findElement(btnSave).click();
    }}


    /*By Customerroles = By.id("SelectedCustomerRoleIds_taglist");
    By listitemAdministrators = By.xpath("//li[@role=\"option\"][text()='Administrators']");
    By listitemGuests = By.xpath("//li[@role=\"option\"][text()='Guests']");
    By listitemRegistered = By.xpath("//li[@role=\"option\"][text()='Registered']");
    By listitemVendors = By.xpath("//li[@role=\"option\"][text()='Vendors']");
    By listitemForunModerators = By.xpath("//option[text()='Forum Moderators']");

    public void Customerroles(String role) throws InterruptedException {
      //  ldriver.findElement(Customerroles).click();
        ldriver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[2]")).click();



        WebElement listitem;

        Thread.sleep(3000);

        if (role.equals("Administrators")) {
            listitem = ldriver.findElement(listitemAdministrators);
        } else if (role.equals("Guests")) {
            listitem = ldriver.findElement(listitemGuests);
        } else if (role.equals("Registered")) {
            listitem = ldriver.findElement(listitemRegistered);
        } else if (role.equals("Vendors")) {
            listitem = ldriver.findElement(listitemVendors);
        } else {
            listitem = ldriver.findElement(listitemForunModerators);
        }

        listitem.click();
        Thread.sleep(3000);

        //JavascriptExecutor js = (JavascriptExecutor)ldriver;
        // js.executeScript("arguments[0].click();", listitem);

    }}*/

