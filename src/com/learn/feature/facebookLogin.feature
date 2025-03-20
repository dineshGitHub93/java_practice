Feature: Test user login functionality

Scenario: Login application with valid credentials
Given User launch facebook website and navigate to login page
When User enters valid username and password
Then User should redirected to the homepage facebook

Scenario: Login application with invalid credentials
Given User launch facebook website and navigate to login page
When User enters invalid username and password
Then User should see error message