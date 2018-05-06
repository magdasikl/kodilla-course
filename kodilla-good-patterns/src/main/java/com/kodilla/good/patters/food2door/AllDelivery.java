package com.kodilla.good.patters.food2door;

public class AllDelivery {
    private String name;
    private int idDelivery;

    public AllDelivery(String name, int idDelivery) {
        this.name = name;
        this.idDelivery = idDelivery;
    }

    public String getName() {
        return name;
    }

    public int getIdDelivery() {
        return idDelivery;
    }
}
