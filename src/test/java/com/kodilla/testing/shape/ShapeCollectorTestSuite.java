package com.kodilla.testing.shape;

import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure(){
    // Given
        Shape figure = new Circle();
        ShapeCollector figures = new ShapeCollector();
    // When
        Integer number = figures.addFigure(figure);
//     Then
        if (number > 0){
            System.out.println(" działa");
        } else {
            System.out.println("błąd metody add");
        }
    }

    @Test
    public void testRemoveFigure() {
//       Given
        Shape figure = new Circle();
        ShapeCollector figures = new ShapeCollector();
//        When
        Integer number = figures.removeFigure(figure);
//        Then
        if(number > 0){
            System.out.println("odjęło figure");
        } else {
            System.out.println("błąd metody remove");
        }
    }
    @Test
    public void testGetFigure() {
//        Given
        ShapeCollector figures = new ShapeCollector();
//        When
        Shape number = figures.getFigure(1);
//        Then
        if( number != null){
            System.out.println(number);
        } else {
            System.out.println("błąd pobierania figury");
        }

    }
}
