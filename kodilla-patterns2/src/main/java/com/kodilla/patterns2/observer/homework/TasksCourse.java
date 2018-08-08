package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TasksCourse implements Mentoring {
    private final List<Mentor> mentors;
    private final List<String> messages;
    private final String name;

    public TasksCourse(String name) {
        mentors = new ArrayList<>();
        messages = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String message){
        messages.add(message);
        notifyMentoring();
    }

    @Override
    public void registerMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    @Override
    public void notifyMentoring() {
        for (Mentor mentor : mentors){
            mentor.update(this);
        }
    }

    @Override
    public void removeMentor(Mentor mentor) {
        mentors.remove(mentor);
    }

    public List<String> getMessage() {
        return messages;
    }

    public String getName() {
        return name;
    }
}
