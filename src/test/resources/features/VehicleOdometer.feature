Feature: Vehicle odometer function

  @baha
  Scenario: truck driver creation of add attachment
    Given the user logged in as "driver"
    And the user navigates "Fleet" "Vehicle Odometer"
    And the user choose one odometer
    When the user click Add Attachment
    And the user select one file with comment and click the save button
    Then the user should get success message
