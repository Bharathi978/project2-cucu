$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/f1.feature");
formatter.feature({
  "name": "To check the Facebook page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Check The Login page of the Applications",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@act"
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
  "name": "user has to load the FaceBook Applications",
  "keyword": "When "
});
formatter.match({
  "location": "F1.user_has_to_load_the_FaceBook_Applications()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the invalid username in email fields",
  "rows": [
    {
      "cells": [
        "emailone",
        "sel@123"
      ]
    },
    {
      "cells": [
        "emailtwo",
        "phy@123"
      ]
    },
    {
      "cells": [
        "emailthree",
        "java@123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "F1.user_has_to_pass_the_invalid_username_in_email_fields(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the invalid password in password fields",
  "rows": [
    {
      "cells": [
        "pass",
        "bharathi"
      ]
    },
    {
      "cells": [
        "pass1",
        "sharathi"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "F1.user_has_to_pass_the_invalid_password_in_password_fields(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the login buttons",
  "keyword": "And "
});
formatter.match({
  "location": "F1.user_has_to_click_the_login_buttons()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});