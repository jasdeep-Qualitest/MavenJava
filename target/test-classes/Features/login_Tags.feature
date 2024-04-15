Feature: feature to Test Login fucntionality

  Scenario: check user is able to login with valid creds
    
    Given user is on login page
    When User enters the username and password
    And click on the sign in button
    Then user navigated to the home page
    

  
