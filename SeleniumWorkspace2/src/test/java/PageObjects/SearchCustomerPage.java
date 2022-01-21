package PageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchCustomerPage<WebElements> {
    public WebDriver ldriver;
    WaitHelper waithelper;

    public SearchCustomerPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(ldriver, this);
        waithelper = new WaitHelper(ldriver);
//================================================
    }

    @FindBy(how = How.ID , using = "SearchEmail")
    WebElement Emailfield;

    public void  setEmail(String Email) {
       waithelper.WaitForElement(Emailfield, 30);
        Emailfield.clear();
        Emailfield.sendKeys(Email);
//===================================================
    }

    @FindBy(id = "SearchFirstName")
    WebElement firstname;

    public void  setfirstname(String fname) {
        waithelper.WaitForElement(firstname, 30);
        firstname.clear();
        firstname.sendKeys(fname);
    }
//===================================================
    @FindBy(id = "SearchLastName")
    WebElement lastname;

    public void  setlastname(String lName) {
        waithelper.WaitForElement(lastname, 30);
        lastname.clear();
        lastname.sendKeys(lName);
    }
//===================================================
    @FindBy(id = "SearchCompany")
    WebElement companyname;

    public WebElement companyname() {
        return companyname;
    }

    @FindBy(id = "SearchIpAddress")
    WebElement Ipaddress;

    public WebElement Ipaddress() {
        return Ipaddress;
    }
//=====================================
    @FindBy(id = "search-customers")
    WebElement searchcustomerbutton ;

    public void Searchbutton(){
        searchcustomerbutton.click();
        waithelper.WaitForElement(searchcustomerbutton, 30);

    }
//=======================================================

    @FindBy(id = "SearchMonthOfBirth")
    WebElement searchmonth;

    public WebElement searchmonth() {
        return searchmonth;
    }

    @FindBy(id = "SearchDayOfBirth")
    WebElement Dateofbirth;

    public WebElement Dateofbirth() {
        return Dateofbirth;
    }

    @FindBy(id = "customers-grid")
    WebElement table;

    public WebElement table() {

        return table;
    }
//===========================================
    @FindBy(xpath = "//table[@role=\"grid\"]//tbody/tr")
    List<WebElement> tablerows;
    public int getNoOfRows(){

        return(tablerows.size());
    }
//=====================================

 @FindBy(xpath = "//table[@role=\"grid\"]//tbody/tr/td")
    List<WebElement>  tablecolumns;

public int getNoOfColumns(){
    return(tablecolumns.size());
}
//===========================================
    public boolean SearchCustomerByEmailID(String email){
        boolean flag =false;

    for(int i=1; i<=getNoOfRows(); i++){
        String emailId =table.findElement(By.xpath("//table[@role=\"grid\"]//tbody/tr[\"+i+\"]/td[2]")).getText();   //table[@role=\"grid\"]//tbody/tr["+i+"]/td[2]=victoria_victoria@nopCommerce.com
        System.out.println(emailId);                                                                                                                                                //tablerow+rownumber+columnnumber to capture text
        if(emailId.equals("victoria_victoria@nopCommerce.com")){
            flag=true;
        }
    }
          return flag;
    }
    //========================

    public boolean SearchCustomerByName(String Name){
 boolean flag=false;

 for (int i =1; i <=getNoOfRows(); i ++){

     String name = table.findElement(By.xpath("//table[@role=\"grid\"]//tbody/tr[\"+i+\"]/td[3]")).getText();
     String names [] =name.split(" ");  //sperating first and last name

     if (names[0].equals("Victoria")&& names[1].equals("Terces")){
         flag =true;
     }
 }

 return flag;
    }


}


