package com.kodilla.good.fly;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class FlightSearchTest {

    @Test
    public void testfindDeparture() {
        //Given
        RepositoryFlight repositoryFlight = new RepositoryFlight();
        FlightSearch flightSearch = new FlightSearch(repositoryFlight);
        //When
        List<Flight> listFlight = flightSearch.findDeparture(LocalDate.of(2018,8,15), "Poznań");
        //Then
        Assert.assertEquals("Data lotu: 2018-08-15 z lotniska Poznań na lotnisko Kraków",listFlight.get(0).toString() );
}

    @Test
    public void testfindArrival() {
        //Given
        RepositoryFlight repositoryFlight = new RepositoryFlight();
        FlightSearch flightSearch = new FlightSearch(repositoryFlight);
        //When
        List<Flight> listFlight = flightSearch.findArrival(LocalDate.of(2018,8,15),"Kraków");
        //Then
        Assert.assertEquals("Data lotu: 2018-08-15 z lotniska Gdańsk na lotnisko Kraków" ,listFlight.get(0).toString() );

    }
    @Test
    public void testflightWithChange() {
        //Given
        RepositoryFlight repositoryFlight = new RepositoryFlight();
        FlightSearch flightSearch = new FlightSearch(repositoryFlight);
        //When
        Map<Flight, Flight> mapChangeFlight = flightSearch.flightWithChange(1,"Gdańsk", "Kraków", LocalDate.of(2018,8,15));
        //Then
        Assert.assertEquals(3,mapChangeFlight.size() );
    }

}