package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
@Test
        public void testGetPeopleQuantity(){

            //    Given
            Continent continent1 = new Continent();
            continent1.addCountry(new Country("Polska", new BigDecimal("40")));
            continent1.addCountry(new Country("Węgry",new BigDecimal("38")));
            continent1.addCountry(new Country("Niemcy",new BigDecimal("60")));

            Continent continent2 = new Continent();
            continent2.addCountry(new Country("USA",new BigDecimal("70")));

            World world = new World();
            world.addContinents(continent1);
            world.addContinents(continent2);

//            When
            world.getPeopleQuantity();
                System.out.println(world.getPeopleQuantity());

//            Then
            BigDecimal quantity = new BigDecimal("208");
            Assert.assertEquals(quantity, world.getPeopleQuantity());

        }
}
