package com.kodilla.good.patters.food2door;

public class ExtraFoodShopDelivery implements Delivery {
    private String name;
    private int idDelivery;

    public ExtraFoodShopDelivery(String name, int idDelivery) {
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