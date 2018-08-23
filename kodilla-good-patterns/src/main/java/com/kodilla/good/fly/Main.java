package com.kodilla.good.fly;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        RepositoryFlight repositoryFlight = new RepositoryFlight();
        FlightSearch flightSearch = new FlightSearch(repositoryFlight);

        List<Flight> listFlight;
//        listFlight = flightSearch.findDeparture(LocalDate.of(2018,8,15), "Poznań");
//        listFlight = flightSearch.findArrival(LocalDate.of(2018,8,15),"Kraków");
         flightSearch.flightWithChange(1,"Gdańsk", "Kraków", LocalDate.of(2018,8,15));

//        listFlight.stream().forEach(System.out::println);
    }
}
