Feature: Login fields

  Scenario: Validating login fields with invalid username and valid password
    Given user is on facebook application
    When user enter invalid username and valid password
    And user click on login button
