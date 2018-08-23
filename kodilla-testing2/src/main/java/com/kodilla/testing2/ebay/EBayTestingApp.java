package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriveConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
    public static void main(String[] args) {

        WebDriver driver = WebDriveConfig.getDriver(WebDriveConfig.CHROME);
        driver.get("https://www.google.com");

        WebElement searchField = driver.findElement(By.name("Laptop"));
        searchField.click();

    }
}
