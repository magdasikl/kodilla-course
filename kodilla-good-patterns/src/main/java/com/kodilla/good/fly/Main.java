package com.kodilla.good.fly;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        RepositoryFlight repositoryFlight = new RepositoryFlight();
        FlightSearch flightSearch = new FlightSearch(repositoryFlight);

        List<Flight> listFlight;
        List<Flight> listFlight2;
        List<String> listChangeFlight;
        listFlight = flightSearch.findDeparture(LocalDate.of(2018,8,15), "Poznań");
        listFlight2 = flightSearch.findArrival(LocalDate.of(2018,8,15),"Kraków");
        listChangeFlight = flightSearch.flightWithChange(1,"Gdańsk", "Kraków", LocalDate.of(2018,8,15));
        System.out.println("Odloty -----------------------------------------------------------");
        listFlight.stream().forEach(System.out::println);
        System.out.println("Przyloty ---------------------------------------------------------");
        listFlight2.stream().forEach(System.out::println);
        System.out.println("Loty bezpośrednie i z przesiadką ---------------------------------");
        listChangeFlight.stream().forEach(System.out::println);
    }
}
