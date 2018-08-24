package testing2.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import testing2.config.WebDriveConfig;

public class FacebookTestingApp {
    public static final String XPATH_WAIT_FOR = "//select[1]";
    public static final String XPATH_SELECT1="//*[@id=\"day\"]";
    public static final String XPATH_SELECT2 = "//*[@id=\"month\"]";
    public static final String XPATH_SELECT3 = "//*[@id=\"year\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriveConfig.getDriver(WebDriveConfig.CHROME);
        driver.get("https://www.facebook.com");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT1));
        Select searchFieldDay = new Select(selectComboDay);
        searchFieldDay.selectByIndex(12);


        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT2));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(12);


        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT3));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByIndex(2);

    }
}
