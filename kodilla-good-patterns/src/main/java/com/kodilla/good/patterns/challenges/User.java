package com.kodilla.good.patterns.challenges;

public class User {
    public String firstName;
    public String surname;

    public User(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }
}
