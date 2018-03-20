package com.assignment5.Bridge;

/**
 * Created by ajpGa on 2018/03/20.
 */
public class FourLitreEngine implements Engine {
    int speedRate;

    public FourLitreEngine(){
        speedRate = 4;
    }
    public int run() {
        return speedRate;
    }
}
