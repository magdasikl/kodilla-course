package com.kodilla.good.patters.food2door;

public class HeatlyShopProduct implements Product{
    @Override
    public AllProduckt orderProduct() {

        AllProduckt allProduckt = new AllProduckt("Pomidory",2,9.90);
        return allProduckt;
    }
}
