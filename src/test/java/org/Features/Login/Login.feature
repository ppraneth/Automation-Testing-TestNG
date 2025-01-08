Feature: Login

  Background:
    Given User on login page
@T1
  Scenario: User able to login with valid credential
    Then user enters user name and password
    When user clicks on login button
    Then user navigated to home page

  Scenario: User able to logout
    Then user enters user name and password
    When user clicks on login button
    Then user clicks on logout