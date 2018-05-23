package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
//        Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Bułka")
                .sauce(SauceFactory.BARBECUE)
                .burgers(2)
                .ingredient("sałata")
                .ingredient("ogórek")
                .ingredient("chilli")
                .ingredient("ser")
                .build();
        System.out.println(bigmac);

//        When
        int howManyIngredients = bigmac.getIngredients().size();

//        Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals("BARBECUE", bigmac.getSauce());
        Assert.assertEquals("sałata",bigmac.getIngredients().get(0));
        Assert.assertEquals("ogórek", bigmac.getIngredients().get(1));
        Assert.assertEquals("chilli", bigmac.getIngredients().get(2));
        Assert.assertEquals("ser", bigmac.getIngredients().get(3));
    }
}
