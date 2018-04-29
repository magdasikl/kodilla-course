package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
@Test
        public void testGetPeopleQuantity(){

            //    Given
            Continent continent1 = new Continent();
            continent1.addCountry(new Country("Polska", new BigDecimal("40")),"Europa");
            continent1.addCountry(new Country("Węgry",new BigDecimal("38")),"Europa");
            continent1.addCountry(new Country("Niemcy",new BigDecimal("60")),"Europa");

            Continent continent2 = new Continent();
            continent2.addCountry(new Country("USA",new BigDecimal("70")),"Ameryka Płn.");

            World world = new World();
            world.addContinents(continent1);
            world.addContinents(continent2);

//            When
            world.getPeopleQuantity();
            BigDecimal numberPeopleWord = world.getPeopleQuantity();

//            Then
            BigDecimal quantity = new BigDecimal("208");
            Assert.assertEquals(quantity, numberPeopleWord);

        }
}
