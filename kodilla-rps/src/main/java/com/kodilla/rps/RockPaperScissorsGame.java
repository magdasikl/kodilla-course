package com.kodilla.rps;

public class RockPaperScissorsGame {
    private Player player;

    public RockPaperScissorsGame(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public String decide(String move, String computerMove) {

        if (move.equals(computerMove)) {
            return "No one wins";
        }

        if (move.equals("scissors") && computerMove.equals("paper")) {
            updateWins(player);
            return getResult(player);
        } else if (move.equals("paper") && computerMove.equals("rock")) {
            updateWins(player);
            return getResult(player);
        } else if (move.equals("rock") && computerMove.equals("scissors")) {
            updateWins(player);
            return getResult(player);
        } else if (move.equals("end")){
            return "To nie jest liczba z zakresu 1-3";
        } else {
            return "Computer win";
        }
    }

    private void updateWins(Player player) {
        player.setWins(player.getWins() + 1);
    }

    private String getResult(Player player) {
        return "Winner: Player: " + player.getName() + " (" + player.getWins() + ")";
    }


}
