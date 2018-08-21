package com.kodilla.exception.com.kodilla.exception.fly;

import java.util.Objects;

public class Arrival {
    String arrivalAirport;

    public Arrival(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Arrival)) return false;
        Arrival arrival = (Arrival) o;
        return Objects.equals(getArrivalAirport(), arrival.getArrivalAirport());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArrivalAirport());
    }
}
