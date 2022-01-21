package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Softwaretester {
	
 @Given("^I am a \"([a-zA-Z]{1,})\" software tester$")
	    public void i_am_a_good_software_tester(String testerType)  {
	        System.out.println("I am a" + testerType +"Softwareteser");
	    }
 
 @When("^I go to work$")
	    public void i_go_to_work()  {
	 System.out.println(">>I go to work");
	       
	    }

 @And("^I \"([a-zA-Z]{1,})\" with it$")
	    public void i_involve_with_it(String worktype)  {
	       System.out.println(">> i" + worktype + "with it");
	    }
 
 
 @Then("^My boss \"(.*)\" me$")
		    public void my_boss_loves_me(String Bossreaction)  {
		       System.out.println(">>My boss" +Bossreaction +"me");
		    }
	}


