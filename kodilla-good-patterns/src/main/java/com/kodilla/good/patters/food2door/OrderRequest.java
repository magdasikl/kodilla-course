package com.kodilla.good.patters.food2door;

public class OrderRequest {
    private AllDelivery allDelivery;
    private AllProduckt allProduct;

    public OrderRequest(AllDelivery allDelivery, AllProduckt allProduct) {
        this.allDelivery = allDelivery;
        this.allProduct = allProduct;
    }

    public boolean request(){
        System.out.println("Zamówienie dla dostawcy: "+ allDelivery.getName()+ "Produkty: " + allProduct.getKindeOfProdukt() +" Cena: " + allProduct.getPrice() );
        return true;
    }
}
