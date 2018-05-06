package com.kodilla.good.patters.food2door;

public class AllProduckt {
    private String kindeOfProdukt;
    private int quantity;
    private double price;

    public AllProduckt(String kindeOfProdukt, int quantity, double price) {
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
