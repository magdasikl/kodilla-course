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

    public List<FlightChange> flightWithChange (String nameDeparture, String nameArrival, LocalDate dateFly ) {
        List<Flight> listDeparture = findDeparture(dateFly, nameDeparture);
        List<Flight> listCh;
        FlightChange flightChange;
        List<FlightChange> flightChangeList = new ArrayList<>();
        for (Flight flight : listDeparture) {
             flightChange = new FlightChange();
            if (flight.getArrivalAirport().equals(nameArrival)) {
                flightChange.setFlight(flight);
            } else {
                listCh = findDeparture(dateFly, flight.getArrivalAirport());
                if (listCh.size()>0){
                    flightChange.setFlight(flight);
                }
                for ( Flight flight1: listCh) {
                    if (flight1.getArrivalAirport().equals(nameArrival)) {
                        flightChange.putFlight(flight1);
                    }
                }
            }
            if (flightChange.getFlight() != null){
                flightChangeList.add(flightChange);
            }
        }
        return flightChangeList;
    }

}