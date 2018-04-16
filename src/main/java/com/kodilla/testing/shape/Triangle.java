package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private int area;

    public Triangle(int area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return area == triangle.area;
    }

    @Override
    public int hashCode() {

        return Objects.hash(area);
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
