package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> figures;

    public ShapeCollector() {
        this.figures = new ArrayList<Shape>();
    }

    public Integer addFigure(Shape shape){
        figures.add(shape);
        return 1;

    }

    public Shape removeFigure(Shape shape) {
        int indexShape = -1;
        Shape rShape = null;
        for (Shape mShape: figures) {
          if(  mShape == shape){
              indexShape =  figures.indexOf(shape);
              rShape = shape;
          }
        }
        figures.remove(indexShape);
        return rShape;

    }

    public Shape getFigure(int n){
        return figures.get(n);

    }

    public void showFigures(){

    }
}
