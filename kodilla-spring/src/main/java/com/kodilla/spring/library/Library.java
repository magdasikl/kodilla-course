package com.kodilla.spring.library;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public final class Library {
    private final List<String> books = new ArrayList<>();
    private LibraryDbContoller libraryDbContoller;

    public Library(LibraryDbContoller libraryDbContoller) {
        this.libraryDbContoller = libraryDbContoller;
    }

    public Library() {

    }


////    wstrzykiwanie zalezności poprzez pole
//    @Autowired
//    private LibraryDbContoller libraryDbContoller;


//wstrzykiwanie zależności poprzez metodę
//    @Autowired
//    public void setLibraryDbController(LibraryDbContoller libraryDbController) {
//        this.libraryDbContoller = libraryDbController;
//    }

//wtrzykiwanie zależności poprzez konstruktor
//    @Autowired
//    public Library(LibraryDbContoller libraryDbContoller) {
//        this.libraryDbContoller = libraryDbContoller;
//    }
//
//    public Library() {
////        do nothing
//    }

    public void saveToDb() {
        libraryDbContoller.saveData();
    }

    public void loadFromDb() {
        libraryDbContoller.loadData();
    }
}
