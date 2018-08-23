package testing2.google;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testing2.config.WebDriveConfig;

public class GoogleTestingApp {
    public static final String SERCHFIELD = "lst-ib";

    public static void main(String[] args) {
        WebDriver driver = WebDriveConfig.getDriver(WebDriveConfig.CHROME);
        driver.get("https://www.google.com");

        WebElement searchField = driver.findElement(By.id(SERCHFIELD));
        searchField.sendKeys("Kodilla");
        searchField.submit();
    }
}
