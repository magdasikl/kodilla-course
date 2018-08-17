package com.kodilla.sudoku;

import java.util.TreeSet;

/**
 * Zadaniem elementu jest orzetrzymywanie stanu pojedyńczej komórki. Przez stan rozumiemy wypełnioną liczbę albo jej niewypełnioną wartość EMPTY albo kolekcje możliwych wartości.
 * Nie może być tak że komórka ma wartość i jeszcze możliwości oraz brak przy pustym zbiorze możliwości. To ostatnie oznacza błąd w ułożeniu.
 */
public class SudokuElement {

    /**
     * Oznacza brak wybranej liczby.
     */
    public static final int EMPTY = -1;

    private int value;

    /**
     * Możliwości w tym polu.
     */
    private TreeSet<Integer> possibilities;

    public SudokuElement() {
        this.value = EMPTY;
        this.possibilities = new TreeSet<>();
        for (int i = 1; i <= SudokuBoard.SIZE; i++) {
            this.possibilities.add(i);
        }
    }

    public SudokuElement(SudokuElement element) {
        this.value = element.value;
        this.possibilities = new TreeSet<>(element.possibilities);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeSet<Integer> getPossibilities() {
        return possibilities;
    }
}
