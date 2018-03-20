package com.assignment5.Bridge;

/**
 * Created by ajpGa on 2018/03/20.
 */
public class TwoLitreEngine implements Engine{
    int speedRate;

    public TwoLitreEngine(){
        speedRate = 6;
    }
    public int run() {
        return speedRate;
    }
}
