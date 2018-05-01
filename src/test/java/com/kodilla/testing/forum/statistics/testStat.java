package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
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

//          When
        when(stattisticMock.usersnames()).thenReturn(listOfUser);
        when(stattisticMock.postsCount()).thenReturn(1);
        when(stattisticMock.commentsCount()).thenReturn(10);

        Stat testStat = new Stat(stattisticMock.usersnames(),stattisticMock.postsCount(),stattisticMock.commentsCount());
        int iCal = testStat.calculateAdvStatistics(stattisticMock);
        int iShowStat = testStat.showStatisctics();

//        Then
        Assert.assertEquals(10, iShowStat );
        Assert.assertEquals(10, iCal );





    }

}
