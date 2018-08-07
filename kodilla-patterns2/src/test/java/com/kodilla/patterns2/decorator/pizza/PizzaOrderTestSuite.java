package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder() ;
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        System.out.println(calculatedCost);
        assertEquals(new BigDecimal(15.00),calculatedCost);
    }
    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder() ;
        //When
        String description = theOrder.getDescription();
        //Then
        System.out.println(description);
        assertEquals("Your pizza has toppins: ", description);

    }

    @Test
    public void testPizzaOrderDecoratorGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCakeDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        System.out.println(theCost);
        assertEquals(new BigDecimal(18), theCost);
    }
    @Test
    public void testPizzaOrderDecoratorGetDesc() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCakeDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        System.out.println(description);
        assertEquals("Your pizza has toppins: double cake", description);
    }

    @Test
    public void testSalamiDecoratorGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCakeDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        System.out.println(theCost);
        assertEquals(new BigDecimal(22),theCost);
    }

    @Test
    public void testSalamiDecoratorGetDesc() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCakeDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        System.out.println(description);
        assertEquals("Your pizza has toppins: double cake, salami", description);
    }

    @Test
    public void testPepperDecoratorGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCakeDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new PepperDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        System.out.println(theCost);
        assertEquals(new BigDecimal(24),theCost);
    }

    @Test
    public void testPepperDecoratorGetDesc() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCakeDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new PepperDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        System.out.println(description);
        assertEquals("Your pizza has toppins: double cake, salami, peppers", description);
    }
}