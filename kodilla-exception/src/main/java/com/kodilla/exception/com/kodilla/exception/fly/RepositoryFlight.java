package com.kodilla.exception.com.kodilla.exception.fly;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RepositoryFlight {

    private List <Flight> listDeparture = new ArrayList<>();

    public RepositoryFlight() {

        listDeparture.add(new Flight( "Gdańsk", "Kraków",LocalDate.of(2018,8,15)));
        listDeparture.add(new Flight( "Wroclaw", "Kraków",LocalDate.of(2018,8,15)));
        listDeparture.add(new Flight( "Gdańsk", "Wroclaw",LocalDate.of(2018,8,15)));
        listDeparture.add(new Flight( "Gdańsk", "Poznań",LocalDate.of(2018,8,15)));
        listDeparture.add(new Flight( "Poznań", "Kraków",LocalDate.of(2018,8,15)));
        listDeparture.add(new Flight( "Gdańsk", "Kraków",LocalDate.of(2018,8,16)));
        listDeparture.add(new Flight( "Gdańsk", "Kraków",LocalDate.of(2018,8,15)));
        listDeparture.add(new Flight( "Gdańsk", "Kraków",LocalDate.of(2018,8,15)));

    }
     public void putFlight(Flight flight) {
        listDeparture.add(flight);
    }

    public List<Flight> getMapFlight (){
        return listDeparture;
    }
}
