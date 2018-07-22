package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.rps.GameMove.Paper;
import static com.kodilla.rps.GameMove.Rock;
import static com.kodilla.rps.GameMove.Scissors;

public class GameMoveTest {

    @Test
    public void rockBeatsScissors() {
        // given:
        GameMove winning = Rock;
        GameMove losing = Scissors;

        // when:
        boolean result = winning.beats(losing);

        // then:
       Assert.assertTrue(result);
    }


    @Test
    public void rockDontBeatsRock() {
        Assert.assertFalse(Rock.beats(Rock));
    }

    @Test
    public void rockDontBeatsPaper() {
        Assert.assertFalse(Rock.beats(Paper));
    }

    @Test
    public void testBeatsMethod() {
        Assert.assertTrue(Rock.beats(Scissors));
        Assert.assertFalse(Rock.beats(Rock));
        Assert.assertFalse(Rock.beats(Paper));

        Assert.assertTrue(Scissors.beats(Paper));
        Assert.assertFalse(Scissors.beats(Rock));
        Assert.assertFalse(Scissors.beats(Scissors));

        Assert.assertTrue(Paper.beats(Rock));
        Assert.assertFalse(Paper.beats(Paper));
        Assert.assertFalse(Paper.beats(Scissors));
    }
}