package com.kodilla.testing.shape;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return area == square.area;
    }

    @Override
    public int hashCode() {

        return Objects.hash(area);
    }
}
