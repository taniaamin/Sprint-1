$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hotelsearch.feature");
formatter.feature({
  "line": 2,
  "name": "Hotels search feature",
  "description": "",
  "id": "hotels-search-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@hotelsearch"
    }
  ]
});
formatter.before({
  "duration": 10443062569,
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
  "name": "I am on home page of Hotels",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelsSD.iAmOnHomePageOfHotels()"
});
formatter.result({
  "duration": 2351163955,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify user is able to successfully search for hotels with desired information provided",
  "description": "",
  "id": "hotels-search-feature;verify-user-is-able-to-successfully-search-for-hotels-with-desired-information-provided",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@hotels-TA4"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I click on Destination field on home screen",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I select 2 Adults and 1 Children of age 5",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on CheckIn field on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select tomorrow from calendar",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on CheckOut field on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select 6 days forward from calendar",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter orlando into Destination field on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select Orlando, Florida, United States of America from auto suggestion list",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on Search field on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I verify all my information are correct",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Destination",
      "offset": 11
    }
  ],
  "location": "HotelsSD.clickOn(String)"
});
formatter.result({
  "duration": 1116015955,
  "status": "passed"
});
formatter.match({
  "location": "HotelsSD.selectOption()"
});
formatter.result({
  "duration": 1034367980,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CheckIn",
      "offset": 11
    }
  ],
  "location": "HotelsSD.clickOn(String)"
});
formatter.result({
  "duration": 204668773,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tomorrow",
      "offset": 9
    }
  ],
  "location": "HotelsSD.chooseDates(String)"
});
formatter.result({
  "duration": 1354486520,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CheckOut",
      "offset": 11
    }
  ],
  "location": "HotelsSD.clickOn(String)"
});
formatter.result({
  "duration": 107368826,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6 days forward",
      "offset": 9
    }
  ],
  "location": "HotelsSD.chooseDates(String)"
});
formatter.result({
  "duration": 812852509,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "orlando",
      "offset": 8
    }
  ],
  "location": "HotelsSD.enterDataIntoTextFields(String)"
});
formatter.result({
  "duration": 3227569202,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Orlando, Florida, United States of America",
      "offset": 9
    }
  ],
  "location": "HotelsSD.selectFromAutoSuggestion(String)"
});
formatter.result({
  "duration": 147897905,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search",
      "offset": 11
    }
  ],
  "location": "HotelsSD.clickOn(String)"
});
formatter.result({
  "duration": 2926885204,
  "status": "passed"
});
formatter.match({
  "location": "HotelsSD.verifyInformation()"
});
formatter.result({
  "duration": 1766301032,
  "status": "passed"
});
formatter.after({
  "duration": 4222678873,
  "status": "passed"
});
});