package com.kodilla.good.patters.food2door;

public class Repository implements OrderRepository{
    @Override
    public void createOrder(Product product, Delivery delivery) {
        System.out.println("Dodano do koszyka zamówień produkt: " + product.getKindeOfProdukt() +" od dostawcy "+ delivery.getName());
    }
}
