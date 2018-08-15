package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class Repository implements OrderRepository {

    @Override
    public void createOrder(User user, LocalDate dateSales) {
        System.out.println("Add new order to repository on date: " + dateSales +"/n User name: "+ user.firstName + user.surname);
    }
}
