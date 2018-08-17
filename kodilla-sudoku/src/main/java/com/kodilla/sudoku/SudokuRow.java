package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuRow {

    private ArrayList<SudokuElement> elements;

    public SudokuRow() {
        this.elements = new ArrayList();
        for (int i = 0; i < SudokuBoard.SIZE; i++) {
            this.elements.add(new SudokuElement());
        }
    }

    /**
     * Konstruktor kopiujący.
     * @param sudokuRow Oryginał.
     */
    public SudokuRow(SudokuRow sudokuRow) {
        this.elements = new ArrayList();
        for (SudokuElement element : sudokuRow.elements) {
            this.elements.add(new SudokuElement(element));
        }
    }

    public ArrayList<SudokuElement> getElements() {
        return elements;
    }
}
