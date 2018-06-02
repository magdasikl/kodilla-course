package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "My first task";

    @Test
    public void testFindByListName() {

//        Given
        TaskList taskList = new TaskList(LISTNAME, "Description my firt task");
        taskListDao.save(taskList);
        String name = taskList.getListName();

//        When
        List<TaskList> readTaskList = taskListDao.findByListName(name);

//        Then
        Assert.assertEquals(LISTNAME,readTaskList.get(0).getListName());

//        CleanUp
        taskListDao.delete(readTaskList);

    }


}
