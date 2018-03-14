package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.DarkskyHomePage;
import org.testng.Assert;
import org.testng.asserts.Assertion;

/**
 * Created by taniaamin on 3/9/18.
 */
public class DarkskySD {

    private DarkskyHomePage DarkskyHomePage  = new DarkskyHomePage();


// Darksky home page activities:


    @Given("^I am on home page of Darksky$")
    public void iAmOnHomePageOfDarksky() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Dark Sky - 260 Broadway, New York City, NY", "Invalid Home Page");
    }
    @Then("^I verify (days of the week|low temp|high temp) is displayed correctly on home page$")
    public void verifyCorrectDisplay(String textfield) {
        switch (textfield) {
            case "days of week":
                DarkskyHomePage.assertForecastDays();
                break;
            case "low temp":
                Assert.assertEquals(DarkskyHomePage.lowTemperature(), DarkskyHomePage.lowTemperatureDisplay(), "Low temperature doesn't match");
                break;
            case "high temp":
                Assert.assertEquals(DarkskyHomePage.highTemperature(), DarkskyHomePage.highTemperatureDisplay(), "High temperature doesn't match");
                break;
        }
    }

    @When("^I click on (Time Machine|Today) on home screen$")
    public void clickOnBar(String button) {

        switch (button) {
            case "Time Machine":
                DarkskyHomePage.clickOnTimeMachine();
                break;
            case "Today":
                DarkskyHomePage.clickOnToday();
                break;
        }
    }
    @When("^I select (tomorrow) date from calendar$")
    public void iSelectDate(String textfield){
        switch (textfield){
            case "tomorrow's date":
                DarkskyHomePage.selectTomorrowDate();
                break;
        }
    }
    @And("^I verify date selected is displayed in correct format$")
    public void verifyDateFormatDisplay() {
        Assert.assertEquals(DarkskyHomePage.dateFormatDisplay().replaceAll("(?<=\\d)(st|nd|rd|th)", ""), DarkskyHomePage.selectedDate());
    }
    @Then("^I verify selected date is not clickable$")
    public void verifyDateClickable() {
        Assert.assertEquals(DarkskyHomePage.elementClickable(), "False");
    }

}
