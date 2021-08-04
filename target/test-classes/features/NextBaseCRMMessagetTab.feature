@crm
Feature:
    Background: Assuming user is already login
    Given user is on NextBase CRM homepage
Scenario:
  When user clicks the message tab
  And user creates message
  Then user should be able to send message