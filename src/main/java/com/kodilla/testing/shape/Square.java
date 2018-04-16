package com.kodilla.testing.shape;

public class Square implements Shape {
    private int area;

    public Square(int area) {
        this.area = area;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public Integer getField() {

        return area;
    }
}
