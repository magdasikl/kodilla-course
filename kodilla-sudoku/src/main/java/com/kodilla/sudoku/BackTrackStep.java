package com.kodilla.sudoku;

import java.util.TreeSet;

public class BackTrackStep {

    private int row;
    private int col;
    private TreeSet<Integer> possibilities;

    public BackTrackStep(int row, int col, TreeSet<Integer> possibilities) {
        this.row = row;
        this.col = col;
        this.possibilities = possibilities;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public TreeSet<Integer> getPossibilities() {
        return possibilities;
    }
}
