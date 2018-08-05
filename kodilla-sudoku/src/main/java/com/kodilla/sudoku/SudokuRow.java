package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    List<SudokuElement> elements;

    public SudokuRow() {

        elements = new ArrayList<>();
        for (int e =0; e < 9; e++){
            elements.add(new SudokuElement());
        }
    }

    public List<SudokuElement> getElements() {
        return elements;
    }
}
