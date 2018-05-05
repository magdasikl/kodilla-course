package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class SalesRequest {
    private User user;
    private LocalDate salesDate;
    private int quantity;
    private double price;

    public SalesRequest(User user, LocalDate salesDate, int quantity, double price) {
        this.user = user;
        this.salesDate = salesDate;
        quantity = quantity;
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getSalesDate() {
        return salesDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
