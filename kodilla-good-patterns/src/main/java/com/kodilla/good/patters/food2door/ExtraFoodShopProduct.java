package com.kodilla.good.patters.food2door;

public class ExtraFoodShopProduct implements Product {
    @Override
    public AllProduckt orderProduct() {
        AllProduckt allProduckt = new AllProduckt("Sałata",1,1.50);
        return allProduckt;
    }
}
