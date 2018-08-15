package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

class BookSellProduct implements SellProduct {
    public boolean order(final User user, final LocalDate dateSales, final int quantity, final double price) {
        System.out.println("Sale book for: "+ user.firstName + user.surname + "Date order: "+ dateSales.toString()+" ,Quantity: " +quantity+ " ,Price: "+ quantity*price);
        return true;
    }

}
