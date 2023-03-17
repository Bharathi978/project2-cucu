$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/f1.feature");
formatter.feature({
  "name": "To check the Facebook page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Check The Login page of the Applicationsd",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Data"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to load the FaceBook Applicationsd",
  "keyword": "When "
});
formatter.match({
  "location": "f3.user_has_to_load_the_FaceBook_Applicationsd()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the invalid username in email fieldsd",
  "keyword": "When "
});
formatter.match({
  "location": "f3.user_has_to_pass_the_invalid_username_in_email_fieldsd()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.f3.user_has_to_pass_the_invalid_username_in_email_fieldsd(f3.java:35)\r\n\tat ✽.user has to pass the invalid username in email fieldsd(src/test/resources/f1.feature:38)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user has to pass the invalid password in password fieldsd",
  "keyword": "And "
});
formatter.match({
  "location": "f3.user_has_to_pass_the_invalid_password_in_password_fieldsd()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user has to click the login buttonsd",
  "keyword": "And "
});
formatter.match({
  "location": "f3.user_has_to_click_the_login_buttonsd()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});