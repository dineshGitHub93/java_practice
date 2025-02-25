Feature: To test for verify google search
Scenario: Google search scenario
	Given user is entering google.co.in
	When using is typing the search term "linked-in"
	And enters the return key
	Then the user should see the search results
	