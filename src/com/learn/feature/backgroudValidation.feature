Feature: user Authentication

Background: 
	Given user is on login page

Scenario: Successful login
	When user enter valid username and password
	Then user should be logged in

Scenario: Invalid login
	When user enter invalid username and password
	Then user should see error message
 
