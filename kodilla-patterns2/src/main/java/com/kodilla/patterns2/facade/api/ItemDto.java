package com.kodilla.patterns2.facade.api;

public final class ItemDto {
    private final Long productId;
    private final double guantity;

    public ItemDto(final Long productId, final double guantity) {
        this.productId = productId;
        this.guantity = guantity;
    }

    public Long getProductId() {
        return productId;
    }

    public double getGuantity() {
        return guantity;
    }
}
