Feature: librarian verifying table content
  @wip
  Scenario:
    Given I am login as a librarian
    When User navigated to users page
    Then users should find the following columns:
      | Actions   |
      | User ID    |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |