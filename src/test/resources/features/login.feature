Feature: Tests validating login for yahoo.com

Background:
  Given I go to yahoo.com
  And I click accept all

  @smoke-test
  Scenario: Validate authorised user can access and log out of the service
    When I click login from the nav bar
    And I enter stored username
    And I click next button
    And I enter stored password
    And I click authenticate log in
#    When I click authenticate log in
#    And I have logged in successfully
#    Then I log out

