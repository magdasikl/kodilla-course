package com.kodilla.good.patters.food2door;

public class HeatlyShopDelivery implements Delivery{

    private String name;
    private int idDelivery;

    public HeatlyShopDelivery(String name, int idDelivery) {
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
