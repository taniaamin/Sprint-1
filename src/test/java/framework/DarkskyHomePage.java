package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import stepdefinition.SharedSD;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by taniaamin on 3/9/18.
 */
public class DarkskyHomePage extends BasePage {

    //locators for days forecast bar
    private By daysOfWeekBar = By.id("//*[@id='week']/descendant::*[@class='name']");
    private By todayBar = By.xpath("//*[@id='week']/a[1]");


    //locators for temperature bar and details summary
    private By lowTemperature = By.xpath("//div[@class='dayDetails revealed']//div[@class='summary_container']//div[@class='dayExtras']//div[@class='highLowTemp swip']//span[@class='highTemp swip']//span[@class='temp']");
    private By highTemperature = By.xpath("//div[@class='dayDetails revealed']//div[@class='summary_container']//div[@class='dayExtras']//div[@class='highLowTemp swip']//span[@class='lowTemp swap']//span[@class='temp']");
    private By lowTemperatureDisplay = By.xpath("//a[@class='day revealed']//span[@class='tempRange']//span[@class='minTemp']");
    private By highTemperatureDisplay = By.xpath("//a[@class='day revealed']//span[@class='tempRange']//span[@class='maxTemp']");


    //locators for Time Machine
    private By calender = By.xpath("//table[@cellpadding='0']//tbody/tr/td");
            //By.xpath("//*[@class='pika-table']/tbody/descendant::td");
            //By.xpath("//button[@class='pika-button pika-day']");
    private By timeMachine = By.xpath("//*[@id='timeMachine']/div[2]/a");
            //By.xpath("//a[@class='button']");
    //date title on next link after selecting date from home page Time Machine
    private By dateTitle = By.xpath("//div[@class='date']");
            //By.xpath("//*[@id='main']/div[1]/div[1]/div");
            //By.className("date");




//TA-1 assert functionality to verify Darksky forecast days of week matches our local days
    public void assertForecastDays(){
        //get list of days from the web
        List<WebElement> list = getDriver().findElements(daysOfWeekBar);
        ArrayList<String> forecastDays = new ArrayList<>();
        for (int i=0;i<list.size();i++){
            forecastDays.add(list.get(i).getText().toUpperCase());
        }
        //get list of days in our local current week as EEE format
        SimpleDateFormat sdf = new SimpleDateFormat("EEE");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_WEEK, 1);
        ArrayList<String> expectedDays = new ArrayList<>();
        expectedDays.add(0,"Today"); //add "Today" to represent the present day
        for (int i = 0; i < 6; i++) {
            expectedDays.add(sdf.format(cal.getTime()));
        }
        //print and compare the two list, actual VS expected
        System.out.println(forecastDays);
        System.out.println(expectedDays);

        Assert.assertEquals(forecastDays, expectedDays);
    }


//TA2- functionality to verify Low and High Temperature Bar matches with summary section details
    public void clickOnTodayBar() {
        clickOn(todayBar); }
    public String lowTemperature(){
        return getTextFromElement(lowTemperature);
    }
    public String highTemperature(){
        return getTextFromElement(highTemperature);
    }

    public String lowTemperatureDisplay(){
        return getTextFromElement(lowTemperatureDisplay);
    }
    public String highTemperatureDisplay(){
        return getTextFromElement(highTemperatureDisplay);
    }



//TA3- functionality to verify selected date from Time Machine is correct
    public void clickOnTimeMachine() {
        clickOn(timeMachine);
    }
    public void selectTomorrowDate() throws InterruptedException {
        selectDesiredDate(calender,1);
        Thread.sleep(2000);
    }
    public String dateFormatDisplay(){
        return getTextFromElement(dateTitle).replaceAll("(st|nd|rd|th)", "");
    }
    public String selectedDate(){
        return desiredDateWithPattern(1,"EEEE, MMM d, yyyy");
    }
    public boolean elementClickable(){
        return isEnabled(dateTitle);
    }


}





