package com.assignment5.Bridge;

/**
 * Created by ajpGa on 2018/03/20.
 */
public class FamilyCar extends Car {
    public FamilyCar(Engine engine){
        this.distance = 100;
        this.engine = engine;
    }

    @Override
    public void startCar() {
        System.out.println("Doing Performance test");
        int engineSpeed = engine.run();
        speedRate(engineSpeed);

    }
}
