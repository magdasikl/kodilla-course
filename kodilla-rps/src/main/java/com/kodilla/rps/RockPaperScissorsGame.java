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
    }

    public Player getPlayer() {
        return player;
    }


    public String decide(String move, String computerMove) {

        if (move.equals(computerMove)) {
            this.round +=1;
            return "Nikt nie wygrał";
        }

        if (move.equals("nożyce") && computerMove.equals("papier")) {
            updateWins(player);
            return getResult(player,computer);
        } else if (move.equals("papier") && computerMove.equals("kamień")) {
            updateWins(player);
            return getResult(player,computer);
        } else if (move.equals("kamień") && computerMove.equals("nożyce")) {
            updateWins(player);
            return getResult(player, computer);
        } else if (move.equals("koniec")){
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
        String name =  "Runda numer: " + round + " Zwyciężył  " + playerWin.getName() + " (" + playerWin.getWins() + ") Przegrał: " + playerLost.getName() + " (" +playerLost.getWins()+ ")";
        this.round +=1;
        return name;
    }


}
