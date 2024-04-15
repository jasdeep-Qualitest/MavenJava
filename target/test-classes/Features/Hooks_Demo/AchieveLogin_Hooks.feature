Feature: Achiev INT Login

  Scenario Outline: Verify that user is able to login
    Given navigate to Achiev page
    And use click on sign in button
    When user enter valid <username> and <password>
    And click on signin button
    Then user is navigated on Achieve Home Page

    Examples: 
      | username                                               | password  |
      | achievetestautomation0508+admin1690176851919@gmail.com | Test@1234 |

  Scenario Outline: Verify that user is unable to login with invalid creds
    Given navigate to Achiev page
    And use click on sign in button
    When user enter invalid <username> and <password>
    And click on signin button
    Then verify invalid creds error message

    Examples: 
      | username                                       | password |
      | achievetestautomation0508+admin11919@gmail.com | Test@134 |
