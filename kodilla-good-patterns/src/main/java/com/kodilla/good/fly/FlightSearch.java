package com.kodilla.good.fly;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {
    private RepositoryFlight repositoryFlight;


    public FlightSearch(RepositoryFlight repositoryFlight) {
        this.repositoryFlight = repositoryFlight;
    }

    public List<Flight> findDeparture(LocalDate dateFly, String nameDeparture) {
        List <Flight> listFlight = repositoryFlight.getMapFlight();
        List<Flight> fly = listFlight.stream()
                .filter(localDateFlight -> localDateFlight.getDateFly().equals(dateFly) )
                .filter(flight -> flight.getDepartureAiport().equals(nameDeparture))
                .collect(Collectors.toList());
        return fly;
    }

    public List<Flight> findArrival (LocalDate dateFly, String nameArrival ) {
       List <Flight> listFlight = repositoryFlight.getMapFlight();

       List<Flight> fly = listFlight.stream()
                .filter(localDateFlight -> localDateFlight.getDateFly().equals(dateFly) )
                .filter(flight -> flight.getArrivalAirport().equals(nameArrival))
                .collect(Collectors.toList());
        return fly;
    }

    public List<String> flightWithChange (int numberOfChange, String nameDeparture, String nameArrival, LocalDate dateFly ) {
        List<Flight> listDeparture = findDeparture(dateFly, nameDeparture);
        List<String> listFlight = new ArrayList<>();
        String nameFly;
        for (Flight flight : listDeparture) {
            if (flight.getArrivalAirport().equals(nameArrival)) {
               nameFly = "Lot bezpośredni z " + flight.getDepartureAiport() + " do " + flight.getArrivalAirport();
               listFlight.add(nameFly);
            } else {
                List<Flight> listCh = findDeparture(dateFly, flight.getArrivalAirport());
                for ( Flight flight1: listCh) {
                    if (flight1.getArrivalAirport().equals(nameArrival)) {
                        nameFly = ("Lot z "+ flight.getDepartureAiport() + " z przesiadką " + flight.getArrivalAirport()+ " do "+ flight1.getArrivalAirport());
                        listFlight.add(nameFly);
                    }

                }
            }

        }
        return listFlight;
    }

}