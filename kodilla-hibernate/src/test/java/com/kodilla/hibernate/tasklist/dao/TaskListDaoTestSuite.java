package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "My first task";

    @Test
    public void testFindByListName() {

//Given
        TaskList taskList = new TaskList(LISTNAME, "Description my first task");
        taskListDao.save(taskList);
        String name = taskList.getListName();

//When
        List<TaskList> readTaskList = taskListDao.findByListName(name);
        List<TaskList> readTaskList2 = taskListDao.findByListName("Ola");
//Then
        Assert.assertEquals(LISTNAME,readTaskList.get(0).getListName());
        Assert.assertEquals(1,readTaskList.size());
        Assert.assertEquals(0,readTaskList2.size());

//CleanUp
        taskListDao.delete(readTaskList);

    }

    @Test
    public void testTaskListDaoSaveWithTasks() {

    //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);

        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10),false);

        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);

        TaskList taskList = new TaskList(LISTNAME,"ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

    //When
        taskListDao.save(taskList);
        int id = taskList.getId();

    //Then
        Assert.assertNotEquals(0, id);

    //CleanUp
       taskListDao.delete(id);

    }
}
