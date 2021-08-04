Feature: searching hats on amazon
  Background:
    When user is on Amazon.com
    And user search for hats for men

  Scenario: adding two hats
    Then user selects a hat and added two hats in the cart

    Scenario:  adding one hat
      Then user  selects a hat and added one hat in the cart