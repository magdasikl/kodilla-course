package com.kodilla.sudoku;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SudokuGame {

    public static final Pattern STEP_PATTERN = Pattern.compile("^([0-8]),([0-8]),([1-9])$");
    public static final String SOLVE_COMMAND = "SUDOKU";

    public static void main(String[] args) {
        SudokuGame sudokuGame = new SudokuGame();

        List<SudokuBoard> list = sudokuGame.start(args);

        if (list.isEmpty()) {
            System.out.println("Brak rozwiązania.");
        } else {
            for (SudokuBoard sudokuBoard : list) {
                System.out.println("Rozwiązanie: ");
                System.out.println(sudokuBoard.toString());
                System.out.println();
            }
        }
    }

    private static void addStep(SudokuBoard sudokuBoard, String word) {
        Matcher matcher = STEP_PATTERN.matcher(word);
        if (matcher.matches()) {
            int row = Integer.parseInt(matcher.group(1));
            int col = Integer.parseInt(matcher.group(2));
            int val = Integer.parseInt(matcher.group(3));

            sudokuBoard.setCell(row, col, val);
        } else {
            throw new IllegalArgumentException("Zły krok: " + word);
        }
    }

    public List<SudokuBoard> start(String[] args) {
        SudokuBoard sudokuBoard = load(args);

        return BackTrack.solve(sudokuBoard);
    }

    public SudokuBoard load(String[] args) {
        SudokuBoard sudokuBoard = new SudokuBoard();

        if (args.length > 0) {
            for (String arg : args) {
                addStep(sudokuBoard, arg);
            }
        } else {
            Scanner scanner = getInputScanner();
            scanner.useDelimiter("\\s+");
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (SOLVE_COMMAND.equals(word)) {
                    break;
                } else {
                    addStep(sudokuBoard, word);
                }
            }
        }
        return sudokuBoard;
    }

    protected Scanner getInputScanner() {
        return new Scanner(System.in);
    }

}
