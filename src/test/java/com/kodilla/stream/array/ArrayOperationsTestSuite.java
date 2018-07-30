package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
//        Given

        int number[] = new int[20];
        number[0] = 5;
        number[1] = 3;
        number[2] = 6;
        number[3] = 5;
        number[4] = 3;
        number[5] = 2;
        number[6] = 8;
        number[7] = 7;
        number[8] = 5;
        number[9] = 3;
        number[10] = 1;
        number[11] = 2;
        number[12] = 5;
        number[13] = 3;
        number[14] = 6;
        number[15] = 4;
        number[16] = 2;
        number[17] = 2;
        number[18] = 1;
        number[19] = 2;

//        Whem
        ArrayOperations.getAverage(number);
        OptionalDouble number1 = ArrayOperations.getAverage(number);
        OptionalDouble number2 = OptionalDouble.of(3.75);

//        Then
        Assert.assertEquals(number2,number1);

  }
}
