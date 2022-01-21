Feature: Login to the omayo application

  Scenario Outline: User should only be able to login with valid credentilas
    Given: Navigate to application URL
    When: I enter username as "<Someusername>" and passworda as "<somepassword>"into the fields
    And: Clicked  on login button
    Then: I  should be able to login based on "<Exspected>" login status

    Examples: 
      | Someusername   | somepassword | Exspected |
      | arun           |         1234 | failure   |
      | SeleniumByArun | Test143$     | Success   |
      | Test           |         4321 | Failure   |
