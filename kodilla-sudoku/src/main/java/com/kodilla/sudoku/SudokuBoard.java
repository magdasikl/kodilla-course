package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SudokuBoard {
    List<SudokuRow> rows;

    public SudokuBoard() {
        rows = new ArrayList<>();
        for (int row = 0; row < 9; row++) {
            rows.add(new SudokuRow());
        }
    }

    public static void main(String[] args) {
        SudokuBoard board = new SudokuBoard();
        System.out.println(board.toString());
        board.validateBoxes();
        board.validateRows();
    }

    public SudokuElement get(int row, int col) {
        SudokuRow sudokuRow = rows.get(row);
        List<SudokuElement> elements = sudokuRow.getElements();
        return elements.get(col);
    }

//    public boolean validateCol() {
//        for (int col = 0; col < 9; col++) {
//            HashSet<Integer> set = new HashSet<>();
//            SudokuRow sudokuRow = rows.get(col);
//
//            List<SudokuElement> elements = sudokuRow.getElements();
//            for (int elem = 0; elem < elements.size(); elem++) {
//                SudokuElement sudokuElement = elements.get(col);
//                if (!sudokuElement.isEmpty()) {
//                    if (set.contains(sudokuElement.getValue())) {
//                        return false;
//                    }
//                    set.add(sudokuElement.getValue());
//                }
//            }
//
//        }
//        return false;
//    }

    public boolean validateRows() {
        for (int row = 0; row < rows.size(); row++) {
            HashSet<Integer> set = new HashSet<>();
            SudokuRow sudokuRow = rows.get(row);
            SudokuElement sudokuElement;
            List<SudokuElement> elements = sudokuRow.getElements();
            for (int col = 0; col < elements.size(); col++) {
                sudokuElement = elements.get(col);
                if (!sudokuElement.isEmpty()) {
                    if (set.contains(sudokuElement.getValue())) {
                        return false;
                    }
                    set.add(sudokuElement.getValue());
                }
//                System.out.print( row + " " +col +" | " );
//                if (col == 8) {
//                    System.out.println("\n");
//                }
             }

        }
        return true;
    }

    public boolean validateBoxes() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                HashSet<Integer> set = new HashSet<>();

                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        int row = i * 3 + k;
                        int col = j * 3 + l;
                        SudokuElement sudokuElement = get(row, col);

//                        System.out.printf("%d, %d\n",row,col );

                        if (!sudokuElement.isEmpty()) {
                            if (set.contains(sudokuElement.getValue())) {
                                return false;
                            }
                            set.add(sudokuElement.getValue());
                        }
                    }
                }
//                System.out.println();
            }
        }

        return true;
    }

    @Override
    public String toString() {
        // 1 2 3 | 4 5 6 | 7 8 9
        // 1 2 3 | 4 5 6 | 7 8 9
        // 1 2 3 | 4 5 6 | 7 8 9
        // ------+-------+------
        // 1 2 3 | 4 5 6 | 7 8 9
        // 1 2 3 | 4 5 6 | 7 8 9
        // ------+-------+------
        // 1 2 3 |   5 6 | 7 8 9
        // 1 2 3 | 4 5 6 | 7 8 9
        // 1 2 3 | 4 5 6 | 7 8 9

        StringBuilder builder = new StringBuilder();
        for (int row = 0; row < rows.size(); row++) {
            SudokuRow sudokuRow = rows.get(row);

            List<SudokuElement> elements = sudokuRow.getElements();
            for (int col = 0; col < elements.size(); col++) {
                SudokuElement sudokuElement = elements.get(col);
                builder.append(" ");
                builder.append(sudokuElement.toString());
                if (col == 2 || col == 5) {
                    builder.append(" |");
                }
            }
            builder.append("\n");

            if (row == 2 || row == 5) {
                builder.append(" ------+-------+------");
                builder.append("\n");
            }
        }

        return builder.toString();
    }
}
