@Main
Feature: Adding connections

  Scenario Outline: I am able to add connections
    When I enter arian.gorani@gmail.com in email field and I enter konqar1989 in password field
    When I search for <Title> on the homepage
    And I click on People option right under profile
    Then I press all connect buttons


    Examples:
      | Title |
      #| qa engineer |
      | qa recruiter  |


