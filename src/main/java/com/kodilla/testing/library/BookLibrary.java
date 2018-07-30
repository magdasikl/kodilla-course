package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
//        Book book = new Book("The book title", "The book author", 2000);
//        bookList.add(book);
//
//        // temporary returning list of one book
//        return bookList;
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser){


        RentedBook rB = new RentedBook (new Book("Krzyżacy", "Sienkiewicz",1999),libraryUser);
        RentedBook rB2 = new RentedBook (new Book("W pustyni", "Sienkiewicz",1999),libraryUser);

        List<RentedBook> listAllRentedBook = new LinkedList<>();
        listAllRentedBook.add(rB);
        listAllRentedBook.add(rB2);

        List<Book> rentBook = new LinkedList<>();
        for (int a=0; a<listAllRentedBook.size(); a++) {
            if (listAllRentedBook.get(a).getLibraryUser().equals(libraryUser)){
                rentBook.add(listAllRentedBook.get(a).getBook());
            }

        }
                return rentBook;
    }


}
