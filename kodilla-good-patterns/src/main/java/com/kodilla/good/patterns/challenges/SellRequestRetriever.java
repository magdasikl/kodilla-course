package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class SellRequestRetriever {
    public SellRequest retrieve() {
        User user = new User("Magda", "Zak");
        LocalDate salesDate = LocalDate.of(2018, 04, 23);
        return new SellRequest(user, salesDate, 2, 45.00);
    }
}
