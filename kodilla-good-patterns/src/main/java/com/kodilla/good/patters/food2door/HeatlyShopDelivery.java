package com.kodilla.good.patters.food2door;

public class HeatlyShopDelivery implements Delivery{
    @Override
    public AllDelivery nameDelivery() {

        AllDelivery allDelivery = new AllDelivery("Heatly Shop",002);
        return allDelivery;
    }
}
