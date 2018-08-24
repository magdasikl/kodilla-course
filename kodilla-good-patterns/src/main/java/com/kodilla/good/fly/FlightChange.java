package com.kodilla.good.fly;

import java.util.HashMap;
import java.util.Map;

public class FlightChange {
    private Map<Flight, Flight> mapFlight = new HashMap<>();

    public void  putFlight(Flight flightDeparture, Flight flightArrival) {
        mapFlight.put(flightArrival, flightDeparture);

    }

    public Map<Flight, Flight> getMapFlight() {
        return mapFlight;
    }


}
