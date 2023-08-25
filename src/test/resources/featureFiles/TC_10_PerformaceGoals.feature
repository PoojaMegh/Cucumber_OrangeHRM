Feature: Create Goal Validation

  @Goal
  Scenario: Verify Goal is created and displayed under unapproved section
    Given user login using "admin" credentials
    When user navigate to "Performance" dashboard left menu
    When user navigate to "Goals" tab
    And user navigate to "My Goals" tab
    Then user validate "Create Goal" element is visible by text
    And user click on Create Goal button
    Then user validate "Goal Name" element is visible by text
    And user set text "Python Selenium Automation" into Goal Name
#    And user set text "Python can be used as programming lang with selenium" into Goal Description
#    And user set "Mon, 11 Sep 2023" due date
#    And user click on "Submit" button by text
#    And user validate user is navigated to Goal details section and able to see "Python Selenium Automation" goal
#    And user navigate back to My Goals page
#    And user navigate to "Unapproved Goals" icon
#    And

    #//span[text(),'Submit']/parent::button | //button[text(),'Submit']