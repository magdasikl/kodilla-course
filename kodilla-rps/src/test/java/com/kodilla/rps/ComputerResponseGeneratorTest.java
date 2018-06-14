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
        String rockInput = generator.translateInput(userInput);

        // then
        Assert.assertEquals("rock", rockInput);

    }

    @Test
    public void shouldGenerateRandomResponse() {
        // given

        // when
        int input = generator.getRandomResponse();

        // then
        Assert.assertTrue(Arrays.asList(1,2,3).contains(input));
    }
}
