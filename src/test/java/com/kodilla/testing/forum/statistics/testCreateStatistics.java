package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class testCreateStatistics {

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
        when(stattisticMock.postsCount()).thenReturn(1000);
        when(stattisticMock.commentsCount()).thenReturn(10);

        CreateStatistics testStat = new CreateStatistics();
        testStat.calculateAdvStatistics(stattisticMock);

        String iShowStat = testStat.showStatisctics();
        System.out.println(iShowStat);
//        Then
  //      Assert.assertEquals(10, iShowStat );
        Assert.assertNotEquals(0, testStat.commentsCount());
        Assert.assertNotEquals(0,testStat.postsCount());
        Assert.assertEquals(1000, testStat.postsCount());
        Assert.assertTrue(testStat.commentsCount()<testStat.postsCount());
        Assert.assertFalse(testStat.commentsCount()>testStat.postsCount());
        Assert.assertNotEquals(0, listOfUser.size());
        Assert.assertNotEquals(100, listOfUser.size());



    }

}
