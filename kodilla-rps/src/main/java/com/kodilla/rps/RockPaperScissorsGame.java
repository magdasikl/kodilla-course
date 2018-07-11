package com.kodilla.rps;

public class RockPaperScissorsGame {
    private Player player;
    private Player computer;
    int round;

    public int getRound() {
        return round;
    }

    public RockPaperScissorsGame(Player player) {
        this.player = player;
        this.computer = new Player("Komputer");
        this.round = 1;

        this.player.setWins(0);
        this.computer.setWins(0);
    }

    public Player getPlayer() {
        return player;
    }

    public Player getComputer() {
        return computer;
    }

    public String decide(GameMove humanMove, GameMove computerMove) {

        if (humanMove == computerMove) {
            this.round += 1;
            return "Nikt nie wygrał";
        }

        if (humanMove.beats(computerMove)) {
            updateWins(player);
            return getResult(player, computer);
        } else {
            updateWins(computer);
            return getResult(computer, player);
        }
    }

    private void updateWins(Player player) {
        player.setWins(player.getWins() + 1);
    }

    private String getResult(Player playerWin, Player playerLost) {
        String name = "Runda numer: " + round + " Zwyciężył  " + playerWin.getName() + " (" + playerWin.getWins() + ") Przegrał: " + playerLost.getName() + " (" + playerLost.getWins() + ")";
        this.round += 1;
        return name;
    }

    public void printScore() {
        int playerScore = player.getWins();
        int computerScore = computer.getWins();

        Player winner, loser = winner = null;

        if (playerScore > computerScore) {
            winner = player;
            loser = computer;
        } else if (playerScore < computerScore) {
            winner = computer;
            loser = player;
        }

        if (winner != null) {
            System.out.println("Wygrał: " + winner.getName() + ", przegrał: " + loser.getName() + ", wynik " + winner.getWins() + ":" + loser.getWins());
        } else {
            System.out.println("Remis: " + playerScore + ":" + computerScore);
        }

    }
}
