package com.kodilla.patterns2.observer.homework;

public class CourseMentor implements Mentor {
    public final String username;

    public CourseMentor(String username) {
        this.username = username;
    }

    @Override
    public void update(TasksCourse tasksCourse) {
        System.out.println(username + ": Name course:  " + tasksCourse.getName() + "( sum: " + tasksCourse.getMessage().size() + " tasks)");
    }

    public String getUsername() {
        return username;
    }

}
