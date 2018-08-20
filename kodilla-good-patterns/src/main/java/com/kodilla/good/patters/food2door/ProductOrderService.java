package com.kodilla.good.patters.food2door;

public class ProductOrderService {

    public void process(Delivery delivery, Product product, Repository repository){

        OrderRequest orderRequest = new OrderRequest();
        boolean isOrdered = orderRequest.request(delivery, product);
        if (isOrdered){
            repository.createOrder(product, delivery);
            System.out.println("Zamówienie w trakcie realizacji");
        } else {
            System.out.println("Zamówienie odrzucone");
        }

    }
}
