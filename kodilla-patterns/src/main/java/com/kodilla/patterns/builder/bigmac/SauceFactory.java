package com.kodilla.patterns.builder.bigmac;

public class SauceFactory {
    public static final String STANDARD = "STANDARD";
    public static final String WYSP = "1000 WYSP";
    public static final String BARBECUE = "BARBECUE";

    public final String makeSauce(final String bigmacClass) {
        switch (bigmacClass) {
            case STANDARD:
                return STANDARD;
            case WYSP:
                return WYSP;
            case BARBECUE:
                return BARBECUE;
            default:
                return null;
        }

    }
}
