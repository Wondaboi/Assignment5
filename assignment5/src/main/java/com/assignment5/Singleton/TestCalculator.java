package com.assignment5.Singleton;

/**
 * Created by ajpGa on 2018/03/19.
 */
public class TestCalculator {
    public static void main(String[] args){
        Calculator calculator = Calculator.getInstance();
        calculator.add(1, 2);
        calculator.subtract(4, 2);
        calculator.multiply(2, 3);
        calculator.divide(9, 3);
    }

}
