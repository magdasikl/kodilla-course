package com.kodilla.exception.com.kodilla.exception.fly;

import java.time.LocalDate;
import java.util.Objects;

public class Flight {
//    private Departure departure;
//    private Arrival arrival;
    private String departureAiport;
    private String arrivalAirport;
    private LocalDate dateFly;

    public Flight(String departureAiport, String arrivalAirport,LocalDate dateFly) {
        this.departureAiport = departureAiport;
        this.arrivalAirport = arrivalAirport;
        this.dateFly = dateFly;
    }

    public String getDepartureAiport() {
        return departureAiport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public LocalDate getDateFly() {
        return dateFly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getDepartureAiport(), flight.getDepartureAiport()) &&
                Objects.equals(getArrivalAirport(), flight.getArrivalAirport()) &&
                Objects.equals(getDateFly(), flight.getDateFly());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDateFly());
    }

    @Override
    public String toString() {
        return "Data lotu: " + dateFly +
                " z lotniska " + departureAiport +
                " na lotnisko " + arrivalAirport ;
    }
}
