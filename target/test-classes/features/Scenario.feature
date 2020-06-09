Feature: 

	#*User Story:* As a user, I should be able to access to Vehicle page. 
	@EU11-290
	Scenario: Truck driver access to Vehicle page
		
		Scenario
		Given the user is on the login page
		When the user enter sales manager information
		Then the user should be able to login
		
		Scenario: Login as a store manager
		Given the user is on the login page
		When the user enter sales manager information
		Then the user should be able to login