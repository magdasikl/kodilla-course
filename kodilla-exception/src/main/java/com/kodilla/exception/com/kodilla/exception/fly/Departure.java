package com.kodilla.exception.com.kodilla.exception.fly;

import java.util.Objects;

public class Departure {
    String departureAiport;

    public Departure(String departureAiport) {
        this.departureAiport = departureAiport;
    }

    public String getDepartureAiport() {
        return departureAiport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departure)) return false;
        Departure departure = (Departure) o;
        return Objects.equals(getDepartureAiport(), departure.getDepartureAiport());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDepartureAiport());
    }
}
