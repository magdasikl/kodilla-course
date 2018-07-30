package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class TestCreateStatistics {

    private Statistics statisticsMock;
    private  List<String> listOfUser;
    @Before
    public void SetUp() throws Exception{
        statisticsMock = mock(Statistics.class);
        listOfUser = new ArrayList<String>();
        listOfUser.add("Adam");
        listOfUser.add("Zosia");
        listOfUser.add("Michał");
        listOfUser.add("Ania");
    }

    @Test
    public void testCalculateAdvStatistics() {

//        Given

        when(statisticsMock.usersnames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(5);
        when(statisticsMock.commentsCount()).thenReturn(10);

//          When

        CreateStatistics testStat = new CreateStatistics();
        testStat.calculateAdvStatistics(statisticsMock);

        String iShowStat = testStat.showStatisctics();
        System.out.println(iShowStat);

//        Then

        Assert.assertNotEquals(0, testStat.usersnames().size());
        Assert.assertNotEquals(100, testStat.usersnames().size());

    }

    @Test
    public void testNumberPosts(){

        //Given

        when(statisticsMock.usersnames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);

        //When
        CreateStatistics testStat = new CreateStatistics();
        testStat.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertNotEquals(0,testStat.postsCount());
        Assert.assertEquals(1000, testStat.postsCount());
    }

    @Test
    public void testNumbersCommentsPosts() {

        //Given
        when(statisticsMock.usersnames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10);

        //When
        CreateStatistics testStat = new CreateStatistics();
        testStat.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(testStat.commentsCount()<testStat.postsCount());
        Assert.assertFalse(testStat.commentsCount()>testStat.postsCount());
    }

    @Test
    public void testNumbersComents() {
        //Given
        when(statisticsMock.usersnames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        CreateStatistics testStat = new CreateStatistics();
        testStat.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, testStat.commentsCount());
    }
}
