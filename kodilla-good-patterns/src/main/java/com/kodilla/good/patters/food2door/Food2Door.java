package com.kodilla.good.patters.food2door;

public class Food2Door {
    public static void main(String[] args) {
        ProductOrderService productOrderService = new ProductOrderService();
        productOrderService.process(new HeatlyShopDelivery(), new HeatlyShopProduct());
        productOrderService.process(new ExtraFoodShopDelivery(),new ExtraFoodShopProduct());

    }
}
