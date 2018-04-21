package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure(){
    // Given
        Shape figure = new Circle(6);
        ShapeCollector figures = new ShapeCollector();
    // When
        Shape number = figures.addFigure(figure);
//     Then
        Assert.assertEquals(number,figure);
            System.out.println(" działa");

    }

    @Test
    public void testRemoveFigure() {
//       Given
        Shape figure = new Circle(76);
        ShapeCollector figures = new ShapeCollector();
//        When
        figures.addFigure(figure);
        Shape number = figures.removeFigure(figure);
//        Then
        Assert.assertEquals(number,number);
            System.out.println("odjęło figure");


    }
    @Test
    public void testGetFigure() {
//        Given
        ShapeCollector figures = new ShapeCollector();
        Shape figure = new Square(54);
        figures.addFigure(figure);
//        When
        Shape number = figures.getFigure(0);
//        Then
       Assert.assertEquals(number, figure );
            System.out.println("pobiera figurę");

    }
}
