Feature: Activity function


  @mcy
  Scenario: check all activity types test
    Given the user logged in as "driver"
    And the user navigates "Fleet" "Vehicles"
    And the user selects one vehicle randomly
    And the user click the activity button then click the activity type button
    When the user checks the all checkbox in the activity type
    Then the user should get informations belong to related check boxes such as "Call, Task, Email, Note, Calendar event"

