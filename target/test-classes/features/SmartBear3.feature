Feature:
  @smartbear3
  Scenario:
    Given user is logged into SmartBear Tester account and is on order page
    When user select FamilyAlbum from product dropdown
    And  user enters "4" to quantity
    And user enters "John Wick" to consumer name
    And user enters "Kinzie Ave" to street
    And user enters "Chicago" city
    And user enters "IL" to state
    And user enters "600056"
    And User selects Visa as card type
    And user enters "1111222233334444" to card number
    And user enters "12/22" to expiration date
    And User clicks process button
    Then User verifies "John Wick" is in the list


