package com.kodilla.exception.com.kodilla.exception.test;

public class Flight {
    String departureAiport;
    String arrivalAirport;

    public Flight(String departureAiport, String arrivalAirport) {
        this.departureAiport = departureAiport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAiport() {
        return departureAiport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
