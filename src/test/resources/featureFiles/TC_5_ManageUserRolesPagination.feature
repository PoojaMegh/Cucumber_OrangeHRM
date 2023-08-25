Feature: Verify value display in table according to pagination

    #  1. Launch your oranage HRM URL
    #  2. User Login with valid credential
    #  3. Click on HR Administration tab from left panel
    #  4. Click on Manage User Roles tab from top panel
    #  5. Verify by default 50 record should get display in table.
    #  6. Verify total record and showing count of record in right corner of page

  @ManageUserRolesRecordSummary
  Scenario: Verify correct record summary is displayed at right corner of page
    Given user login using "admin" credentials
    Then user navigate to "HR Administration" dashboard left menu
    And user navigate to "Manage User Roles" tab
    Then user verify by default 50 records should be displayed in table
    And user verify correct record summary is displayed at right corner of page