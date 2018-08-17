package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SudokuBoard {

    public static final int SIZE = 9;

    private ArrayList<SudokuRow> rows;

    public SudokuBoard() {
        this.rows = new ArrayList<>(9);
        for (int i = 0; i < SIZE; i++) {
            this.rows.add(new SudokuRow());
        }
    }

    /**
     * Konstruktor kopiujący.
     *
     * @param sudokuBoard Oryginał.
     */
    public SudokuBoard(SudokuBoard sudokuBoard) {
        this.rows = new ArrayList<>(9);
        for (SudokuRow row : sudokuBoard.rows) {
            this.rows.add(new SudokuRow(row));
        }
    }

    public void setCell(int row, int col, int value) {
        SudokuElement target = getCell(row, col);

        // sprawdzanie czy wcześniej nie została usunięta możliwość
        if (target.getPossibilities().isEmpty()) {
            if (target.getValue() != value) {
                throw new IllegalStateException("Wartość w polu: [" + row + "," + col + "] została już przypisana: " + target.getValue() + " i nie można przypisać: " + value);
            }
        } else if (!target.getPossibilities().contains(value)) {
            throw new IllegalStateException("Nie można ustawić w polu: [" + row + "," + col + "] wartości: " + value + ", ponieważ ta możliwość została już usunięta");
        } else {
            target.setValue(value);
            target.getPossibilities().clear();
        }

        // usuwanie możliwości w innych komórkach w danym wierszu
        List<SudokuElement> rowElements = this.rows.get(row).getElements();
        for (int i = 0; i < SIZE; i++) {
            SudokuElement element = rowElements.get(i);
            element.getPossibilities().remove(value);
        }

        // usuwanie możliwości w innych komórkach w danej kolumnie
        for (int i = 0; i < SIZE; i++) {
            SudokuElement element = this.rows.get(i).getElements().get(col);
            element.getPossibilities().remove(value);
        }

        // usuwanie możliwości w innych komórkach w małym kwadracie
        int k = boxStart(row);
        int l = boxStart(col);
        for (int i = k; i < k + 3; i++) {
            for (int j = l; j < l + 3; j++) {
                SudokuElement element = getCell(i, j);
                element.getPossibilities().remove(value);
            }
        }
    }

    // 0,1,2 -> 0
    // 3,4,5 -> 3
    // 6,7,8 -> 6
    private int boxStart(int i) {
        return (i / 3) * 3;
    }


    /**
     * Wyszukiwanie komórki z tylko jedną możliwością. Walidowanie czy wartości i pozostałe możliwości są poprawne.
     *
     * @return Czy sudoku zostało rozwiązane.
     * @throws IllegalStateException Jeżeli sudoku posiada niepoprawny stan.
     */
    public boolean validateAndAssignValues() throws IllegalStateException {
        boolean solved;
        boolean changed;

        do {
            solved = true;
            changed = false;
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    SudokuElement element = getCell(i, j);

                    boolean emptyPossibilities = element.getPossibilities().isEmpty();
                    boolean unassignedValue = SudokuElement.EMPTY == element.getValue();

                    // walidacja - jeżeli brak możliwości i wartość nieustalona to jest źle
                    if (emptyPossibilities && unassignedValue) {
                        throw new IllegalStateException("Błąd w ułożeniu! Komórka [" + i + "," + j + "]");
                    }

                    // walidacja - jeżeli wartość jest ustalona i pozostały jeszcze możliwości to źle
                    if (!unassignedValue && !emptyPossibilities) {
                        throw new IllegalStateException("Błąd w ułożeniu!");
                    }

                    // jeżeli jest tylko jedna możliwość to ją ustawiamy
                    if (element.getPossibilities().size() == 1) {
                        Integer value = element.getPossibilities().iterator().next();
                        setCell(i, j, value);
                        changed = true;
                    }

                    if (SudokuElement.EMPTY == element.getValue()) {
                        solved = false;
                    }
                }
            }

            // jezeli była zmiana to poszukujemy jeszcze raz czy kolejne kratki nie mają już tylko jednej możliwości
        } while (changed);

        return solved;
    }

    public BackTrackStep determineCellWithLowestPossibilities() {
        SudokuElement best = null;
        int row = -1;
        int col = -1;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                SudokuElement element = getCell(i, j);

                // znajdowanie kratki która ma najmniej możliwości
                if (element.getPossibilities().size() > 0) {
                    if (best == null) {
                        best = element;
                        row = i;
                        col = j;
                    } else {
                        if (element.getPossibilities().size() < best.getPossibilities().size()) {
                            best = element;
                            row = i;
                            col = j;
                        }

                        // 2 możliwości to najlepszy wynik jaki można uzyskać więc nie szukajmy dalej
                        if (best.getPossibilities().size() == 2) {
                            break;
                        }
                    }
                }
            }
        }

        TreeSet<Integer> possibilities = new TreeSet<>();
        if (best != null) {
            possibilities.addAll(best.getPossibilities());
        } else {
            System.out.println(this);
        }
        return new BackTrackStep(row, col, possibilities);
    }

    //dostawanie się do elementu w danym wierszu i w danej kolumnie
    public SudokuElement getCell(int row, int col) {
        SudokuRow sudokuRow = this.rows.get(row);
        SudokuElement sudokuElement = sudokuRow.getElements().get(col);
        return sudokuElement;
    }

    // 1 2 3 | 4 5 6 | 7 8 9
    // 4 5 6 | 7 8 9 | 1 2 3
    // 7 8 9 | 1 2 3 | 4 5 6
    // ------+-------+------
    // 1 2 3 | 4 5 6 | 7 8 9
    // 4 5 6 | 7 8 9 | 1 2 3
    // 7 8 9 | 1 2 3 | 4 5 6
    // ------+-------+------
    // 1 2 3 | 4 5 6 | 7 8 9
    // 4 5 6 | 7 8 9 | 1 2 3
    // 7 8 9 | 1 2 3 | 4 5 6


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < SIZE; i++) {
            SudokuRow sudokuRow = this.rows.get(i);

            for (int j = 0; j < SIZE; j++) {
                SudokuElement element = sudokuRow.getElements().get(j);

                builder.append(" ");
                int value = element.getValue();
                if (SudokuElement.EMPTY == value) {
                    builder.append(" ");
                } else {
                    builder.append(value);
                }

                if (j == 2 || j == 5) {
                    builder.append(" |");
                }
            }

            builder.append("\n");

            if (i == 2 || i == 5) {
                builder.append(" ------+-------+------");
                builder.append("\n");
            }
        }

        return builder.toString();
    }

}
