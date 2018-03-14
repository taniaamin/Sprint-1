
package stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.HotelsHomePage;
import framework.HotelsSearchPage;
import org.testng.Assert;


public class HotelsSD {


    private HotelsHomePage HotelsHomePage = new HotelsHomePage();
    private HotelsSearchPage HotelsSearchPage = new HotelsSearchPage();



// Hotels home page activities:


    @Given("^I am on home page of Hotels$")
    public void iAmOnHomePageOfHotels() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Hotels.com - Cheap Hotels, Discount Rates & Hotel Deals", "Invalid Home Page");
    }

    @When("^I go over to popup and close alert$")
    public void hoverOverOnHomePage() {
                HotelsHomePage.clickOnX();
        }

    @When("^I click on (Destination|CheckIn|CheckOut|Search) field on home screen$")
    public void clickOn(String field) {

        switch (field) {
            case "Destination":
                HotelsHomePage.destinationField();
                break;
            case "CheckIn":
                HotelsHomePage.checkInField();
                break;
            case "CheckOut":
                HotelsHomePage.checkOutField();
                break;
            case "Search":
                HotelsHomePage.searchField();
                break;
        }
    }
    @When("^I enter (.+) into (Destination) field on home screen$")
    public void enterDataIntoTextFields(String anyText, String textFields) {

        switch (textFields) {
            case "Destination":
                HotelsHomePage.enterDestination(anyText);
                break;
        }
    }
    @When("^I select (.+) from auto suggestion list$")
    public void selectFromAutoSuggestion(String location) throws InterruptedException {
        HotelsHomePage.selectFromList(location);
    }
    @When("^I select (.+) from (Rooms|Adults|Children|Child1) dropdown$")
    public void clickOnField(String dropDown, String text) {

        switch (dropDown) {
            case "Rooms":
                HotelsHomePage.selectMoreOptions(text);
                break;
            case "Adults":
                HotelsHomePage.selectAdultCount(text);
                break;
            case "Children":
                HotelsHomePage.selectChildrenCount(text);
                break;
            case "Child1":
                HotelsHomePage.selectChild1Count(text);
                break;
        }
    }
    @When("^I select (tomorrow|6 days forward) from calendar$")
    public void chooseDates(String dateSelected) {

        switch (dateSelected) {
            case "tomorrow":
                HotelsHomePage.selectTomorrowDate();
                break;
            case "6 days forward":
                HotelsHomePage.selectSixDaysForward();
                break;
        }
    }

    @Then("^I verify all my information are correct$")
    public void verifyInformation() {
        HotelsSearchPage.verifyAllInformation();
    }



}
