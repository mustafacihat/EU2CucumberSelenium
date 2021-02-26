Feature: Filtering function



  Scenario: check the grid settings
    Given the user logged in as "store manager"
    And the user navigates "Fleet" "Vehicles"
    And the user click on the grid settings button
    When write the "Id" to quick search input box
    Then user should get related "Id" information the top of the opening table in grid settings



  Scenario:
    Given the user logged in as "store manager"
    And the user navigates "Fleet" "Vehicles"
    And the user click on the grid settings button
    And the user click on the Select All
    Then verify all titles in the grid table are shown

