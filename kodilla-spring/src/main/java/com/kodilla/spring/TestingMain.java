package com.kodilla.spring;

import com.kodilla.spring.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        Calculator simpleCalculator = new Calculator();
        double addResult = simpleCalculator.add(18, 150);
        double substractResult = simpleCalculator.sub(1350, 879);

        if (addResult == 168) {
            System.out.println("Dodawanie zgadza się");
        } else {
            System.out.println("Błąd dodawania");
        }

        if (substractResult == 471){
            System.out.println("Odejmowanie jest zgodne");
        } else {
            System.out.println("Błąd odejmowania");
        }

    }
}
