package framework;


import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by taniaamin on 3/13/18.
 */
public class HotelsSearchPage extends BasePage {

    // Search page locators
    private By displayDate = By.xpath("//*[@class='search-dates']");
    private By displayLocation = By.xpath("//*[@id='search']/div[1]/div/h1");
    private By displayNights = By.xpath("//*[@class='search-nights']");
    private By displayRoomAdultsChild = By.xpath("//*[@class='search-rooms']");


    //methods to get display text as shown in hotels search page
    public String displayLocation() {
        return getTextFromElement(displayLocation);
    }
    public String displayNights() {
        return getTextFromElement(displayNights);
    }
    public String displayRoomAdultsChild() {
        return getTextFromElement(displayRoomAdultsChild);
    }
    public String displayDateRange() {
        return getTextFromElement(displayDate);
    }


    //method to format our selected date range as per website display format
    public String selectedDateRange() {
        String checkInDateSelected = desiredDateWithPattern(1,"EEE d");
        String checkOutDateSelected = desiredDateWithPattern(6,"EEE d MMMM yyyy");
        String selectedDateRange = checkInDateSelected + " - " +checkOutDateSelected;
        return selectedDateRange;
    }





    //verify all information: actual VS expected
    public void verifyAllInformation() {
        Assert.assertEquals(displayNights(), "5 nights");
        Assert.assertEquals(displayDateRange().toUpperCase(), selectedDateRange().toUpperCase());
        Assert.assertEquals(displayRoomAdultsChild(), "1 room, 2 adults, 1 child");
        Assert.assertEquals(displayLocation(), "Orlando, Florida, United States of America");
    }
}