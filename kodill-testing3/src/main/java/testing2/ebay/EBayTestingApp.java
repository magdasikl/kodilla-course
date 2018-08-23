package testing2.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testing2.config.WebDriveConfig;

public class EBayTestingApp {
    public static void main(String[] args) {

        WebDriver driver = WebDriveConfig.getDriver(WebDriveConfig.CHROME);
        driver.get("https://www.ebay.com/");

        WebElement searchField = driver.findElement(By.id("gh-ac"));
//        WebElement searchField = driver.findElement(By.name("_nkw"));
        searchField.sendKeys("laptop");

        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();

    }
}
