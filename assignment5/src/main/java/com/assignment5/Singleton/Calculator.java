package com.assignment5.Singleton;

/**
 * Created by ajpGa on 2018/03/19.
 */
public class Calculator {
    private static Calculator calculator = null;
    private Calculator(){
    }

    public static Calculator getInstance(){
        if (calculator == null){
            calculator = new Calculator();
        }
        return calculator;
    }
    protected static int add(int a, int b){
        return (a+b);
    }
    protected static int subtract(int a, int b){
        return (a-b);
    }
    protected static int multiply(int a, int b){
        return (a*b);
    }
    protected static int divide(int a, int b){
        return (a/b);
    }




}
