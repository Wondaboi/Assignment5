package com.assignment5.ChainOfResponsibilty;

/**
 * Created by ajpGa on 2018/03/19.
 */
public class LowPayerHandler extends TaxPayerHandler {
    @Override
    public String handleRequest(int request) {
        if (request < 18) {
            return " Low Tax Payer";
        } else {

            return successor.handleRequest(request);
        }
    }
}
