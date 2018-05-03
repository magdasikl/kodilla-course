package com.kodilla.good.patterns.challenges;

public class MapWithTitles {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().values().stream()
                .flatMap(strings -> strings.stream())
                .map(s -> s+"! ")
                .forEach(System.out::print);
    }
}
