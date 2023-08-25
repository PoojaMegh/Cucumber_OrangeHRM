Feature: Verify User able to login and 9 widgets should get displayed

      #  1. Launch your oranage HRM URL
      #  2. User Login with valid credential
      #  3. User click on Login button on Login Page
      #  4. Verify total 13 widget's are disply on Dashboard page
      #  5. Verify below widget displayed on Dashboard Page
      #  Quick Access,Buzz Latest Posts,My Actions,Headcount by Location,Employees on Leave Today,Time At Work,Latest Documents,Latest News,COVID-19 Report

  @widgets @smoke @regression
  Scenario: Verify User able to login and all widgets should get displayed
    Given user login using "admin" credentials
    Then user verify Employee Management Header is Displayed
    And user verify Total Visible Widgets count is same as 13
