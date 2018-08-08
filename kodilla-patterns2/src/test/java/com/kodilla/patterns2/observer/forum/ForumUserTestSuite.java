package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jassiePinkman = new ForumUser("Jassie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jassiePinkman);
        javaToolsForum.registerObserver(jassiePinkman);
        //When
        javaHelpForum.addPost("Hi everyone");
        javaHelpForum.addPost("Hi my friends");
        javaToolsForum.addPost("Hello!");
        javaHelpForum.addPost("Why while?");
        javaToolsForum.addPost("When I try it?");
        //Then
        assertEquals(3,johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5,jassiePinkman.getUpdateCount());
    }
}