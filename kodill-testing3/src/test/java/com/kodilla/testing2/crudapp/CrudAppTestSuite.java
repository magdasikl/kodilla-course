package com.kodilla.testing2.crudapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import testing2.config.WebDriveConfig;

import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

public class CrudAppTestSuite {
    private static final String BASE_URL = "https://magdasikl.github.io/";
    private WebDriver driver;
    private Random generator;

    @Before
    public void initTests() {
        driver = WebDriveConfig.getDriver(WebDriveConfig.FIREFOX);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @After
    public void cleanUpAfterTest() {
 //       driver.close();
        try {
            driver.close();
        } catch (UnhandledAlertException f) {
            try {
                Alert alert = driver.switchTo().alert();
                String alertText = alert.getText();
                System.out.println("Alert data: " + alertText);
                alert.accept();
            } catch (NoAlertPresentException e) {
                e.printStackTrace();
            }
        }

    }


    public String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME ="//form[contains(@action,\"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT ="//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
        final String XPATH_TASK_BUTTON ="//form[contains(@action,\"createTask\")]/fieldset[3]/button";
        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_TASK_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }

    private void sendTestCreateTaskToTrello (String taskName) throws InterruptedException{
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                        .getText().equals(taskName))
                .forEach(theForm -> {WebElement selectEnement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectEnement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard = theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(1000);
    }

    private boolean checkTaskExistsInTrello (String taskName) throws InterruptedException{
        Thread.sleep(1000);
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriveConfig.getDriver(WebDriveConfig.FIREFOX);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("msiklucka@gmail.com" );
        driverTrello.findElement(By.id("password")).sendKeys("Misius12");
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(2000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-title\"]")).stream()
                .filter(aHref ->aHref.findElements(By.xpath("//span[@titlle=\"kodilla Application\"]")).size()>0)
                .forEach(aHref -> aHref.click());

       Thread.sleep(2000);

        result = driverTrello.findElements(By.xpath("//span")).stream()
                .filter(theSpan -> theSpan.getText().contains(taskName))
                .collect(Collectors.toList())
                .size() > 0;
        driverTrello.close();

        return result;
    }

    public boolean deleteCrudAppTestTask() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println(driver.findElements(By.xpath("//div[@class=\"datatable__tasks-container\"]")).size());
        System.out.println(driver.findElements(By.xpath("//form[@data-task-id=\"6\"]")).size());
        driver.findElements(By.xpath("//form[@data-task-id=\"45\"]")).stream()
                .map(webElements -> webElements.findElement(By.xpath(".//button[@data-task-delete-button=\"\"]")))
                .forEach(webElements -> webElements.click());

        Thread.sleep(5000);

        return true;
    }


    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestCreateTaskToTrello(taskName);
        assertTrue(checkTaskExistsInTrello(taskName));
        assertTrue(deleteCrudAppTestTask());

    }
}
