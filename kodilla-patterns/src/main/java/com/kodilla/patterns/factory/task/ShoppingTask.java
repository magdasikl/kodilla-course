package com.kodilla.patterns.factory.task;

public class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double guantity;
    boolean done = false;

    public ShoppingTask(String taskName, String whatToBuy, double guantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.guantity = guantity;
    }

    @Override
    public void executeTask() {
        if (whatToBuy != null) {
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
