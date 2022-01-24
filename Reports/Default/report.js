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
      "cells": [
        "qa engineer"
      ],
      "line": 13,
      "id": "adding-connections;i-am-able-to-add-connections;;2"
    },
    {
      "cells": [
        "it recruiter"
      ],
      "line": 14,
      "id": "adding-connections;i-am-able-to-add-connections;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5159855600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
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
  "name": "I search for qa engineer on the homepage",
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
