package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ArrayOper implements ArrayOperations {
    public OptionalDouble getAverage(int[] numbers){

       IntStream.range(0,numbers.length)
                .forEach(System.out::println);

        OptionalDouble averageNumbers = IntStream.range(0,numbers.length)
                .map(operand -> numbers[operand])
                .average();

        return averageNumbers;
    }

}
