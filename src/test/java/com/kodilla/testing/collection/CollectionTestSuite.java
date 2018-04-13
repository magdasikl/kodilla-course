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
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        OddNumbersExterminator checkClass = new OddNumbersExterminator();
        ArrayList<Integer> emptyList2 = checkClass.exterminate(emptyList);
        System.out.println(emptyList2.size());
        Assert.assertEquals(emptyList2, emptyList);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> normalList = new ArrayList<Integer>();
        OddNumbersExterminator checkClass2 = new OddNumbersExterminator();
        Random theGenerator = new Random();
        int generatedNumber = 0;
        for (int i=0; i < 20; i++){
            generatedNumber = theGenerator.nextInt(30);
            normalList.add(generatedNumber);
        }
        ArrayList<Integer> exterminatedList = checkClass2.exterminate(normalList);
        for(Integer exterminate: exterminatedList){
            if (exterminate % 2 != 0){
                System.out.println("Błąd: "+ exterminate);
            }
        }
    }






}
