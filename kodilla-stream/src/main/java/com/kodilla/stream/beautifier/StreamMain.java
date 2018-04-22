package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main (String[] args){
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("tekst małymi literami", decoration -> decoration.toUpperCase());
        poemBeautifier.beautify("tekst małymi literami", decoration -> "ABC "+decoration+" ABC");
        poemBeautifier.beautify("tekst małymi literami", decoration -> decoration.substring(6,13));
        poemBeautifier.beautify("    tekst małymi literami", decoration -> decoration.trim());

    }
}
