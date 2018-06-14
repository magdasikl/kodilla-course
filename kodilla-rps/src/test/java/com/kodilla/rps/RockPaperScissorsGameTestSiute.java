package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Test;

public class RockPaperScissorsGameTestSiute {
    private Player computerPlayer = new Player("Computer");
    private Player player = new Player("Ania");

    @Test
    public void rockShouldBeatScissors() {
        //Given
        RockPaperScissorsGame game = new RockPaperScissorsGame(player);
        String move = "rock";
        String computerMove = "scissors";

        //When
        String message = game.decide(move, computerMove);

        //Then
        Assert.assertEquals(1, game.getPlayer().getWins());
        Assert.assertEquals("Winner: Player: Ania(1)", message);
    }

    @Test
    public void scissorsShouldBeatPaper() {
        //Given
        RockPaperScissorsGame game = new RockPaperScissorsGame(player);
        String move = "scissors";
        String computerMove = "paper";

        //When
        String message = game.decide(move,computerMove);

        //Then
        Assert.assertEquals(1, game.getPlayer().getWins() );
        Assert.assertEquals("Winner: Player: Ania(1)",message);

    }

    @Test
    public void paperShouldBeatRock() {
        //Given
        RockPaperScissorsGame game = new RockPaperScissorsGame(player);
        String move = "paper";
        String computerMove = "rock";

        //When
        String message = game.decide(move,computerMove);

        //Then
        Assert.assertEquals(1,game.getPlayer().getWins());
        Assert.assertEquals("Winner: Player: Ania(1)", message);
    }

}
