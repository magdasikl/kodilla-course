package com.kodilla.testing.shape;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return area == circle.area;
    }

    @Override
    public int hashCode() {

        return Objects.hash(area);
    }
}
