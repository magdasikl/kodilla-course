package com.kodilla.rps;

public enum GameMove {
    Rock("kamień"),
    Paper("papier"),
    Scissors ("nożyce");

    private final String label;

    GameMove(String label) {
        this.label = label;
    }

    boolean beats(GameMove o) {
        if ( this == Rock && o == Scissors ) {
            return true;
        } else if ( this == Paper && o == Rock ) {
            return true;
        } else if ( this == Scissors && o == Paper ) {
            return true;
        }
        return false;
    }

    public String getLabel() {
        return label;
    }
}
