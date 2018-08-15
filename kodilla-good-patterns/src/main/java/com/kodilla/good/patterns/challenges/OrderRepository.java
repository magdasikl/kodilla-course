package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderRepository {
    public void createOrder(final User user, final LocalDate dateSales);
}
