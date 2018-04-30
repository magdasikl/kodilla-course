package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;

public class ExceptionalModuleRunner {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        fileReader.readFile();
    }
}
