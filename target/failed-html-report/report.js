$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Contacts.feature");
formatter.feature({
  "name": "Contacts page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Default page number",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@master"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enter the driver information",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_enter_the_driver_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates \"Customers\" \"Contacts\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.NavigationMenuStepDefs.the_user_navigates(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "default page number should be 2",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.NavigationMenuStepDefs.default_page_number_should_be(java.lang.Integer)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c2\u003e but was:\u003c1\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:120)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.vytrack.step_definitions.NavigationMenuStepDefs.default_page_number_should_be(NavigationMenuStepDefs.java:54)\r\n\tat ✽.default page number should be 2(file:///C:/Users/Mugetsu/IdeaProjects/EU2CucumberSelenium/src/test/resources/features/Contacts.feature:8)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Menu options",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@master"
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
  "name": "the user should see following options",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.ContactsStepDefs.the_user_should_see_following_options(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: verify menu options expected:\u003c[Fleet, Customers, Activities, System]\u003e but was:\u003c[, , , ]\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:120)\r\n\tat com.vytrack.step_definitions.ContactsStepDefs.the_user_should_see_following_options(ContactsStepDefs.java:54)\r\n\tat ✽.the user should see following options(file:///C:/Users/Mugetsu/IdeaProjects/EU2CucumberSelenium/src/test/resources/features/Contacts.feature:19)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png", "screenshot");
formatter.after({
  "status": "passed"
});
});