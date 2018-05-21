package com.kodilla.patterns.factory.task;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    boolean done = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        if (where != null) {
            done = true;
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return done;
    }
}
