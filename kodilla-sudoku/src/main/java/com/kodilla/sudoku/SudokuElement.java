package com.kodilla.sudoku;

public class SudokuElement {

    public static int EMPTY = -1;

    private int value;

    public SudokuElement() {
        value = EMPTY;

    }

    public static SudokuElement parse(String value) {
        int i;
        try {
            i = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            i = EMPTY;
        }
        SudokuElement element = new SudokuElement();
        element.value = i;
        return element;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return this.value == EMPTY;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "0";
        } else {
            return Integer.toString(value);
        }
    }
}
