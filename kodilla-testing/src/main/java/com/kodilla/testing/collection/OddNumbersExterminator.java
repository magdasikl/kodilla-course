package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> newNumbers = new ArrayList<Integer>();
        for (Integer number: numbers){
            if (number % 2 == 0){
              newNumbers.add(number);
                System.out.println(number);
            }
        }
        return newNumbers;
    }
}
