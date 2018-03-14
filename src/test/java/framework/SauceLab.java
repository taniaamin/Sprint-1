package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

/**
 * Created by taniaamin on 2/18/18.
 */
public class SauceLab {

        public static final String USERNAME = "taniaamin123";
        public static final String ACCESS_KEY = "f2b5c685-9ed5-445b-8fe0-2e7de11a6997";
        public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

        public static void main(String[] args) throws Exception {

            DesiredCapabilities caps = DesiredCapabilities.chrome();
            caps.setCapability("platform", "macOS 10.12");
            caps.setCapability("version", "63.0");

            WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

            driver.get("https://www.facebook.com/");
            System.out.println("title of page is: " + driver.getTitle());

            driver.quit();
        }
    }
