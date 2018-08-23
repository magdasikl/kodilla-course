package com.kodilla.good.fly;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class RepositoryFlightTest {

    @Test
    public void putFlight() {
        //Given
        RepositoryFlight repositoryFlight = new RepositoryFlight();
        //When
        repositoryFlight.putFlight(new Flight( "Gdańsk", "Lublin",LocalDate.of(2018,8,23)));
        //Then
        Assert.assertEquals(9,repositoryFlight.getMapFlight().size());
    }
}