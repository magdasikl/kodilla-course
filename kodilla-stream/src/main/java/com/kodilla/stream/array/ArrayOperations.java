package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static OptionalDouble getAverage(int[] numbers) {

        IntStream.range(0,numbers.length)
                .map(index -> numbers[index])
                .forEach(System.out::println);

        OptionalDouble average = IntStream.range(0,numbers.length)
                .map(index -> numbers[index])
                .average();
        return average ;
    }
}
