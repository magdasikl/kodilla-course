package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> booksOld = new HashSet<>();
        booksOld.add(new Book("A1","T1",2016,"2016"));
        booksOld.add(new Book("A0","T0",2015,"2015"));
        booksOld.add(new Book("A2","T2",2017,"2017"));
        booksOld.add(new Book("A3","t3",2018,"2018"));

        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int mediana = medianAdapter.publicationYearMedian(booksOld);
        //Then
        assertEquals(2017, mediana);
    }

}