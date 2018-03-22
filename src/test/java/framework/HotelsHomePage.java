package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by taniaamin on 3/9/18.
 */
public class HotelsHomePage extends BasePage {

    //popup alert
    private By alertX = By.xpath("//*[@id='managed-overlay']/button");

    //destination
    private By destinationField = By.xpath("//input[@name='q-destination']");
    private By autoSuggest = By.xpath("//div[@class='autosuggest-category-result']");

    //calendar
    private By checkInField = By.id("qf-0q-localised-check-in");
            //xpath(".//div[@class='widget-query-date']/descendant::label[@id='widget-query-label-2']");
            //By.cssSelector("#widget-query-label-1");
            //By.xpath("//*[@id='widget-query-label-1']");
    private By checkOutField = By.id("qf-0q-localised-check-out");
    private By calendar = By.xpath(".//*[@class='widget-datepicker-bd']/descendant::a");


    //room options
    private By roomsDropDown = By.cssSelector("#qf-0q-compact-occupancy");
    private By adultDropDown = By.xpath("//select[@id='qf-0q-room-0-adults']");
    private By childrenDropDown = By.xpath("//select[@id='qf-0q-room-0-children']");
    private By child1AgeDropDown = By.xpath("//select[@id='qf-0q-room-0-child-0-age']");

    //search button locator
    private By search = By.xpath("//button[@class='cta cta-strong']");



    // first, click on 'X' to cross out popup alert
    public void clickOnX(){
        clickOn(alertX);
    }

    //destination selection
    public void destinationField(){
        clickOn(destinationField);
    }
    public void enterDestination(String destination) throws Exception {
        sendText(destinationField,destination);
        Thread.sleep(3000);
    }
    public void selectFromList(String location) throws InterruptedException {
        clickFromAutoCompleteByText(autoSuggest, location);
    }



    //travel time period selection
    public void checkInField() throws InterruptedException {
    clickOn(checkInField);
    }
    public void selectTomorrowDate() {
        selectDesiredDate(calendar, 1);
    }
    public void checkOutField(){
    clickOn(checkOutField);
    }
    public void selectSixDaysForward() {
        selectDesiredDate(calendar,6);
    }



    //Room query fields selection- 2 adults, 1 children age 5
    public void roomSelection() throws InterruptedException {

        selectDropDownByIndex(roomsDropDown, 2); //index 2 for 'More options..."
        selectDropDownByIndex(adultDropDown, 1); //index 1 for 2 Adults
        selectDropDownByIndex(childrenDropDown, 1); //index 0 for 1 children
        selectDropDownByIndex(child1AgeDropDown, 6); //index 6 for age 5
    }


    //finally, click on SEARCH button to look for hotels on 'HotelsSearchPage'
    public void searchField(){
        clickOn(search);
    }

}




