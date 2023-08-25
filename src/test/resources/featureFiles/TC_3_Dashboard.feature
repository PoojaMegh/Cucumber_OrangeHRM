Feature: Verify Company Details and Employees are non-zero

    #  1. Launch your oranage HRM URL
    #  2. User Login with valid credential
    #  3. Verify User profile is displayed
    #  4. Mouse Hover on Profile and Click on setting icon on profile
    #  5. Verify user menu total 2 options displayed
    #  6. Click on About
    #  7. Verify Employee is more than 0
    #  8. Click on OK button on popup

  @EmployeeCount @smoke @regression
  Scenario: Verify Company Details and Employees are non-zero
    Given user login using "admin" credentials
    Then user verify User profile is displayed
    And user mouse hover on profile and click on setting icon on profile
    Then user verify two options are displayed on menu
    And user click on About option on user menu
    Then user verify Employee count displayed is non-zero
    Then user click on OK button on popup