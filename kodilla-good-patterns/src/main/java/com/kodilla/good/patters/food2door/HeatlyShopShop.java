package com.kodilla.good.patters.food2door;

import java.util.List;

public class HeatlyShopShop implements Shop, OrderProcessor {

    private final List<Product> products;

    HeatlyShopShop(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean process() {
        if (products.isEmpty()) return false; else return true;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getId() {
        return null;
    }
    public List<Product> getListProducts(){
        return products;
    }
    public void addProduct (Product product) {
        products.add(product);
    }
}
