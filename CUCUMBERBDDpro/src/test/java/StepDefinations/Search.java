package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

	@Given("^I visit the website as a Guest user$")
	public void i_visit_the_website_as_a_guest_user() {
		System.out.println("I visit the website as a Guest user");

	}

	@Given("^User  visit the website as a guest user$")
	public void user_visit_the_website_as_a_guest_user() {
		System.out.println("User  visit the website as a guest user");
	}

	@When("^I select the books option from the search dropdown$")
	public void i_select_the_books_option_from_the_search_dropdown() {
		System.out.println("I select the books option from the search dropdown");
	}

	@When("^User select the baby option from the search dropdown$")
	public void user_select_the_baby_option_from_the_search_dropdown() {
		System.out.println("User select the baby option from the search dropdown");
	}

	@Then("^I should see the page having heading as amazon best reads is getting displayed$")
	public void i_should_see_the_page_having_heading_as_amazon_best_reads_is_getting_displayed() {
		System.out.println("I should see the page having heading as amazon best reads is getting displayed");
	}

	@Then("^User should see page having heading as offers on Baby products is getting displayed$")
	public void user_should_see_page_having_heading_as_offers_on_baby_products_is_getting_displayed() {
		System.out.println("User should see page having heading as offers on Baby products is getting displayed");
	}

	@And("^I click on search Icon option$")
	public void i_click_on_search_icon_option() {
		System.out.println("I click on search Icon option");
	}
    @But("^I should not see other category products$")
	public void i_should_not_see_other_category_products() {
		System.out.println("I should not see other category products");
	}

	@But("^User  should not see other category products$")
	public void user_should_not_see_other_category_products() {
		System.out.println("User  should not see other category products");
	} 
	}


