package com.kodilla.good.patters.food2door;

public class ProductOrderService {
    private Shop shop;
    private Repository repository;
    public ProductOrderService(Shop shop,  Repository repository) {
        this.shop = shop;
        this.repository = repository;
    }

    public void getResponse(Product product){
        boolean isCorrectlyProcessed = shop.process();
        if (isCorrectlyProcessed){
            repository.createOrder(product, shop);
            System.out.println("Zamówienie w trakcie realizacji");
        } else {
            System.out.println("Zamówienie odrzucone");
        }

    }
}
