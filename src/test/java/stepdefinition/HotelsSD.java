
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
        // HotelsHomePage.clickOnX();
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Hotels.com - Cheap Hotels, Discount Rates & Hotel Deals", "Invalid Home Page");
    }



    @When("^I click on (Destination|CheckIn|CheckOut|Search) field on home screen$")
    public void clickOn(String field) throws InterruptedException {

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
    @When("^I enter (orlando) into Destination field on home screen$")
    public void enterDataIntoTextFields(String destination) throws Exception{
                HotelsHomePage.enterDestination(destination);
        }

    @When("^I select (.+) from auto suggestion list$")
    public void selectFromAutoSuggestion(String city) throws InterruptedException {
        HotelsHomePage.selectFromList(city);
    }
    @When("^I select 2 Adults and 1 Children of age 5$")
    public void selectOption() throws InterruptedException {
                HotelsHomePage.roomSelection();
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
    public void verifyInformation() throws Exception {
        HotelsSearchPage.verifyAllInformation();
    }



}
