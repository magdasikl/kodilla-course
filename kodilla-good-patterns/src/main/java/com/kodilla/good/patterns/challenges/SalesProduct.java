package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface SalesProduct {
    public boolean sales(final User user, final LocalDate dateSales, final int quantity, final double price);
}
