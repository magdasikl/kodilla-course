package com.kodilla.good.fly;

import java.util.ArrayList;
import java.util.List;

public class FlightChange {
    private Flight flight;
    private List<Flight> flightChanges = new ArrayList<>();

    public void  putFlight(Flight flightArrival) {
        flightChanges.add(flightArrival);
    }

    public List<Flight> getListFlightChange()
    {
        return flightChanges;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
