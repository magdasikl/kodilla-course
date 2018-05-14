package com.kodilla.spring.portfolio;

import java.util.List;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public List addToDoList(String task) {
       return this.toDoList.addTaskList(task);
    }

    public List addInProgressList(String task) {
       return this.inProgressList.addTaskList(task);
    }

    public List addDoneList(String task) {
       return this.doneList.addTaskList(task);
    }
}
