package com.assignment5.Singleton;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by ajpGa on 2018/03/20.
 */
public class CalculatorTest extends TestCase {
    public void setUp() throws Exception {
        super.setUp();
    }

    public void testGetInstance() throws Exception {
        Calculator calculator = Calculator.getInstance();
        Assert.assertNotNull(calculator);
    }

    public void testAdd() throws Exception {
        Calculator calculator = Calculator.getInstance();
        System.out.println(calculator.add(1, 2));
        Assert.assertEquals(3, calculator.add(1,2));
    }

    public void testSubtract() throws Exception {
        Calculator calculator = Calculator.getInstance();
        System.out.println(calculator.subtract(4, 2));
        Assert.assertEquals(2, calculator.subtract(4,2));
    }

    public void testMultiply() throws Exception {
        Calculator calculator = Calculator.getInstance();
        System.out.println(calculator.multiply(2, 3));
        Assert.assertEquals(6, calculator.multiply(2,3));
    }

    public void testDivide() throws Exception {
        Calculator calculator = Calculator.getInstance();
        System.out.println(calculator.divide(9, 3));
        Assert.assertEquals(3, calculator.divide(9,3));
    }

}