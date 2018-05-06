package com.kodilla.good.patters.food2door;

public class ProductOrderService {
//    private Delivery delivery;
//    private Product product;
//
//    public ProductOrderService(Delivery delivery, Product product) {
//        this.delivery = delivery;
//        this.product = product;
//    }

    public void process(Delivery delivery, Product product){
        AllDelivery namesDeliery = delivery.nameDelivery();
        AllProduckt ordersProduct = product.orderProduct();

        OrderRequest orderRequest = new OrderRequest(namesDeliery, ordersProduct);
        boolean isOrdered = orderRequest.request();
        if (isOrdered){
            System.out.println("Zamówienie w trakcie realizacji");
        } else {
            System.out.println("Zamówienie odrzucone");
        }

    }
}
