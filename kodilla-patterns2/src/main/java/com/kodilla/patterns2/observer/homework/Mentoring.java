package com.kodilla.patterns2.observer.homework;

public interface Mentoring {
    void registerMentor(Mentor mentor);
    void notifyMentoring();
    void removeMentor(Mentor mentor);
}
