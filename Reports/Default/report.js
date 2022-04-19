$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddingConnections.feature");
formatter.feature({
  "line": 2,
  "name": "Adding connections",
  "description": "",
  "id": "adding-connections",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Main"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "I am able to add connections",
  "description": "",
  "id": "adding-connections;i-am-able-to-add-connections",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I enter arian.gorani@gmail.com in email field and I enter konqar1989 in password field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I search for \u003cTitle\u003e on the homepage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on People option right under profile",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I press all connect buttons",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "adding-connections;i-am-able-to-add-connections;",
  "rows": [
    {
      "cells": [
        "Title"
      ],
      "line": 12,
      "id": "adding-connections;i-am-able-to-add-connections;;1"
    },
    {
      "comments": [
        {
          "line": 13,
          "value": "#| qa engineer |"
        }
      ],
      "cells": [
        "it recruiter"
      ],
      "line": 14,
      "id": "adding-connections;i-am-able-to-add-connections;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5924747800,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 13,
      "value": "#| qa engineer |"
    }
  ],
  "line": 14,
  "name": "I am able to add connections",
  "description": "",
  "id": "adding-connections;i-am-able-to-add-connections;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Main"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I enter arian.gorani@gmail.com in email field and I enter konqar1989 in password field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I search for it recruiter on the homepage",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on People option right under profile",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I press all connect buttons",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "arian.gorani@gmail.com",
      "offset": 8
    },
    {
      "val": "konqar1989",
      "offset": 58
    }
  ],
  "location": "LinkedInSD.loginToAccount(String,String)"
});
formatter.result({
  "duration": 12677090200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "it recruiter",
      "offset": 13
    }
  ],
  "location": "LinkedInSD.search(String)"
});
formatter.result({
  "duration": 2574993400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "People",
      "offset": 11
    }
  ],
  "location": "LinkedInSD.clickOnFirstSearchResult(String)"
});
formatter.result({
  "duration": 3174550100,
  "status": "passed"
});
formatter.match({
  "location": "LinkedInSD.pressConnectButtons()"
});
formatter.result({
  "duration": 171940197100,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d100.0.4896.88)\nBuild info: version: \u00274.1.1\u0027, revision: \u0027e8fcc2cecf\u0027\nSystem info: host: \u0027ARIAN-GORANI\u0027, ip: \u0027192.168.1.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_321\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [b719ac445b099ff212125b5016156a94, findElement {using\u003dxpath, value\u003d//span[text()\u003d\u0027Next\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 100.0.4896.88, chrome: {chromedriverVersion: 99.0.4844.51 (d537ec02474b5..., userDataDir: C:\\Users\\arian\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:14287}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:14287/devtoo..., se:cdpVersion: 100.0.4896.88, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: b719ac445b099ff212125b5016156a94\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:359)\r\n\tat Generic.WebCommands$1.apply(WebCommands.java:39)\r\n\tat Generic.WebCommands$1.apply(WebCommands.java:37)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:208)\r\n\tat Generic.WebCommands.getElement(WebCommands.java:37)\r\n\tat Generic.WebCommands.clickThis(WebCommands.java:84)\r\n\tat LinkedPages.LinkedInPOM.scrollToBottomOfPage(LinkedInPOM.java:93)\r\n\tat LinkedInSD.LinkedInSD.pressConnectButtons(LinkedInSD.java:33)\r\n\tat ✽.Then I press all connect buttons(AddingConnections.feature:8)\r\n",
  "status": "failed"
});
});