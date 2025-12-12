
Feature: Test Vinayak Bank Login functionality

  Scenario: Verify Vinayak bank login with valid user details
    Given I lunch the vinayak bank application
    When I enter username and password on the vinayak bank application
    And I click on login button on the vinayak bank application
    Then I verify vinayak bank home page is loaded

