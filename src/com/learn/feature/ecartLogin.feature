Feature: user login functionality validation

Scenario Outline: Login app with multiple credentials
Given user is on login page
When user enters "<username>" and "<password>"
Then user should redirect to the homepage

Examples:
		|username|pasword|
		|username1|password1|

Scenario: verify login with multiple credentials
Given The following exist
	|username|password|
	|username1|password1|
	|username2|password2|
	|username3|password3|