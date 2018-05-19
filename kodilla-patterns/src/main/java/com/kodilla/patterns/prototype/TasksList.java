package com.kodilla.patterns.prototype;

import java.util.List;

import java.util.ArrayList;

public class TasksList {
    final private String name;
    final private List<Task> taks = new ArrayList<>();

    public TasksList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Task> getTaks() {
        return taks;
    }

    @Override
    public String toString() {
        String s = "   List[" + name + "]";
        for (Task task : taks ) {
            s = s + "\n" + task.toString();
        }
        return s;
    }
}
