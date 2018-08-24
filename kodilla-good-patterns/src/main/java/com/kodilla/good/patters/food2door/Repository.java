package com.kodilla.good.patters.food2door;

public class Repository implements OrderRepository{
    @Override
    public void createOrder(Product product, Shop shop) {
        System.out.println("Dodano do koszyka zamówień produkt: " + product.getKindeOfProdukt() +" od dostawcy "+ shop.getName());
    }
}
