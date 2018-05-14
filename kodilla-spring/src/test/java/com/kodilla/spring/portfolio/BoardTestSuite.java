package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
//        Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

//        When
        List toDoList = board.addToDoList("task1");
        List inProgresList = board.addInProgressList("task2");
        List doneList = board.addDoneList("task3");
//        Then
        Assert.assertEquals(toDoList.get(0),"task1");
        Assert.assertEquals(inProgresList.get(0),"task2");
        Assert.assertEquals(doneList.get(0),"task3");
    }


}
