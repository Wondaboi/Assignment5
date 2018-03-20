package com.assignment5.Bridge;

/**
 * Created by ajpGa on 2018/03/20.
 */
public abstract class Car {


    Engine engine;
    int distance;
    int speedRate;

    public abstract void startCar();

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public void speedRate(int time){
        speedRate = distance/time;
        if (speedRate >= 5){
            System.out.println("Speed Performance: " + speedRate);
            System.out.println("Family Car\n");
        }
        else if (speedRate < 5){
            System.out.println("Speed Performance: " + speedRate);
            System.out.println("Sports Car\n");
        }
    }

    public int getSpeedRate() {
        return speedRate;
    }
}
