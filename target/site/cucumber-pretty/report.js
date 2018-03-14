$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hotelswhereto.feature");
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
  "duration": 43979768771,
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
  "duration": 7642784854,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify user is able to successfully search for hotels",
  "description": "",
  "id": "hotels-search-feature;verify-user-is-able-to-successfully-search-for-hotels",
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
  "name": "I go over to popup and close alert",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I click on Destination field on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter vatican city into Destination field on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select Vatican City (all), Vatican City from auto suggestion list",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select More options from Rooms dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select 2 from Adults dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select 1 from Children dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select 5 from Child1 dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on CheckIn field on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select tomorrow from calendar",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on CheckOut field on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select 6 days forward from calendar",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on Search field on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I verify all my information are correct",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelsSD.hoverOverOnHomePage()"
});
formatter.result({
  "duration": 1178920336,
  "status": "passed"
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
  "duration": 498916157,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vatican city",
      "offset": 8
    },
    {
      "val": "Destination",
      "offset": 26
    }
  ],
  "location": "HotelsSD.enterDataIntoTextFields(String,String)"
});
formatter.result({
  "duration": 1714032635,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vatican City (all), Vatican City",
      "offset": 9
    }
  ],
  "location": "HotelsSD.selectFromAutoSuggestion(String)"
});
formatter.result({
  "duration": 10069633996,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "More options",
      "offset": 9
    },
    {
      "val": "Rooms",
      "offset": 27
    }
  ],
  "location": "HotelsSD.clickOnField(String,String)"
});
formatter.result({
  "duration": 80846,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 9
    },
    {
      "val": "Adults",
      "offset": 16
    }
  ],
  "location": "HotelsSD.clickOnField(String,String)"
});
formatter.result({
  "duration": 84866,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 9
    },
    {
      "val": "Children",
      "offset": 16
    }
  ],
  "location": "HotelsSD.clickOnField(String,String)"
});
formatter.result({
  "duration": 95894,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 9
    },
    {
      "val": "Child1",
      "offset": 16
    }
  ],
  "location": "HotelsSD.clickOnField(String,String)"
});
formatter.result({
  "duration": 187008,
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
  "duration": 307003132,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cinput type\u003d\"text\" class\u003d\"query-localised-check-in \" name\u003d\"q-localised-check-in\" id\u003d\"qf-0q-localised-check-in\" placeholder\u003d\"mm/dd/yy\" aria-haspopup\u003d\"true\" aria-labelledby\u003d\"widget-query-label-1 widget-query-label-2\" autocomplete\u003d\"off\"\u003e is not clickable at point (201, 266). Other element would receive the click: \u003cspan class\u003d\"highlighted\"\u003e...\u003c/span\u003e\n  (Session info: chrome\u003d65.0.3325.162)\n  (Driver info: chromedriver\u003d2.35.528157 (4429ca2590d6988c0745c24c8858745aaaec01ef),platform\u003dMac OS X 10.13.1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 44 milliseconds\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027tanias-MBP.fios-router.home\u0027, ip: \u0027192.168.1.156\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.1\u0027, java.version: \u00271.8.0_91\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.35.528157 (4429ca2590d6988c0745c24c8858745aaaec01ef), userDataDir\u003d/var/folders/j1/kd_mzlp16cdbgcz8_vp38yt80000gn/T/.org.chromium.Chromium.OMWaMA}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d65.0.3325.162, platform\u003dMAC, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 72c6d19ef7c531430c0c2298cd45593c\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:272)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:82)\n\tat framework.BasePage.clickOn(BasePage.java:43)\n\tat framework.HotelsHomePage.checkInField(HotelsHomePage.java:62)\n\tat stepdefinition.HotelsSD.clickOn(HotelsSD.java:42)\n\tat ✽.And I click on CheckIn field on home screen(hotelswhereto.feature:19)\n",
  "status": "failed"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "HotelsSD.verifyInformation()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 711340111,
  "status": "passed"
});
});