package com.kodilla.testing.library;

public class RentedBook {
    private Book book;
    private LibraryUser libraryUser;

    public RentedBook(Book book, LibraryUser libraryUser) {
        this.book = book;
        this.libraryUser = libraryUser;
    }

    public Book getBook() {
        return book;
    }

    public LibraryUser getLibraryUser() {
        return libraryUser;
    }
}
