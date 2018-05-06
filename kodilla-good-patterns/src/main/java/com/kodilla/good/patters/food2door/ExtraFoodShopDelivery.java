package com.kodilla.good.patters.food2door;

public class ExtraFoodShopDelivery implements Delivery {

    @Override
    public AllDelivery nameDelivery() {

        AllDelivery allDelivery = new AllDelivery("Extra Food Shop",001);
        return allDelivery;
    }
}
