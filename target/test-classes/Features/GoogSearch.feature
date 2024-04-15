Feature: Feature test google search funtionality

  Scenario: validate search functionality is working fine
    Given browser is open
    And user is on google page
    When user emters a text in search box
    And hits enter
    Then user is navigate to search Results
