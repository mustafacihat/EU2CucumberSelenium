$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Activity.feature");
formatter.feature({
  "name": "Activity function",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "check all activity types test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@mcy"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in as \"driver\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.ContactsStepDefs.the_user_logged_in_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates \"Fleet\" \"Vehicles\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.NavigationMenuStepDefs.the_user_navigates(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects one vehicle randomly",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.ActivityStepDefs.the_user_selects_one_vehicle_randomly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click the activity button then click the activity type button",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.ActivityStepDefs.the_user_click_the_activity_button_then_click_the_activity_type_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user checks the all checkbox in the activity type",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.ActivityStepDefs.the_user_checks_the_all_checkbox_in_the_activity_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should get informations belong to related check boxes such as \"Call, Task, Email, Note, Calendar event\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.ActivityStepDefs.the_user_should_get_informations_belong_to_related_check_boxes_such_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});