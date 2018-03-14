package framework;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import stepdefinition.SharedSD;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
//import java.util.function.Function;

public class BasePage extends SharedSD {


	// Fluent wait function to be used throughout this class:
	private static WebElement webAction(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(SharedSD.getDriver())
				.withTimeout(15, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.ignoring(ElementNotFoundException.class)
				.withMessage("Webdriver waited for 15 seconds but still could not find the element therefore Timeout Exception has been thrown");

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator); }});

		return element;
	}

	public void clickOn(By locator) {
		webAction(locator).click();
//		try {
//			SharedSD.getDriver().findElement(locator).click();
//		} catch (NoSuchElementException e) {
//			Assert.fail("Element is not found with this locator: " + locator.toString());
//			e.printStackTrace();
//		}
	}

	public void sendText(By locator, String text) {
		try {
			SharedSD.getDriver().findElement(locator).sendKeys(text);
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}

	public String getTextFromElement(By locator) {
		return webAction(locator).getText();
	}

	public void clickOnBrowserBackArrow() {
		SharedSD.getDriver().navigate().back();
	}

	public void clickOnBrowserForwardArrow() {
		SharedSD.getDriver().navigate().forward();
	}

	public void refreshBrowser() {
		SharedSD.getDriver().navigate().refresh();
	}

	// base method for isElements
	public boolean isDisplayed(By locator) {
		return webAction(locator).isDisplayed();
	}

	public boolean isEnabled(By locator) {
		return webAction(locator).isEnabled();
	}

	public boolean isSelected(By locator) {
		return webAction(locator).isSelected();
	}


	// base method for dropdown, we should have options to select by text, index and value
	public void selectDropDownByText(By locator, String text) {
		Select dropDown = new Select(webAction(locator));
		dropDown.selectByVisibleText(text);
	}

	public void selectDropDownByIndex(By locator, int index) {
		Select dropDown = new Select(webAction(locator));
		dropDown.selectByIndex(index);
	}

	public void selectDropDownByValue(By locator, String value) {
		Select dropDown = new Select(webAction(locator));
		dropDown.selectByValue(value);
	}

	//base method for radio button
	public void selectRadioButton (By locator, String attribute, String index){
		List<WebElement> listOfLinks = getDriver().findElements(locator);
		for (WebElement element : listOfLinks ){
			String value = element.getAttribute(attribute);
			if(value.equals(index)){
				element.click();
				break;
			}
		}
	}
	//base method to get date from calender
	public void selectTodayFromCalendar(By locator) {
		SimpleDateFormat sdf = new SimpleDateFormat("d");
		Date date = new Date();
		String todayDate = sdf.format(date);
		List<WebElement> days = getDriver().findElements(locator);
		for (WebElement day : days) {
			String expectedDay = day.getText();
			if (expectedDay.equals(todayDate)) {
				day.click();
				break;
			}
		}
	}

	//base method to get tomorrow date from calender
	public void selectTomorrowFromCalender(By locator) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("d");
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 1);  // 1 represents tomorrow
		List<WebElement> days = getDriver().findElements(locator);
		for (WebElement day : days) {
			String tomorrow = sdf.format(c.getTime());
			String expectedDay = day.getText();
			if (expectedDay.equals(tomorrow)) {
				day.click();
				break;
			}
		}
	}

	//base method to get tomorrow date from calender
	public void selectSixDaysFromCalender(By locator) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("d");
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 6);  // 6 days added from today
		List<WebElement> days = getDriver().findElements(locator);
		for (WebElement day : days) {
			String tomorrow = sdf.format(c.getTime());
			String expectedDay = day.getText();
			if (expectedDay.equals(tomorrow)) {
				day.click();
				break;
			}
		}
	}

	//base method to return desired date with specific pattern as needed
	public static String desiredDateWithPattern(int day,String datePattern){
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
		cal.add(Calendar.DATE,day);
		return sdf.format(cal.getTime());
	}


	// base method to switch to new window and also another method to switch to root window.
	//switch to a particular window using index
	public void switchToWindow(int index) {
		List<String> listOfWindows = new ArrayList<>(SharedSD.getDriver().getWindowHandles());
		SharedSD.getDriver().switchTo().window(listOfWindows.get(index));
	}

	//close current window and switch to initial window
	public void switchToInitialWindowAndCloseCurrentWindow() {
		List<String> listOfWindows = new ArrayList<>(SharedSD.getDriver().getWindowHandles());
		for (int i = 1; i < listOfWindows.size(); i++) {
			SharedSD.getDriver().switchTo().window(listOfWindows.get(i));
			SharedSD.getDriver().close();
		}
		SharedSD.getDriver().switchTo().window(listOfWindows.get(0));
	}

	// base method to handle mouseover
	public void handleMouseOver(By locator) {
		WebElement element = webAction(locator);
		Actions action = new Actions(SharedSD.getDriver());
		action.moveToElement(element).build().perform();
	}

	public void switchToFrame(String string) {
		getDriver().switchTo().frame(string);
	}

	public void acceptAlert() {
		getDriver().switchTo().alert().accept();
	}

	public void dismissAlert() {
		getDriver().switchTo().alert().dismiss();
	}

	public void sendInputToAlert(String string) {
		getDriver().switchTo().alert().sendKeys(string);
	}


	// base method for all of alert functionality.
	public void clickFromAutoCompleteByText(By locator, String string) throws InterruptedException {
		List<WebElement> list = getDriver().findElements(locator);
		for (WebElement e : list){
			if(e.getText().contains(string)){
				e.click();
				Thread.sleep(2000);
				break;
			}
		}
	}


}
