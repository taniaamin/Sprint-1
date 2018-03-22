package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.DarkskyHomePage;
import org.apache.xalan.xsltc.runtime.InternalRuntimeError;
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
    @Then("^I verify (days of the week|low and high temp) is displayed correctly on home page$")
    public void verifyCorrectDisplay(String textfield) throws Exception{
        switch (textfield) {
            case "days of week":
                DarkskyHomePage.assertForecastDays();
                break;
            case "low and high temp":
                Assert.assertEquals(DarkskyHomePage.lowTemperature(), DarkskyHomePage.lowTemperatureDisplay());
                Assert.assertEquals(DarkskyHomePage.highTemperature(), DarkskyHomePage.highTemperatureDisplay());
                break;
        }
    }

    @When("^I click on (Time Machine|Today Bar) on home screen$")
    public void clickOnBar(String button) {

        switch (button) {
            case "Time Machine":
                DarkskyHomePage.clickOnTimeMachine();
                break;
            case "Today":
                DarkskyHomePage.clickOnTodayBar();
                break;
        }
    }
    @When("^I select (tomorrow) date from calendar$")
    public void iSelectDate(String textfield) throws InterruptedException{
        switch (textfield){
            case "tomorrow's date":
                DarkskyHomePage.selectTomorrowDate();
                break;
        }
    }
    @Then("^I verify date selected is displayed in correct format$")
    public void verifyDateFormatDisplay() {
        Assert.assertEquals(DarkskyHomePage.dateFormatDisplay(), DarkskyHomePage.selectedDate());
    }
    @Then("^I verify selected date is not clickable$")
    public void verifyDateClickable() {
        DarkskyHomePage.elementClickable();
    }

}
