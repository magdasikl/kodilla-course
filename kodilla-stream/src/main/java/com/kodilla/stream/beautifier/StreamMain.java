package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main (String[] args){
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("tekst małymi literami", decoration -> decoration.toUpperCase()));
        System.out.println(poemBeautifier.beautify("tekst małymi literami", decoration -> "ABC "+decoration+" ABC"));
        System.out.println(poemBeautifier.beautify("tekst małymi literami", decoration -> decoration.substring(6,13)));
        System.out.println(poemBeautifier.beautify("    tekst małymi literami", decoration -> decoration.trim()));

    }
}
