package com.kodilla.rps;

public class RockPaperScissorsGame {
    private Player player;
    private Player computerPlayer;
    int wins = 0;
    String winner ="";

    public RockPaperScissorsGame(Player player, Player computerPlayer) {
        this.player = player;
        this.computerPlayer = computerPlayer;
    }

    public Player getPlayer() {
        return player;
    }

    public String decide(String move, String computerMove) {

        if (move == "scissors" && computerMove == "paper") {
            wins = player.getWins();
            wins = +1;
            player.setWins(wins);
            winner = "Winner: SCISSORS Player: " + player.getName() + "(" + player.getWins() + ")";

        } else if (move == "scissors" && computerMove == "rock"){
            wins = computerPlayer.getWins();
            wins = +1;
            computerPlayer.setWins(wins);
            winner = "Winner: ROCK Player: " + computerPlayer.getName() +"("+computerPlayer.getWins()+")";

        } else if (move == "scissors" && computerMove == "scissors") {
            winner =  "No one wins";

        } else if (move == "paper" && computerMove == "rock") {
            wins = player.getWins();
            wins = +1;
            player.setWins(wins);
            winner = "Winner: PAPER Player: " + player.getName() + "(" + player.getWins() + ")";

        } else if (move == "paper" && computerMove == "scissors") {
            wins = computerPlayer.getWins();
            wins = +1;
            computerPlayer.setWins(wins);
            winner = "Winner: SCISSORS Player: " + computerPlayer.getName()+"("+computerPlayer.getWins()+")";

        } else if(move == "paper" && computerMove == "paper") {
            winner = "No one wins";

        } else if (move == "rock" && computerMove == "scissors") {
            wins = player.getWins();
            wins = +1;
            player.setWins(wins);
            winner = "Winner: ROCK Player: " + player.getName()+ "(" + player.getWins() + ")";

        } else if(move == "rock" && computerMove == "paper") {
            wins = computerPlayer.getWins();
            wins = +1;
            computerPlayer.setWins(wins);
            winner = "Winner: PAPER Player: " + computerPlayer.getName()+"("+computerPlayer.getWins()+")";

        } else if(move == "rock" && computerMove == "rock") {
            winner = "No one wins";
        }
        return winner;
    }
}
