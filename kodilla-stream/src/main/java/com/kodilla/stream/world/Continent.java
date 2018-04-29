package com.kodilla.stream.world;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class Continent {

    private final List<Country> countries = new ArrayList<Country>();
    private String name;
    public void addCountry(Country country, String name){
        this.name = name;
        countries.add(country);
    }

    public List<Country> getCountries(){
        return countries;
    }

}

