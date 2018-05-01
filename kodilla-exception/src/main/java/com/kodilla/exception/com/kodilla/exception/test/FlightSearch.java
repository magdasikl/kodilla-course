package com.kodilla.exception.com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public void findFilght(Flight flight)throws RouteNotFoundException{
        Map<String, Boolean> mapDeparture = new HashMap<>();
        mapDeparture.put("Cracow",true);
        mapDeparture.put("Katowice", false);
        mapDeparture.put("Barcelona", true);


        String arrival = flight.getArrivalAirport();

        Boolean getArrival = mapDeparture.get(arrival);

        if(getArrival == null){
            throw new RouteNotFoundException("Object Aiport was wrong");
        }
    }
}
