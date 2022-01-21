Feature:  Login into Tutorialsninja application

@ninja
Scenario: Login to the application with valid credentials 
Given: I navigate to login page of the application 
When: I enter email address as "tejal@gmail.com" and password as "tejal" into the fields
And: I click on the login button
Then: I the user should be able to successfully login
