$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/verifytitle.feature");
formatter.feature({
  "name": "Verify page titles",
  "description": "  Verify page titles when user logs in as a different role",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@verify_title"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Login with a different role and verify page title",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user logs in  as a \"\u003crole\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "click to a \"\u003cmodule\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "title of the page should be \"\u003ctitle\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "role",
        "module",
        "title"
      ]
    },
    {
      "cells": [
        "marketing",
        "Company",
        "Company"
      ]
    },
    {
      "cells": [
        "hr",
        "Company",
        "Company"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with a different role and verify page title",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@verify_title"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logs in  as a \"marketing\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_logs_in_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click to a \"Company\"",
  "keyword": "When "
});
formatter.match({
  "location": "PortalPageStepDefinition.click_to_a(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: [[ChromeDriver: chrome on MAC (d958206e3a03f3855277d76c56d14157)] -\u003e xpath: //span[@class\u003d\u0027menu-item-link-text\u0027][contains(text(),\u0027Company\u0027)]] (tried for 2 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Ruslans-MacBook-Pro.local\u0027, ip: \u00272601:600:8080:11d8:0:0:0:67d9%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u002711.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.100, chrome: {chromedriverVersion: 76.0.3809.126 (d80a294506b4..., userDataDir: /var/folders/ht/90p7sh15201...}, goog:chromeOptions: {debuggerAddress: localhost:52655}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d958206e3a03f3855277d76c56d14157\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\n\tat com.btrix.utilities.BrowserUtility.waitForClickablility(BrowserUtility.java:146)\n\tat com.btrix.utilities.BasePage.navigateToModule(BasePage.java:29)\n\tat com.btrix.step_definitions.PortalPageStepDefinition.click_to_a(PortalPageStepDefinition.java:16)\n\tat ✽.click to a \"Company\"(src/test/resources/features/verifytitle.feature:7)\n",
  "status": "failed"
});
formatter.step({
  "name": "title of the page should be \"Company\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PortalPageStepDefinition.title_of_the_page_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with a different role and verify page title",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@verify_title"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logs in  as a \"hr\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_logs_in_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click to a \"Company\"",
  "keyword": "When "
});
formatter.match({
  "location": "PortalPageStepDefinition.click_to_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of the page should be \"Company\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PortalPageStepDefinition.title_of_the_page_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});