package com.kodilla.hibernate.manytomany.facade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTest {

    @Autowired
    private Facade facade;

    @Test
    public void testCompanyFacade () {
        try {
            facade.processFacade("GRE","Smith");
        } catch (FacadeProcessingException e){
        }
    }



}