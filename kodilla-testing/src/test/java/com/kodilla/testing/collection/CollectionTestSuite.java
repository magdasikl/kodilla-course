package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
   @Before
   public void before(){
       System.out.println("Test Case: begin");
   }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
//       Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        OddNumbersExterminator checkClass = new OddNumbersExterminator();
//        When
        ArrayList<Integer> emptyList2 = checkClass.exterminate(emptyList);
        System.out.println(emptyList2.size());
//        Then
        Assert.assertEquals(emptyList2, emptyList);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
//       Given
        ArrayList<Integer> normalList = new ArrayList<Integer>();
        ArrayList<Integer> evenList  = new ArrayList<Integer>();
        OddNumbersExterminator checkClass2 = new OddNumbersExterminator();
//        When
        normalList.add(34);
        normalList.add(48);
        normalList.add(67);
        evenList.add(34);
        evenList.add(48);
//       Then
        ArrayList<Integer> exterminatedList = checkClass2.exterminate(normalList);
        Assert.assertEquals(exterminatedList, evenList);
    }






}
