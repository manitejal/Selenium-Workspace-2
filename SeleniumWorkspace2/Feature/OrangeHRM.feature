Feature: OrangeHRM Login

  Scenario: Logo Presence on OrangeHRM home page
    Given I launch edge  browser
    When  I open orange HRM homepage
    Then  I verify that logo present on page
    And   Close browser
