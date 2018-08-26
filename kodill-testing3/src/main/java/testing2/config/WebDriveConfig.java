package testing2.config;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class WebDriveConfig {
    public final static String FIREFOX = "FIREFOX_DRIVER";
    public final static String CHROME = "CHROME_DRIVER";

    public static WebDriver getDriver(final String driver) {

        System.setProperty("java.net.preferIPv4Stack","true");
        System.setProperty("webdriver.gecko.driver","c:\\Selenium-drivers\\Firefox\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","c:\\Selenium-drivers\\Chrome\\chromedriver.exe");


        if (driver.equals(FIREFOX)|| driver.equals(CHROME)) {
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
            return new FirefoxDriver(dc);
        } else if (driver.equals(CHROME)){
            return new ChromeDriver();
        } else {
            throw new IllegalArgumentException();
        }

    }
}
