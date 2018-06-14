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


        // wczytujemy ruch uzytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz liczbę: ");
        try {
            int i = scanner.nextInt();
            //System.out.println("liczba " + i);

            // tlumaczymy ruch uzytkownika na kamien/papier/nozyce
            String move = computerResponseGenerator.translateInput(i);
            // generujemy ruch komputera
            int computerInput = computerResponseGenerator.getRandomResponse();

            // tlumaczymy ruch komputera na kamien/papier/nozyce
            String computerMove = computerResponseGenerator.translateInput(computerInput);

            // decydujemy kto wygrał
            String gameDecision = game.decide(move, computerMove);

            // zwracamy uzytkownikowi komunikat
            System.out.println(gameDecision);
        } catch (Exception e){
            System.out.println("To nie jest liczba tylko znak");
        }


    }
}
