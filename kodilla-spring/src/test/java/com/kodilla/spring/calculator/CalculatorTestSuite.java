package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testAdd() {
//        Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        Display display = context.getBean(Display.class);

        //    When
        double val = calculator.add(2.8, 7.2);
        display.displayValue(val);

//        Then
        Assert.assertEquals(10.0,val,0.01);
    }

    @Test
    public void testSub() {

//        Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        Display display = context.getBean(Display.class);

//        When
        double val = calculator.sub(25,10);
        display.displayValue(val);

//        Then
        Assert.assertEquals(15,val,0.01);
    }

    @Test
    public void testMul() {

//        Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        Display display = context.getBean(Display.class);

//        When
        double val = calculator.mul(56,2);
        display.displayValue(val);

//        Then
        Assert.assertEquals(112, val,0.001);
    }

    @Test
    public void testDiv() {

//        Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        Display display = context.getBean(Display.class);

//        When
        double val = calculator.div(36,6);
        display.displayValue(val);

//        Then
        Assert.assertEquals(6,val,0.001);
    }
}
