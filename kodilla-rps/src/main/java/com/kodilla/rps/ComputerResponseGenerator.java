package com.kodilla.rps;


import java.util.Random;

public class ComputerResponseGenerator {

    public GameMove translateMove(String userInput) {
        if (userInput.equals("1")) {
            return GameMove.Rock;
        } else if (userInput.equals("2")) {
            return GameMove.Paper;
        } else if (userInput.equals("3")) {
            return GameMove.Scissors;
        } else {
            throw new IllegalArgumentException("Expected number 1,2 or 3");
        }
    }

    public KeyResult translate(String userInput) {
        if (userInput.equals("1") || userInput.equals("2") || userInput.equals("3")) {
            return new KeyResult(Command.Move, translateMove(userInput));
        } else if (userInput.equals("x")) {
            return new KeyResult(Command.Exit);
        } else if (userInput.equals("n")) {
            return new KeyResult(Command.NewGame);
        } else {
            return new KeyResult(Command.Error);
        }
    }

    public GameMove getRandomResponse() {
        // ma zwrocic od 1 do 3
        Random generator = new Random();
        int randomized = generator.nextInt(3);
        return GameMove.values()[randomized];
    }
}
