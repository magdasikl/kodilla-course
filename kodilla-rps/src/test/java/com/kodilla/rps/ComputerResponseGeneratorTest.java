package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ComputerResponseGeneratorTest {

    private ComputerResponseGenerator generator;

    @Before
    public void setUp() throws Exception {
        generator = new ComputerResponseGenerator();
    }

    @Test
    public void shouldGenerateRockPaperScissorResponse() {

        // given
        int userInput = 1;

        // when
        KeyResult rockInput = generator.translate(Integer.toString(userInput));

        // then
        Assert.assertEquals(GameMove.Rock, rockInput.move);

    }

    @Test
    public void shouldGenerateRandomResponse() {
        // given

        // when
        GameMove move = generator.getRandomResponse();

        // then
        Assert.assertTrue(Arrays.asList(GameMove.values()).contains(move));
    }
}
