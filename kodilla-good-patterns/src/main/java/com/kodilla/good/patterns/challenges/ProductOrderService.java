package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private SellProduct sellProduct;
    private OrderRepository orderRepository;

    public ProductOrderService(SellProduct sellProduct, OrderRepository orderRepository) {
        this.sellProduct = sellProduct;
        this.orderRepository = orderRepository;
    }

    public SellDto process(SellRequest sellRequest){
        boolean isOrdered = sellProduct.order(sellRequest.getUser(), sellRequest.getSalesDate(), sellRequest.getQuantity(), sellRequest.getPrice());
        if(isOrdered) {
            orderRepository.createOrder(sellRequest.getUser(), sellRequest.getSalesDate());
            return new SellDto(sellRequest.getUser(), true);
        } else {
            System.out.println("nie udało się");
            return new SellDto(sellRequest.getUser(), false);
        }
    }
}
