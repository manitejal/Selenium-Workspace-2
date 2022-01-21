Feature: Customers

  Background: Below are the common steps for each scenario
    Given User Launched Edge browser
    When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And   User enters Email as "admin@yourstore.com" and password as "admin"
    And   Click on login
    Then User can view Dashboard


  Scenario: Add a new customer
    When User click on customers menu
    And  Click on customers menu Item
    And Click on add new button
    Then User can view add new customer page
    When User enter customer info
    And Click on save button
    Then User can view confirmation message "The new customer has been added successfully."
    And  Closing  browser

    Scenario: Search Customer By EmailID
      When User click on customers menu
      And Click on customers menu Item
      And Enter customer Email
      When Click on search button
      Then User should found Email in the search table
      And  Closing  browser

      Scenario: Search Customer by Name
        When User click on customers menu
        And Click on customers menu Item
        And Enter customer FirstName
        And Enter customer LastName
        When Click on search button
        Then User should found Name in the search table
        And  Closing  browser