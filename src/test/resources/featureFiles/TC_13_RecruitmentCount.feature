Feature: Validate the Recruitment count

    #  1. Launch your oranage HRM URL
    #  2. User Login with valid credential
    #  3. User click on Recuitment tab
    #  4. User validates All candidate count matches the sum of Application Received, Shortlisted, In Progress, Job Offer, Hired, Rejected count

  @AllCandidateCount
  Scenario: Verify All candidate count matches the sum of other Different stage count
    Given user login using "admin" credentials
    When user navigate to "Recruitment (ATS)" dashboard left menu
    #Get all candidates count
    And user navigate to "All Candidates" stage tab
    Then user validate "All Candidates" tab row count

    Then user validate sum of candidates count on "Application Received, Shortlisted, In Progress, Job Offer, Hired, Rejected" tabs

    #User validates All candidate count matches the sum of Application Received, Shortlisted, In Progress, Job Offer, Hired, Rejected count
#    Then user validate All candidate count matches the sum of other Different stage count



    #div.oxd-table-body>div