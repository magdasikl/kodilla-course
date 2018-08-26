package com.kodilla.sudoku;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class SudokuGameTest {

    private static String[] startingState = new String[]{
            "0,1,2",
            "0,3,5",
            "0,5,1",
            "0,7,9",
            "1,0,8",
            "1,3,2",
            "1,5,3",
            "1,8,6",
            "2,1,3",
            "2,4,6",
            "2,7,7",
            "3,2,1",
            "3,6,6",
            "4,0,5",
            "4,1,4",
            "4,7,1",
            "4,8,9",
            "5,2,2",
            "5,6,7",
            "6,1,9",
            "6,4,3",
            "6,7,8",
            "7,0,2",
            "7,3,8",
            "7,5,4",
            "7,8,7",
            "8,1,1",
            "8,3,9",
            "8,5,7",
            "8,7,6"
    };

    @Test
    public void shouldLoadBoard() {
        // given:
        SudokuGame sudokuGame = new SudokuGame();

        // when:
        SudokuBoard board = sudokuGame.load(startingState);

        // then:
        String toString = board.toString();
        System.out.println(toString);

        // uzupełnianie zerem pustych kratek
        toString = toString.replaceAll("  ", " 0");

        String expected =
                " 0 2 0 | 5 0 1 | 0 9 0" +
                        " 8 0 0 | 2 0 3 | 0 0 6" +
                        " 0 3 0 | 0 6 0 | 0 7 0" +
                        " ------+-------+------" +
                        " 0 0 1 | 0 0 0 | 6 0 0" +
                        " 5 4 0 | 0 0 0 | 0 1 9" +
                        " 0 0 2 | 0 0 0 | 7 0 0" +
                        " ------+-------+------" +
                        " 0 9 0 | 0 3 0 | 0 8 0" +
                        " 2 0 0 | 8 0 4 | 0 0 7" +
                        " 0 1 0 | 9 0 7 | 0 6 0";

        // przemiana wydruków w ciągi liczb
        // usuwanie wszystkiego [^] co nie jest liczbą - digit i zamieni to na "" pusty string
        expected = expected.replaceAll("[^\\d]", "");
        toString = toString.replaceAll("[^\\d]", "");

        assertEquals(expected, toString);

        System.out.println(board);
        board.validateAndAssignValues();
        System.out.println(board);

    }


    @Test
    public void shouldSolveSudoku() {
        // given:
        SudokuGame sudokuGame = new SudokuGame();

        // when:
        List<SudokuBoard> solutions = sudokuGame.start(startingState);

        // then:
        Assert.assertTrue(solutions.size() >= 1);

        for (SudokuBoard board : solutions) {
            System.out.println(board);
        }
    }

    @Test
    public void shouldThrowAnExceptionWhenNoPossibilityLeft() {
        // given:
        SudokuGame sudokuGame = Mockito.spy(new SudokuGame());
        String steps = "0,4,1 0,5,2 0,6,3 3,0,4 4,0,5 5,0,6 0,1,7 1,0,8 2,2,9 " + SudokuGame.SOLVE_COMMAND;
        Scanner scanner = new Scanner(steps);

        Mockito.doReturn(scanner).when(sudokuGame).getInputScanner();

        // when:
        try {
             sudokuGame.start(new String[0]);
             Assert.fail("Wyjątek oczekiwany ponieważ w wierzu 0 i kolumnie 0 komórka nie ma żadnych możliwości.");
        } catch (IllegalStateException e) {
            // then: exception thrown
            System.out.println("Wyjątek oczekiwany ponieważ w wierzu 0 i kolumnie 0 komórka nie ma żadnych możliwości.");
        }

    }
}