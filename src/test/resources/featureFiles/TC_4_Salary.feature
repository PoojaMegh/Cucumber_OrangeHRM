Feature: Verify payable amount is non-zero

    #  1. Launch your oranage HRM URL
    #  2. User Login with valid credential
    #  3. User click on Employee Management tab
    #  4. Click on My Info tab
    #  5. Verify user Personal Details Label displayed
    #  6. Click on ""Salary""
    #  7. Check the payable (CTC) amount is non-zero

  @EmployeeCTC @regression
  Scenario: Verify User login with Valid Credentials
    Given user login using "admin" credentials
    Then user navigate to "Employee Management" dashboard left menu
    Then user navigate to "My Info" tab
    Then user navigate to "Personal Details" tab
    Then user verify profile name is as expected
    And user verify personal details label is displayed
    Then user navigate to "Salary" tab
    Then user verify the payable amount is non-zero





