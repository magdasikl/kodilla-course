package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
//        Given
        Library library = new Library("First Library");
        Book book1 = new Book("title1","author1",LocalDate.of(2018,04,02));
        Book book2 = new Book("title2","author2", LocalDate.of(2017,9,21));

        library.getBooks().add(book1);
        library.getBooks().add(book2);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Secondary Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println(library);
        System.out.println(clonedLibrary);

//        When
//        Then

        Assert.assertEquals(2,library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(2,clonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(),clonedLibrary.getBooks());
    }
}


