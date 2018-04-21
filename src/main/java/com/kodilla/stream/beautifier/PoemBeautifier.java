package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify (String enchances, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(enchances);
    }
}
