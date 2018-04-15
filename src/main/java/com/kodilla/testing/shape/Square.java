package com.kodilla.testing.shape;

public class Square implements Shape {

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public Integer getField() {
        return 30;
    }
}
