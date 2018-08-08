package com.kodilla.patterns2.observer.homework;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumMentorsTest {
    @Test
    public void testUpdate() {
        //Given
        TasksCourse marek = new TasksCourse("Kolejka Marka ");
        TasksCourse michal = new TasksCourse(" Kolejka Michała");
        TasksCourse wacek = new TasksCourse(" Kolejka Wacka");

        CourseMentor mentorStefan = new CourseMentor("Stefan");
        CourseMentor mentorAdam = new CourseMentor("Adam");

        marek.registerMentor(mentorStefan);
        michal.registerMentor(mentorAdam);
        wacek.registerMentor(mentorStefan);

        //When
        marek.addTask("jygflyufgi");
        marek.addTask("22222222");
        marek.addTask("2222hhhh");
        michal.addTask("333333");
        wacek.addTask("fdkhtfutf");
        wacek.addTask("ftkytf,thf");

        //When
        assertEquals(3, marek.getMessage().size());
        assertEquals(1, michal.getMessage().size());
        assertEquals(2, wacek.getMessage().size());
    }
}