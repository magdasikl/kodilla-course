package com.kodilla.good.patters.food2door;

import java.util.List;

public interface Shop extends OrderProcessor {

    public String getName();

    public String getId();

    public List<Product> getListProducts();

    public void addProduct (Product product);
}
