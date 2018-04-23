package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify (String enchances, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(enchances);
        return result;
    }
}
