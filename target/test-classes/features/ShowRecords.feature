Feature: librarian verifies users default values

  Scenario:
    Given user is login as librarian
    When librarian navigates to "users" page
  #  When librarian navigates to users page
    And Show records dropdown value should be 10 by default
    Then dropdown shows the following options:
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |


