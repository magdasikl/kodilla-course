package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {
    private String nameCoutry;
    private  BigDecimal peopleQuantity =BigDecimal.ZERO;


    public Country(String nameCoutry, BigDecimal peopleQuantity) {
        this.nameCoutry = nameCoutry;
        this.peopleQuantity = peopleQuantity;
    }

    BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }

    public String getNameCoutry() {
        return nameCoutry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return Objects.equals(getNameCoutry(), country.getNameCoutry());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNameCoutry());
    }
}
