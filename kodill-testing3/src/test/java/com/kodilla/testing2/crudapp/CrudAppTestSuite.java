package com.kodilla.testing2.crudapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testing2.config.WebDriveConfig;

import java.util.Random;

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
        driver.close();
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

//        driver.findElements(By.xpath("//from[@class=\"datatable_row\"]")).stream()
//                .filter(anyForm -> anyForm.findElement(By.xpath()))

    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestCreateTaskToTrello(taskName);

//        final String XPATH_TASK_NAME ="//form[contains(@action,\"createTask\")]/fieldset[1]/input";
//        final String XPATH_TASK_CONTENT ="//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
//        final String XPATH_TASK_BUTTON ="//form[contains(@action,\"createTask\")]/fieldset[3]/button";
//        String taskName = "Task number " + generator.nextInt(100000);
//        String taskContent = taskName + " content";
//
//        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
//        name.sendKeys(taskName);
//
//        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
//        content.sendKeys(taskContent);
//
//        WebElement addButton = driver.findElement(By.xpath(XPATH_TASK_BUTTON));
//        addButton.click();
//        Thread.sleep(2000);
//


    }
}
