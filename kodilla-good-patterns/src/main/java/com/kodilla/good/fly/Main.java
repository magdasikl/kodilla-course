package com.kodilla.good.fly;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        RepositoryFlight repositoryFlight = new RepositoryFlight();
        FlightSearch flightSearch = new FlightSearch(repositoryFlight);

        List<Flight> listFlight;
        List<Flight> listFlight2;
        List<FlightChange> flightChange;
        listFlight = flightSearch.findDeparture(LocalDate.of(2018,8,15), "Poznań");
        listFlight2 = flightSearch.findArrival(LocalDate.of(2018,8,15),"Kraków");
        flightChange = flightSearch.flightWithChange("Gdańsk", "Kraków", LocalDate.of(2018,8,15));
        System.out.println("Odloty -----------------------------------------------------------");
        listFlight.stream().forEach(System.out::println);
        System.out.println("Przyloty ---------------------------------------------------------");
        listFlight2.stream().forEach(System.out::println);
        System.out.println("Loty bezpośrednie i z przesiadką ---------------------------------");

        flightChange.stream()
                .forEach(flightChange1 -> {
                    System.out.print(flightChange1.getFlight());
                    if(flightChange1.getListFlightChange().size()>0) {
                        flightChange1.getListFlightChange().stream().forEach(System.out::print);
                    }
                    System.out.println(" ");
                });
    }
}
