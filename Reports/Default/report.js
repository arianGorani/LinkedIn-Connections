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
formatter.before({
  "duration": 5566015500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "I am able to add connections",
  "description": "",
  "id": "adding-connections;i-am-able-to-add-connections",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I enter \u0027yurakty@gmail.com\u0027 in email field and I enter \u0027Yjfjjhds676)\u0027 in password field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I search for \u0027Google\u0027 on the homepage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on \u0027People\u0027 option right under profile",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I search employees by title \u0027qa engineer\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I scroll down and connect all people",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "yurakty@gmail.com",
      "offset": 9
    },
    {
      "val": "Yjfjjhds676)",
      "offset": 56
    }
  ],
  "location": "LinkedInSD.loginToAccount(String,String)"
});
formatter.result({
  "duration": 12773016700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Google",
      "offset": 14
    }
  ],
  "location": "LinkedInSD.search(String)"
});
formatter.result({
  "duration": 3591548500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "People",
      "offset": 12
    }
  ],
  "location": "LinkedInSD.clickOnFirstSearchResult(String)"
});
formatter.result({
  "duration": 3228663700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qa engineer",
      "offset": 29
    }
  ],
  "location": "LinkedInSD.searchFor(String)"
});
formatter.result({
  "duration": 3225597300,
  "status": "passed"
});
formatter.match({
  "location": "LinkedInSD.scrollAndConnect()"
});
