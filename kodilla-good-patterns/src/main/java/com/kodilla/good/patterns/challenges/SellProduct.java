package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface SellProduct {
    public boolean order(final User user, final LocalDate dateSales, final int quantity, final double price);
}
