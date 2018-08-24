package com.kodilla.good.patters.food2door;

import java.util.ArrayList;
import java.util.List;

public class Food2Door {
    public static void main(String[] args) {
        List<Product> listproducts = new ArrayList<>();
        listproducts.add(new ExtraFoodShopProduct("kapusta", 1, 2.0));

        Shop shop = new  ExtraFoodShop(listproducts);
        Repository repository = new Repository();
        ProductOrderService productOrderService = new ProductOrderService(shop,repository) ;

        productOrderService.getResponse(shop.getListProducts().get(0));

    }
}
