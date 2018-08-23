package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriveConfig;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_WAIT_FOR = "//select[1]";
    public static final String XPATH_SELECT1 = "//div[contains(@class, \"registration_regesign\")]/div[3]/span[2]/select    select[1]";

    public static void main(String[] args) {
        WebDriver driver = WebDriveConfig.getDriver(WebDriveConfig.CHROME);
        driver.get("https://www.facebook.com");

//        WebElement searchFieldDay = driver.findElement(By.xpath(XPATH_SELECT1));
//        searchFieldDay.sendKeys("11");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT1));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByIndex(11);



    }
}
