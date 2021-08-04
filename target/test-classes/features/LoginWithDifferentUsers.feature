Feature:
  @templete
  Scenario Template: data driven testing with different accounts
    Given user is on the login page
    When user eneters "<username>" in the username box
    And use enters "<password>" in the password box
    And user clicks sign in button
    Then user should be able to see "<name>"

    Examples: username and password
      | username            | password | name      |
      | librarian11@library | I61FFPPf | Librarian |
      | student11@library   | tScBPCUr | Student   |

