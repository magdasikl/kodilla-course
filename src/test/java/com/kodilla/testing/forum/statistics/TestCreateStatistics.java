package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class TestCreateStatistics {

    private Statistics statisticsMock;
    private  List<String> listOfUser;
    @Before
    public void SetUp() throws Exception{
        statisticsMock = mock(Statistics.class);
        listOfUser = new ArrayList<String>();
        Random rand = new Random();
        Integer number;
        for (int i =0; i<100;i++){
            number =  rand.nextInt(50);
            listOfUser.add(number.toString());
        }
    }

    @Test
    public void testCalculateAdvStatistics() {

//        Given
        List<String> listOfUser2 = new ArrayList<String>();

        when(statisticsMock.usersnames()).thenReturn(listOfUser2);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

//          When

        CreateStatistics testStat = new CreateStatistics();
        testStat.calculateAdvStatistics(statisticsMock);

        String iShowStat = testStat.showStatisctics();
        System.out.println(iShowStat);

//        Then

        Assert.assertEquals(0, testStat.getAvgComPost());
        Assert.assertEquals(0, testStat.getAvgComUser());
        Assert.assertEquals(0, testStat.getAvgPostUser());

    }

    @Test
    public void testNumberPosts(){

        //Given

        when(statisticsMock.usersnames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        CreateStatistics testStat = new CreateStatistics();
        testStat.calculateAdvStatistics(statisticsMock);

        String iShowStat = testStat.showStatisctics();
        System.out.println(iShowStat);

        //Then
        Assert.assertEquals(0, testStat.getAvgComPost());
        Assert.assertEquals(0, testStat.getAvgComUser());
        Assert.assertEquals(10, testStat.getAvgPostUser());
        Assert.assertTrue(testStat.commentsCount()<testStat.postsCount());
        Assert.assertFalse(testStat.commentsCount()>testStat.postsCount());
    }

//    @Test
//    public void testNumbersCommentsPosts() {
//
//        //Given
//        when(statisticsMock.usersnames()).thenReturn(listOfUser);
//        when(statisticsMock.postsCount()).thenReturn(100);
//        when(statisticsMock.commentsCount()).thenReturn(10);
//
//        //When
//        CreateStatistics testStat = new CreateStatistics();
//        testStat.calculateAdvStatistics(statisticsMock);
//
//        //Then
//        Assert.assertEquals(0, testStat.getAvgComPost());
//        Assert.assertEquals(0, testStat.getAvgComUser());
//        Assert.assertEquals(10, testStat.getAvgPostUser());
//        Assert.assertTrue(testStat.commentsCount()<testStat.postsCount());
//        Assert.assertFalse(testStat.commentsCount()>testStat.postsCount());
//    }
//
//    @Test
//    public void testNumbersComents() {
//        //Given
//        when(statisticsMock.usersnames()).thenReturn(listOfUser);
//        when(statisticsMock.postsCount()).thenReturn(100);
//        when(statisticsMock.commentsCount()).thenReturn(0);
//
//        //When
//        CreateStatistics testStat = new CreateStatistics();
//        testStat.calculateAdvStatistics(statisticsMock);
//
//        //Then
//        Assert.assertEquals(0, testStat.getAvgComPost());
//        Assert.assertEquals(0, testStat.getAvgComUser());
//        Assert.assertEquals(10, testStat.getAvgPostUser());
//    }
}
