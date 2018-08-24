package com.kodilla.good.patters.food2door;

import java.util.List;

public class ExtraFoodShop implements Shop,OrderProcessor {

    private final List<Product> products;

    ExtraFoodShop(List<Product> products) {
        this.products = products;
    }
    @Override
    public boolean process() {
        if (products.isEmpty()) return false; else return true;
    }
    @Override
    public String getName() {
        return "ExtraFood";
    }

    @Override
    public String getId() {
        return "extr-food-id-2018-08";
    }
    public List<Product> getListProducts(){
        return products;
    }
    public void addProduct (Product product) {
        products.add(product);
    }

}