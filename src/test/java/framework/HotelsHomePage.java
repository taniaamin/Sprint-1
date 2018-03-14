package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by taniaamin on 3/9/18.
 */
public class HotelsHomePage extends BasePage {

    private By alertX = By.xpath("//*[@id='managed-overlay']/button");

    //destination
    private By destinationField = By.xpath("//input[@name='q-destination']");
    private By autoSuggest = By.xpath("//button[@class='cta widget-overlay-close']");

    //calendar
    private By checkInField = By.id("qf-0q-localised-check-in");

    private By checkOutField = By.id("qf-0q-localised-check-out");
    private By calendar = By.xpath(".//*[@class='widget-datepicker-bd']/descendant::a");



    private By roomsDropDown = By.xpath("//select[@class='query-rooms']");
    private By adultDropDown = By.xpath("//select[@id='qf-0q-room-0-adults']");
    private By childrenDropDown = By.xpath("//select[@id='qf-0q-room-0-children']");
    private By child1DropDown = By.xpath("//select[@id='qf-0q-room-0-child-0-age']");


    private By search = By.xpath("//button[@class='cta cta-strong']");



    // first, click on 'X' to cross out popup alert
    public void clickOnX(){
        clickOn(alertX);
    }

    //destination selection
    public void destinationField(){
        clickOn(destinationField);
    }
    public void enterDestination(String destination) {
        sendText(destinationField,destination);
    }
    public void selectFromList(String location) throws InterruptedException {
        clickFromAutoCompleteByText(autoSuggest, location);
    }



    //travel time period selection
    public void checkInField(){
    clickOn(checkInField);
    }
    public void selectTomorrowDate() {
        selectTodayFromCalendar(calendar);
    }
    public void checkOutField(){
    clickOn(checkOutField);
    }
    public void selectSixDaysForward() {
        selectSixDaysFromCalender(calendar);
    }



    //Occupancy query fields selection
    public void selectMoreOptions(String text){
        selectDropDownByText(roomsDropDown, text);
    }
    public void selectAdultCount(String value){
        selectDropDownByText(adultDropDown, value);
    }
    public void selectChildrenCount(String value){
        selectDropDownByText(childrenDropDown, value);
    }
    public void selectChild1Count(String value){
        selectDropDownByText(child1DropDown,value);
    }



    //finally, click on SEARCH button to look for hotels on 'HotelsSearchPage'
    public void searchField(){
        clickOn(search);
    }

}




