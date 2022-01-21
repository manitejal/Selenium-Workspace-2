Feature: Login

  Scenario: Successful login with valid Credentials
    Given User Launched Edge browser
    When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And   User enters Email as "admin@yourstore.com" and password as "admin"
    And   Click on login
    Then  Page title should be "Dashboard/nopCommerce administration"
    When  User click on log out link
    Then   Page title should be "Your Strore.Login"
    And    Closing  browser

  Scenario Outline:  Login Data driven
    Given User Launched Edge browser
    When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And   User enters Email as "<email>" and password as "<password>"
    And Click on login
    Then  Page title should be "Dashboard/nopCommerce administration"
    When  User click on log out link
    Then   Page title should be "Your Strore.Login"
    And    Closing  browser

    Examples:
      | email                           | password|
      |admin@yourstore.com | admin       |
      |admin1@yourstore.com| admin123 |

#    for both Page title should be should include in one stepdefination