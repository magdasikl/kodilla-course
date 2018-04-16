package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private int area;

    public Triangle(int area) {
        this.area = area;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public Integer getField() {
        return area;
    }
}
