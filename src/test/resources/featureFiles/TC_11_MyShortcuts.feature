Feature: Verify My Shortcut List

#  1. Launch your oranage HRM URL
#  2. User Login with valid credential
#  3. User click on share icon button beside the question mark on top right corder
#  4. User able to see 9 shortcut is displayed

  @MyShortcut @regression
  Scenario: Verify My Shortcut list displays on click on share icon
    Given user login using "admin" credentials
    When user navigate to "my-shortcut" icon
    Then user verify 9 shortcut is displayed