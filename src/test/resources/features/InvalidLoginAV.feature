@login
Feature:InvalidLogin
  Agile Story: As I user, I should be able to login

  Background:
    Given User is on the login page


  @librarian
  Scenario: Invalid student login scenario
    When User enters valid username
    And User enters invalid password
    Then User should not be able to log in
    And user should see an error message
