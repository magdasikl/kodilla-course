package com.kodilla.rps;


import java.util.Random;

public class ComputerResponseGenerator {


    public String translateInput(int userInput) {
        // tlumaczenie 1-3 na r/p/s
        String name;
        if (userInput == 1) {
            name = "rock";
        } else if (userInput == 2){
            name = "paper";
        } else if (userInput == 3){
            name = "scissors";
        } else {
            name = "end";
        }
        return name;
    }

    public int getRandomResponse() {
        // ma zwrocic od 1 do 3
        Random generator = new Random();
        int gen = generator.nextInt(3)+1;
        return gen;
    }
}
