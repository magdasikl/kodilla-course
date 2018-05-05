package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

class BookSalesProduct implements SalesProduct{
    public boolean sales(final User user, final LocalDate dateSales, final int quantity, final double price) {
        System.out.println("Sale book for: "+ user.firstName + user.surname + "Date order: "+ dateSales.toString()+" ,Quantity: " +quantity+ " ,Price: "+ quantity*price);
        return true;
    }

}
