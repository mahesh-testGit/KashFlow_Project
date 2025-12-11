Feature: Test Login functionality

  Scenario: Test KashFlow login with valid user details
    Given I lunch the kash flow application
    When I user enters username and password
    And I click on login button
    Then I verify kash flow home page is loaded