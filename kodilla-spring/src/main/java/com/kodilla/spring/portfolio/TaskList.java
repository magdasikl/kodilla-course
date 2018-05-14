package com.kodilla.spring.portfolio;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public final class TaskList {
    private final List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }
}
