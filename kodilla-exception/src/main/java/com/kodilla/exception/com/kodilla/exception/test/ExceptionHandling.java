package com.kodilla.exception.com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String zmienna="";
        double number1 = 2;
        double number2 = 1.3;
        try {
            zmienna = secondChallenge.probablyIWillTtrowException(number1,number2);
        }catch (Exception e){
            System.out.println("Błąd");
        } finally {
            System.out.println(zmienna);
        }
    }
}
