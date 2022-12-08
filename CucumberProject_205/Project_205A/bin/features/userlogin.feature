Feature: Developing login 
	Scenario: Verifying Login with valid data
		Given navigate to facebook page
		When user enter valid username and invalid password
		And click on login button
		Then Error message displayed