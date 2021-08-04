Feature:
  @smartbear4
  Scenario Outline:
  Given User is logged into SmartBear Tester account and on Order page
  When User selects “<product>” from product dropdown
  And User enters “<quantity>” to quantity
  And User enters “<customername>” to costumer name
  And User enters “<street>” to street
  And User enters “<city>” to city
  And User enters “<state>” to state
    And User enters “<zip>” to zip
  And User selects cardType as card type
  And User enters “<cardNumber>” to card number
  And User enters  “<expirationDate>” to expiration date
  And User clicks process button
  Then User verifies “<costumerName>” is in the list
    Examples: search terms we are going to use on this project
      | product | quantity  | customername | street  | city | state  | zip              | cardNumber | expirationDate | costumerName |
    |FamilyAlbum  | 4       | John Wick | Kinzie Ave   | Chicago | IL   | 600056 | 1111222233334444 | 12 22      | John Wick      |