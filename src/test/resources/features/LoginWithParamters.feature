
Feature: librarian and student with parameterization

  Scenario:
    Given user is login as a librarian
    When user enters the username "username"
    And user enters the password "password"
    And click the sign in button
    Then user will see the librarian page displayed

    Scenario:
      Given user is login as a student
      When user enters the student email "username"
      And user enters the student password "password"
      And click the sign in button
      Then user will see the student page displayed

  Scenario:
    Given user is login as a librarian
    When user enters the  "username" and "password"
    And click the sign in button
    Then users page should display "user"