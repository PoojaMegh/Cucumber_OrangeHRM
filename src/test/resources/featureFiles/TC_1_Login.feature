@Login
Feature: Verify Login Functionality

#  1. Launch your oranage HRM URL
#  2. Verify Logo displayed on Login Page
#  3. User Login with valid credential
#  4. User should navigate to home page, Verify ""Employee Management"" header should be visible.

  @LoginWithValidCredentials @smoke @regression
  Scenario Outline: Verify User login with Valid Credentials
    When user verify logo is displayed on Login Page
    Then user enter user name as "<UserName>" to login
    And user enter password as "<Password>" to login
    And user click on "submit" button
    Then user verify Employee Management Header is Displayed

    Examples:
      | UserName | Password   |
      | Admin    | Rs77kA@dKL |

  @LoginWithInValidCredentials
  Scenario Outline: Verify User is not able to login with Inalid Credentials
    When user verify logo is displayed on Login Page
    Then user enter user name as "<UserName>" to login
    And user enter password as "<Password>" to login
    And user click on "submit" button
    Then user verify Invalid Toast Message is Displayed

    Examples:
      | UserName | Password   |
      | Admin    | Rs77kA@dKL123 |