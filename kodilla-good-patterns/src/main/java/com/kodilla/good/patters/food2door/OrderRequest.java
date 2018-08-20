package com.kodilla.good.patters.food2door;

public class OrderRequest {
    private Delivery allDelivery;
    private Product allProduct;


    public boolean request(Delivery allDelivery, Product allProduct){
        System.out.println("Zamówienie dla dostawcy: "+ allDelivery.getName()+ "Produkty: " + allProduct.getKindeOfProdukt() +" Cena: " + allProduct.getPrice() );
        return true;
    }
}
