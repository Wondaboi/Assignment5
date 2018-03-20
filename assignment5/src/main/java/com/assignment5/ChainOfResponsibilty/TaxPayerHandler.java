package com.assignment5.ChainOfResponsibilty;

/**
 * Created by ajpGa on 2018/03/19.
 */
public abstract class TaxPayerHandler {
    TaxPayerHandler successor;

    public void setSuccessor(TaxPayerHandler successor){
        this.successor = successor;
    }

    public abstract String handleRequest(int request);
}
