package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class BackTrack {

    public static List<SudokuBoard> solve(SudokuBoard sudokuBoard) {
        ArrayList<SudokuBoard> solutions = new ArrayList<>();

        solve(sudokuBoard, solutions);

        return solutions;
    }

    private static void solve(SudokuBoard sudokuBoard, List<SudokuBoard> solutions) {
        if (sudokuBoard.validateAndAssignValues()) {
            // koniec rekurencji
            solutions.add(sudokuBoard);
        } else {
            BackTrackStep step = sudokuBoard.determineCellWithLowestPossibilities();
//            if (step.getPossibilities().isEmpty()) { /////////////////////////////////////////////////////////////////////////////
//                System.out.println(step);
//            }
            for (Integer value : step.getPossibilities()) {
                try {
                    SudokuBoard copy = new SudokuBoard(sudokuBoard);

                    // ustawiamy w kopii tablicy jakiś strzał
                    copy.setCell(step.getRow(), step.getCol(), value);

                    System.out.println(sudokuBoard);

                    // wywołanie zagnieżdżone
                    solve(copy, solutions);
                } catch (IllegalStateException e) {
                    // zły strzał
                }
            }
        }
    }
}
