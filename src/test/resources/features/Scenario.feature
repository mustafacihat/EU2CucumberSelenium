Feature: Scenario pages

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


  Scenario: Modules Options
    Given the user logged in successfully as "driver"
    Then the user should get following options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |


  @lesson
  Scenario: login test for verifying user full name
    Given the user is on the login page
    When the user logs in with following info
      | username  | user10      |
      | password  | UserUser123 |
      | firstname | BrendenN     |
      | lastname  | Schneider   |
    Then the user should be able to login

