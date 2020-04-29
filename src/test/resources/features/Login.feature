Feature:Log in

  Only authorized users should be able to login to the application
  Background: open login page
    Given authorized user is on the login page
  Scenario: valid credentials
    When user logs in with valid credentials
    Then "Zero - Account Summary" page should be displayed


  Scenario Outline: Invalid credentials
      When users logs with wrong "<username>" or "<password>"
      Then error message "Login and/or password are wrong." should be displayed.
      Examples:
        | username | password |
        | username | wrong    |
        | wrong    | password |
        |          | password |
        | username |          |


