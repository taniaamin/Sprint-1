package stepdefinition;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import util.ConfigReader;

public class SharedSD {

	private static WebDriver driver = null;

	public static final String USERNAME = "tamin0306@gmail.com";
	public static final String ACCESS_KEY = "9aedfdc4-a2e9-4db6-b626-2975aca7d76e";
	public static final String SAUCEURL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";


	@Before
	public static void before() throws Exception {

		ConfigReader configReader = new ConfigReader();
		String Browser  = configReader.getBrowser() ;

		switch (Browser) {
			case "CHROME":
				System.setProperty("webdriver.chrome.driver",
						configReader.getChromeDriverPath());
				driver = new ChromeDriver();
				break;
			case "SAFARI":
				driver = new SafariDriver();
				break;
			case "FIREFOX":
				driver = new FirefoxDriver();
				break;
			case "REMOTE":
				DesiredCapabilities caps = DesiredCapabilities.chrome();
				caps.setCapability("platform", "macOS 10.12");
				caps.setCapability("version", "63.0");
			driver = new RemoteWebDriver(new URL(SAUCEURL), caps);
				break;
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(configReader.getUrl());
	}

	@After
	public static void after() {
		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
