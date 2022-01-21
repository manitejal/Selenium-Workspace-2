Feature: search of various product categeries should be possible along with the product search

 Scenario: Search for the products under books category
 Given I visit the website as a Guest user 
 When I select the books option from the search dropdown 
 And I click on search Icon option
 Then I should see the page having heading as amazon best reads is getting displayed 
 But I should not see other category products 
 
 
 Scenario: User should able to search products under baby category 
 Given User  visit the website as a guest user 
 When User select the baby option from the search dropdown 
 Then User should see page having heading as offers on Baby products is getting displayed 
 But User  should not see other category products 
 
 