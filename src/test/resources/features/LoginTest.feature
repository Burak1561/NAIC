Feature: User should not login with invalid credentials
  Scenario: Negative login test
    Given User land on the public application main page
    And User click the login and land on the login page
    When User enter invalid username and password
    And User click the login button
    Then User should see "Login failed, please try again."