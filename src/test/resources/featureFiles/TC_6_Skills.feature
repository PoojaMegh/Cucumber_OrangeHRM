Feature: Verify When user add new skill that should get display in list

    #  1. Launch your oranage HRM URL
    #  2. User Login with valid credential
    #  3. Click on Qualifications tab
    #  4. User click on Skills tab
    #  5. User click on ""+"" icon on top right corner
    #  6. On popup header should display as ""Add Skill""
    #  7. User Enter Skill as ""Automation Test 1"" or any
    #  8. User Enter any random text in description
    #  9. User click on ""save"" button
    #  10. Verify that new skill getting display on Skill List


  Scenario: Verify newly added skill is getting display on Skill List
    Given user login using "admin" credentials
    Then user navigate to "Employee Management" dashboard left menu
    And user navigate to "More" tab
    And user mouse hover on "Qualifications" tab


    Then user navigate to "Skills" tab
    Then user verify profile name is as expected
    And user verify personal details label is displayed
    Then user navigate to "Salary" tab
    Then user verify the payable amount is non-zero