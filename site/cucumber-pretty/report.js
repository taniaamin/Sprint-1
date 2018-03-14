$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("amazonLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Verify Signup Feature",
  "description": "",
  "id": "verify-signup-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@signup"
    }
  ]
});
formatter.before({
  "duration": 12784849334,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on home page of Amazon",
  "keyword": "Given "
});
formatter.match({
  "location": "amazonLoginSD.iAmOnHomePage()"
});
formatter.result({
  "duration": 464026236,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify user should not be able to login using invalid credentials",
  "description": "",
  "id": "verify-signup-feature;verify-user-should-not-be-able-to-login-using-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@signup_amazone"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I Hover over to Accounts \u0026 List",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter sometext into email address field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter test123 into password field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify invalid error message",
  "keyword": "Then "
});
formatter.match({
  "location": "amazonLoginSD.hoverOverToAccountAndList()"
});
formatter.result({
  "duration": 117740106,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign in",
      "offset": 11
    }
  ],
  "location": "amazonLoginSD.clickOnLoginButton(String)"
});
formatter.result({
  "duration": 1808150263,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sometext",
      "offset": 8
    },
    {
      "val": "email address",
      "offset": 22
    }
  ],
  "location": "amazonLoginSD.insertTextInInputField(String,String)"
});
formatter.result({
  "duration": 134221361,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test123",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 21
    }
  ],
  "location": "amazonLoginSD.insertTextInInputField(String,String)"
});
formatter.result({
  "duration": 92338063,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "continue",
      "offset": 11
    }
  ],
  "location": "amazonLoginSD.clickOnLoginButton(String)"
});
formatter.result({
  "duration": 1376816264,
  "status": "passed"
});
formatter.match({
  "location": "amazonLoginSD.verifyErrorMesseges()"
});
formatter.result({
  "duration": 90209178,
  "status": "passed"
});
formatter.after({
  "duration": 158149796,
  "status": "passed"
});
});