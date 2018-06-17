package com.kodilla.rps;


import java.util.Random;

public class ComputerResponseGenerator {


    public String translateInput(int userInput) {
        // tlumaczenie 1-3 na r/p/s
        String name;
        if (userInput == 1) {
            name = "kamień";
        } else if (userInput == 2){
            name = "papier";
        } else if (userInput == 3){
            name = "nożyce";
        } else {
            name = "koniec";
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
