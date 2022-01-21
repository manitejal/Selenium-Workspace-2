

Feature: Register for an account in tutorialsninja application
  

             @register
  Scenario: Register for an account for providing valid credentials 
    Given I navigate to registeration page
    When  I entered the below details
     |Firstname|Tejal          |
     |Lastname |LA             |
     |Email    |tejal@gmail.com|
     |Telephone|12345          |
     |Password |Second@123     |
    And I Selected the privacypolicy option
    And  I clicked on continue button 
    Then  User should be able to register successfully 
   

  
