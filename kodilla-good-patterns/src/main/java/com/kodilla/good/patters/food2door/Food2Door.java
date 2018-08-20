package com.kodilla.good.patters.food2door;

public class Food2Door {
    public static void main(String[] args) {
        ProductOrderService productOrderService = new ProductOrderService();
        Repository repository = new Repository();
        productOrderService.process(new HeatlyShopDelivery("HeatlyShop",001), new HeatlyShopProduct("sałata",1, 1.50), repository);
        productOrderService.process(new ExtraFoodShopDelivery("ExtraFoodShop", 002),new ExtraFoodShopProduct("botwinka", 2,2.00), repository);

    }
}
