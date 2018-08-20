package com.kodilla.good.patters.food2door;

public class ExtraFoodShopProduct implements Product {
    private String kindeOfProdukt;
    private int quantity;
    private double price;

    public ExtraFoodShopProduct(String kindeOfProdukt, int quantity, double price) {
        this.kindeOfProdukt = kindeOfProdukt;
        this.quantity = quantity;
        this.price = price;
    }

    public String getKindeOfProdukt() {
        return kindeOfProdukt;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
