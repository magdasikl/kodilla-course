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

        //When
        String message = game.decide(GameMove.Rock, GameMove.Scissors);

        //Then
        Assert.assertEquals(1, game.getPlayer().getWins());
    }
//
    @Test
    public void scissorsShouldBeatPaper() {
        //Given
        RockPaperScissorsGame game = new RockPaperScissorsGame(player);

        //When
        String message = game.decide(GameMove.Scissors,GameMove.Paper);

        //Then
        Assert.assertEquals(1, game.getPlayer().getWins() );

    }

    @Test
    public void paperShouldBeatRock() {
        //Given
        RockPaperScissorsGame game = new RockPaperScissorsGame(player);

        //When
        String message = game.decide(GameMove.Paper,GameMove.Rock);

        //Then
        Assert.assertEquals(1,game.getPlayer().getWins());
    }

}
