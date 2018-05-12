package com.kodilla.spring.shape;

public class Drawer {
    public void doDrawing() {
        Figure figure;

        figure = new Circle();
        figure.draw();

        figure = new Triangle();
        figure.draw();

//        Circle circle = new Circle();
//        Triangle triangle = new Triangle();
//
//        circle.draw();
//        triangle.draw();
    }
}
