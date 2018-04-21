package com.kodilla.stream.beautifier;

public class StreamMain {
    public void main (String[] args){
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("ABC", decoration -> ("ABC"));
        System.out.println(poemBeautifier);
    }
}
