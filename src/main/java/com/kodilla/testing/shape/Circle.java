package com.kodilla.testing.shape;

public class Circle implements Shape {
    private int area;

    public Circle(int area) {
        this.area = area;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public Integer getField() {

        return area;
    }
}
