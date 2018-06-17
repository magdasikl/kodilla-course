package com.kodilla.rps;

import java.util.Scanner;

public class GameRunner {

    public static void main(String[] args) {
        // wyjac ze Scannera wcisniety klawisz
        // klawisz powinien byc 1-3
        // jezeli klawisz jest inny to zamyka gre

        // inicjalizacja gry
        Player player = new Player("Ania");
        ComputerResponseGenerator computerResponseGenerator = new ComputerResponseGenerator();
        RockPaperScissorsGame game = new RockPaperScissorsGame(player);
        int i;
        String move;
        int computerInput;
        String computerMove;
        String gameDecision;
        // wczytujemy ruch uzytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rounds?");
        try {
            int e = scanner.nextInt();

            for (int k = 0; k<e; k++) {
                System.out.println("Round: " + game.getRound());
                System.out.print("Wpisz liczbę: ");
                i = scanner.nextInt();
                //System.out.println("liczba " + i);

                // tlumaczymy ruch uzytkownika na kamien/papier/nozyce
                move = computerResponseGenerator.translateInput(i);
                computerInput = computerResponseGenerator.getRandomResponse();

                // tlumaczymy ruch komputera na kamien/papier/nozyce
                computerMove = computerResponseGenerator.translateInput(computerInput);

                // generujemy ruch komputera
                // decydujemy kto wygrał
                gameDecision = game.decide(move, computerMove);
                // zwracamy uzytkownikowi komunikat
                System.out.println(gameDecision);
            }

        } catch (Exception e){
            System.out.println("To nie jest liczba tylko znak");
        }


    }
}
