package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface SalesRepository {
    public void createRepository(final User user, final LocalDate dateSales);
}
