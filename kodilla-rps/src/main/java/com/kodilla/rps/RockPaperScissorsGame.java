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
        this.computer = new Player("Computer");
        this.round = 1;
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
            return getResult(player,computer);
        } else if (move.equals("paper") && computerMove.equals("rock")) {
            updateWins(player);
            return getResult(player,computer);
        } else if (move.equals("rock") && computerMove.equals("scissors")) {
            updateWins(player);
            return getResult(player, computer);
        } else if (move.equals("end")){
            return "To nie jest liczba z zakresu 1-3";
        } else {
            updateWins(computer);
            return getResult(computer, player);
        }
    }

    private void updateWins(Player player) {
         player.setWins(player.getWins() + 1);
    }

    private String getResult(Player playerWin, Player playerLost) {
        String name =  "Round number: " + round + " Winner: " + playerWin.getName() + " (" + playerWin.getWins() + ") Loser: " + playerLost.getName() + " (" +playerLost.getWins()+ ")";
        this.round +=1;
        return name;
    }


}
