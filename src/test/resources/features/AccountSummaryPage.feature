Feature: Account summary


  Scenario: valid credentials
    Given authorized user is on the login page
    When user logs in with valid credentials
    Then "Zero - Account Summary" page should be displayed

  Scenario: Account summary page should have to following account types
    Given authorized user is on the login page
    When user logs in with valid credentials
    Then Account summary page should have to following account types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |


  @account_summary_types
    Scenario: Credit Accounts table must have columns Account, Credit Card and Balance.
      Given authorized user is on the login page
      When user logs in with valid credentials
      Then credit accounts table must have following tables
        | Account     |
        | Credit Card |
        | Balance     |





