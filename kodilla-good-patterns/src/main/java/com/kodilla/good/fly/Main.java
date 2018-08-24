package com.kodilla.good.fly;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        RepositoryFlight repositoryFlight = new RepositoryFlight();
        FlightSearch flightSearch = new FlightSearch(repositoryFlight);

        List<Flight> listFlight;
        List<Flight> listFlight2;
        Map<Flight, Flight> mapChangeFlight;
        listFlight = flightSearch.findDeparture(LocalDate.of(2018,8,15), "Poznań");
        listFlight2 = flightSearch.findArrival(LocalDate.of(2018,8,15),"Kraków");
        mapChangeFlight = flightSearch.flightWithChange(1,"Gdańsk", "Kraków", LocalDate.of(2018,8,15));
        System.out.println("Odloty -----------------------------------------------------------");
        listFlight.stream().forEach(System.out::println);
        System.out.println("Przyloty ---------------------------------------------------------");
        listFlight2.stream().forEach(System.out::println);
        System.out.println("Loty bezpośrednie i z przesiadką ---------------------------------");
        mapChangeFlight.entrySet().stream()
                .filter(flightFlightEntry ->flightFlightEntry.getKey().equals(flightFlightEntry.getValue()))
                .map(flightFlightEntry -> flightFlightEntry.getKey())
                .forEach(System.out::println);

        mapChangeFlight.entrySet().stream()
                .filter(flightFlightEntry -> !flightFlightEntry.getKey().equals(flightFlightEntry.getValue()))
                .map(flightFlightEntry -> flightFlightEntry.toString())
                .forEach(System.out::println);
    }
}
