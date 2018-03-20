package com.assignment5.StrategyPattern;

/**
 * Created by ajpGa on 2018/03/19.
 */
public class Info {

    int opponents;
    Strategy strategy;

    public Info(int opponents, Strategy strategy)
    {
        this.opponents = opponents;
        this.strategy  = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getOpponents() {
        return opponents;
    }

    public void setOpponents(int opponents) {
        this.opponents = opponents;
    }

    public boolean getResult() {
        return strategy.combat(opponents);
    }
}
