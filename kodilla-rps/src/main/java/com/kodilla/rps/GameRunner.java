package com.kodilla.rps;

import java.util.Scanner;

public class GameRunner {

    public static void main(String[] args) {
        // wyjac ze Scannera wcisniety klawisz
        // klawisz powinien byc 1-3
        // jezeli klawisz jest inny to zamyka gre
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String  namePlayer = scanner.nextLine();

        // inicjalizacja gry
        Player player = new Player(namePlayer);
        ComputerResponseGenerator computerResponseGenerator = new ComputerResponseGenerator();
        RockPaperScissorsGame game = new RockPaperScissorsGame(player);
        int i;
        String move;
        int computerInput;
        String computerMove;
        String gameDecision;
        // wczytujemy ruch uzytkownika

        System.out.println(namePlayer + " ile gramy rund? ");

        try {
            int e = scanner.nextInt();
            System.out.println("klawisz 1 - zagranie \"kamień\",\n" +
                    "klawisz 2 - zagranie \"papier\",\n" +
                    "klawisz 3 - zagranie \"nożyce\"");

            for (int k = 0; k<e; k++) {
                System.out.println("Runda: " + game.getRound());
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
                System.out.println("Wybrałeś: " + move + ", Komputer wylosował: " + computerMove);
                System.out.println(gameDecision);
            }

        } catch (Exception e){
            System.out.println("To nie jest liczba tylko znak");
        }


    }
}
