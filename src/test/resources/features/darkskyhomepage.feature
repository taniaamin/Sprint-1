@regression @darkskyhomepage
Feature: Darksky home page

  Background:
    Given I am on home page of Darksky

@darksky-TA1
Scenario: Verify weekly forecast days are displayed correctly

  Then I verify days of the week is displayed correctly on home page



@darksky-TA2
Scenario: Verify low to high value is displayed correctly on weekly forecast section

  When  I click on Today Bar on home screen
  Then I verify low and high temp is displayed correctly on home page


@darksky-TA3
Scenario: Select tomorrow date from Time Machine and Verify date is correct

  When I click on Time Machine on home screen
  And I select tomorrow date from calendar
  Then I verify date selected is displayed in correct format
  And I verify selected date is not clickable