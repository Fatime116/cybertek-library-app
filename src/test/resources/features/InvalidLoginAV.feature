@login
Feature:InvalidLogin
  Agile Story: As I user, I should be able to login

  Background:
    Given User is on the login page


  @AV
  Scenario: Invalid student login scenario
    When User enters invalid credentials
    Then user should see an error message
