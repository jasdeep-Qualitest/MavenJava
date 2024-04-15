Feature: Check dashboard functionality

  Background: user is logged in
    Given navigate to Achiev page
    And use click on sign in button
    When user enter valid username and password
    And click on signin button
    Then user is navigated on Achieve Home Page

  Scenario: Verify that admin is able to search course
    And user clicks on search box
    When user enter courseId
    And press enter
    Then Search course should be displayed

  Scenario: Verify that admin is able to open menu option and logout option
    When user clicks on menu button
    Then Menu and logout option displayed
