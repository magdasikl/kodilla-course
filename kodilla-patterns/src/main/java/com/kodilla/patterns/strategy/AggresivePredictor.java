package com.kodilla.patterns.strategy;

public class AggresivePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Aggreesive predictor] Buy stock of XYZ";
    }
}
