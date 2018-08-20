package com.kodilla.good.patters.food2door;

public interface OrderRepository {
    public void createOrder(Product product, Delivery delivery);
}
