package com.kodilla;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        Calculator simpleCalculator = new Calculator();
        int addResult = simpleCalculator.add(18, 150);
        int substractResult = simpleCalculator.subtract(1350, 879);

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
