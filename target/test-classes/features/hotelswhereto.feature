 @regression @hotelsearch
Feature: Hotels search feature

  Background:
    Given I am on home page of Hotels


  @hotels-TA4
  Scenario: Verify user is able to successfully search for hotels

    When I go over to popup and close alert
    And I click on Destination field on home screen
    And I enter vatican city into Destination field on home screen
    And I select Vatican City (all), Vatican City from auto suggestion list
    And I select More options from Rooms dropdown
    And I select 2 from Adults dropdown
    And I select 1 from Children dropdown
    And I select 5 from Child1 dropdown
    And I click on CheckIn field on home screen
    And I select tomorrow from calendar
    And I click on CheckOut field on home screen
    And I select 6 days forward from calendar
    And I click on Search field on home screen
    Then I verify all my information are correct
