package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.task.Task;
import com.kodilla.patterns.factory.task.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
//        Given
        TaskFactory taskFactory =new TaskFactory();

//        When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();

//        Then
        Assert.assertEquals("Lidl",shopping.getTaskName());
        Assert.assertTrue(shopping.isTaskExecuted());

    }

    @Test
    public void testFactoryPaintting() {
//        Given
        TaskFactory taskFactory =new TaskFactory();

//        When
        Task paintting = taskFactory.makeTask(TaskFactory.PAINTING);
        paintting.executeTask();

//        Then
        Assert.assertEquals("Natura",paintting.getTaskName());
        Assert.assertTrue(paintting.isTaskExecuted());

    }

    @Test
    public void testFactoryDriving() {
//        Given
        TaskFactory taskFactory =new TaskFactory();

//        When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();

//        Then
        Assert.assertEquals("BMW",driving.getTaskName());
        Assert.assertTrue(driving.isTaskExecuted());

    }
}
