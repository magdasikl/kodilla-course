package com.kodilla.testing2.google;


import com.google.common.collect.ImmutableMap;
import com.kodilla.testing2.config.WebDriveConfig;
import okhttp3.ConnectionPool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static final String SERCHFIELD = "lst-ib";

    public static void main(String[] args) {
        System.out.println("test");
        WebDriver driver = WebDriveConfig.getDriver(WebDriveConfig.CHROME);
        driver.get("https://www.google.com");

        org.openqa.selenium.remote.RemoteWebDriver.class.getName();

        WebElement searchField = driver.findElement(By.id(SERCHFIELD));
        searchField.sendKeys("Kodilla");
        searchField.submit();
    }
}
