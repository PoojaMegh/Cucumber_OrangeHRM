Feature: Verify Organization name is updated

      #  1. Launch your oranage HRM URL
      #  2. User Login with valid credential
      #  3. Click on HR Administration tab
      #  4. Mouse Hover on Organization tab
      #  5. User click on General Information tab
      #  6. User change Organization Name to ""Anything""
      #  7. Verify Number of Employees field is disabled
      #  8. User save the information
      #  9. User mouse hover on user profile and click on Setting icon
      #  10. User click on about section
      #  11. Verify that updated Organization name display as ""Anything""

  @OrgNameUpdated
  Scenario: Verify when user update company name that should get reflected in company's about section
    Given user login using "admin" credentials
    Then user navigate to "HR Administration" dashboard left menu
    And user navigate to "Organization" tab
    And user navigate to "General Information" tab
    Then user update "Organization Name" field text
    And user validate Number of Employees field
    Then user click on "Save" button

    Then user verify by default 50 records should be displayed in table
    And user verify correct record summary is displayed at right corner of page
