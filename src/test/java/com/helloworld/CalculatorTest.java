package com.helloworld;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator test = new Calculator();
        Assert.assertEquals("The output should be 14", 14, test.addition(7,7));
    }

    @Test
    public void testSubtraction() {
        Calculator test = new Calculator();
        Assert.assertEquals("The output should be 13", 13, test.subtraction(20,7));
    }

    @Test
    public void testMultiplication() {
        Calculator test = new Calculator();
        Assert.assertEquals("The output should be 24", 4, test.multiplication(8,3));
    }

    @Test
    public void testDivision() {
        Calculator test = new Calculator();
        Assert.assertEquals("The output should be 22", 22, test.division(66,3));
    }
}
