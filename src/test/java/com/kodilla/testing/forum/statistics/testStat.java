package com.kodilla.testing.forum.statistics;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class testStat {

    @Test
    public void testCalculateAdvStatistics() {

//        Given
    Statistics stattisticMock = mock(Statistics.class);
        List<String> listOfUser = new ArrayList<String>();
        listOfUser.add("Adam");
        listOfUser.add("Zosia");
        listOfUser.add("Michał");
        listOfUser.add("Ania");

        when(stattisticMock.usersnames()).thenReturn(listOfUser);
        when(stattisticMock.postsCount()).thenReturn(1);
        when(stattisticMock.commentsCount()).thenReturn(10);

        Stat testStat = new Stat(stattisticMock.usersnames(),stattisticMock.postsCount(),stattisticMock.commentsCount());
        testStat.calculateAdvStatistics(stattisticMock);
        testStat.showStatisctics();




    }

}
