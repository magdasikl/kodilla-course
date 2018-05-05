package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private SalesProduct salesProduct;
    private SalesRepository salesRepository;

    public ProductOrderService(SalesProduct salesProduct, SalesRepository salesRepository) {
        this.salesProduct = salesProduct;
        this.salesRepository = salesRepository;
    }

    public SalesDto process(SalesRequest salesRequest){
        boolean isSold = salesProduct.sales(salesRequest.getUser(),salesRequest.getSalesDate(),salesRequest.getQuantity(),salesRequest.getPrice());
        if(isSold) {
            salesRepository.createRepository(salesRequest.getUser(),salesRequest.getSalesDate());
            return new SalesDto(salesRequest.getUser(), true);
        } else {
            System.out.println("nie udało się");
            return new SalesDto(salesRequest.getUser(), false);
        }
    }
}
