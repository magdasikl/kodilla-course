package com.kodilla.good.patterns.challenges;

public class MapWithTitles {
    public static void main(String[] args) {
//        MovieStore movieStore = new MovieStore();
//        movieStore.getMovies().values().stream()
//                .flatMap(strings -> strings.stream())
//                .map(s -> s+"! ")
//                .forEach(System.out::print);print

        SellRequestRetriever sellRequestRetriever = new SellRequestRetriever();
        SellRequest sellRequest = sellRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new BookSellProduct(), new Repository());
        productOrderService.process(sellRequest);




    }
}
