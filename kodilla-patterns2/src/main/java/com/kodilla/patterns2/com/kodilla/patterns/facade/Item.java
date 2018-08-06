package com.kodilla.patterns2.com.kodilla.patterns.facade;

public class Item {
    private final Long productId;
    private final double gty;

    public Item(Long productId, double gty) {
        this.productId = productId;
        this.gty = gty;
    }

    public Long getProductId() {
        return productId;
    }

    public double getGty() {
        return gty;
    }
}
