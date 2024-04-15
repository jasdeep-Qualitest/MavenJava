Feature: Achiev INT Login
    @jajaaja
    Scenario Outline: Verify that user is able to login
    Given Browser is open
    And navigate to Achiev page
    And use click on sign in button
    When user enter <username> and <password>
    And click on signin button
    Then user is navigated on Achieve Home Page
    
    Examples:
    | username | password |
    | achievetestautomation0508+admin1690176851919@gmail.com | Test@1234 |
  

    
