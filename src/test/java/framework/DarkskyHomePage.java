package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by taniaamin on 3/9/18.
 */
public class DarkskyHomePage extends BasePage {

    private By daysOfWeekBar = By.id("//*[@id='week']/descendant::*[@class='name']");
    private By todayBar = By.xpath("//*[@id='week']/a[1]");
    private By timeMachine = By.xpath("//*[@id='timeMachine']/div[2]/a");
    private By lowTemperature = By.xpath("//*[@id='week']/div[2]/div[1]/div[2]/div[1]/span[1]/span[1]");
    private By highTemperature = By.xpath("//*[@id='week']/div[2]/div[1]/div[2]/div[1]/span[3]/span[1]");
    private By lowTemperatureBar = By.xpath("//*[@id='week']/a[1]/span[2]/span[1]");
    private By highTemperatureBar = By.xpath("//*[@id='week']/a[1]/span[2]/span[3]");
    private By calender = By.xpath("//button[@class='pika-button pika-day']");
            //By.xpath("//*[@class='pika-single']/div/descendant::table");--> not working
    //time machine date title on next link after selecting date from home page Time Machine
    private By dateTitle = By.xpath("//div[@class='date']");

//TA-1 assert functionality to verify Darksky forecast days of week matches our local days
    public void assertForecastDays(){
        //get list of elements
        List<WebElement> list = getDriver().findElements(daysOfWeekBar);
        ArrayList<String> forecastDays = new ArrayList<>();
        for (int i=0;i<list.size();i++){
            forecastDays.add(list.get(i).getText().toUpperCase());
        }
        //get list of days in current week as EEE format
        SimpleDateFormat sdf = new SimpleDateFormat("EEE");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_WEEK, 1);
        ArrayList<String> expectedDays = new ArrayList<>();
        expectedDays.add("Today");
        for (int i = 0; i < 6; i++) {
            expectedDays.add(sdf.format(cal.getTime()));
        }
        //print then compare the two list, actual VS expected
        System.out.println(forecastDays);
        System.out.println(expectedDays);
        Assert.assertEquals(forecastDays, expectedDays);
    }

//TA3- functionality to verify
    public void clickOnTimeMachine() {
        clickOn(timeMachine);
    }
    public void selectTomorrowDate(){
        selectTomorrowFromCalender(calender);
    }
    public String dateFormatDisplay(){
        return getTextFromElement(dateTitle);
    }
    public String selectedDate(){
        return desiredDateWithPattern(1,"EEEE, MMM d, yyyy");
    }
    public boolean elementClickable(){
        return isEnabled(dateTitle);
    }


//TA2- functionality to verify Low and High Temperature Bar matches with summary section details
    public void clickOnToday() {
        clickOn(todayBar);
    }
    public String lowTemperature(){
        return getTextFromElement(lowTemperature);
    }
    public String highTemperature(){
        return getTextFromElement(highTemperature);
    }
    public String lowTemperatureDisplay(){
        return getTextFromElement(lowTemperatureBar);
    }
    public String highTemperatureDisplay(){
        return getTextFromElement(highTemperatureBar);
    }

}





