package com.assignment5.StrategyPattern;

/**
 * Created by ajpGa on 2018/03/19.
 */
public class KickStrategy implements Strategy {

    public boolean combat(int opponents) {
        if ((opponents >= 0) && (opponents <= 5))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
