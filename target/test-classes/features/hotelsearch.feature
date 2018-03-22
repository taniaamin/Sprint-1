 @regression @hotelsearch
Feature: Hotels search feature

  Background:
    Given I am on home page of Hotels


  @hotels-TA4
  Scenario: Verify user is able to successfully search for hotels with desired information provided

    When I click on Destination field on home screen
    And I select 2 Adults and 1 Children of age 5
    And I click on CheckIn field on home screen
    And I select tomorrow from calendar
    And I click on CheckOut field on home screen
    And I select 6 days forward from calendar
    And I enter orlando into Destination field on home screen
    And I select Orlando, Florida, United States of America from auto suggestion list
    And I click on Search field on home screen
    Then I verify all my information are correct
