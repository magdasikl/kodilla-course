package com.kodilla.patterns2.facade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Order {
    private final Long orderId;
    private final Long userId;
    List<Item> items = new ArrayList<>();
    private ProductService productService;
    private boolean isVerified;
    private boolean isPaid = false;
    private boolean isSumitted = false;

    public Order( Long orderId, Long userId,ProductService productService) {
        this.productService = productService;
        this.orderId = orderId;
        this.userId = userId;
    }

    public BigDecimal calculateValue() {
        BigDecimal sum = BigDecimal.ZERO;
        for (Item item : items) {
            sum = sum.add(productService.getPrice(item.getProductId())).multiply(new BigDecimal(item.getGty()));
        }
        return sum;
    }

    public List<Item> getItems() {
        return items;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public boolean isSumitted() {
        return isSumitted;
    }

    public void setSumitted(boolean sumitted) {
        isSumitted = sumitted;
    }
}
