package com.kodilla.rps;

import java.util.Scanner;

public class GameRunner {

    public static void main(String[] args) {
        // wyjac ze Scannera wcisniety klawisz
        // klawisz powinien byc 1-3
        // jezeli klawisz jest inny to zamyka gre
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje imię");
        String namePlayer = scanner.next();

        // inicjalizacja gry
        Player player = new Player(namePlayer);
        ComputerResponseGenerator computerResponseGenerator = new ComputerResponseGenerator();
        while (true) {
            RockPaperScissorsGame game = new RockPaperScissorsGame(player);

            // wczytujemy ruch uzytkownika
            System.out.println(namePlayer + " ile gramy losowań? ");

            try {
                int e = scanner.nextInt();
                System.out.println("klawisz 1 - zagranie \"kamień\",\n" +
                        "klawisz 2 - zagranie \"papier\",\n" +
                        "klawisz 3 - zagranie \"nożyce\",\n" +
                        "klawisz x - koniec gry");

                for (int k = 0; k < e; k++) {
                    System.out.println("Runda: " + game.getRound());

                    GameMove humanMove = null;
                    do {
                        System.out.print("Naciśnij klawisz: ");
                        String key = scanner.next();

                        // tlumaczymy ruch uzytkownika na kamien/papier/nozyce
                        KeyResult result = computerResponseGenerator.translate(key);
                        if (result.command == Command.Exit) {
                            System.out.println(result.command.getCommunicate());
                            return;
                        } else if (result.command == Command.Error) {
                            System.out.println(result.command.getCommunicate());
                        } else if (result.command == Command.Move) {
                            humanMove = result.move;
                        }
                    }
                    while (humanMove == null);

                    GameMove computerMove = computerResponseGenerator.getRandomResponse();

                    System.out.println("Wybrałeś: " + humanMove.getLabel() + ", Komputer wylosował: " + computerMove.getLabel());

//                 generujemy ruch komputera
//                 decydujemy kto wygrał
                    String gameDecision = game.decide(humanMove, computerMove);
//                 zwracamy uzytkownikowi komunikat

                    System.out.println(gameDecision);
                    if (k < e - 1) {
                        System.out.println("Grasz dalej? Jeśli nie naciśnij \"x\"");
                    }
                }
                game.printScore();

                System.out.println("Grasz jeszcze raz? Wpisz \"n\"");
                String userInput = scanner.next();
                if (!userInput.equals("n")) {
                    break;
                }

            } catch (Exception e) {
                System.out.println("To nie jest liczba tylko znak");
            }
        }

    }
}
