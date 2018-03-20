package com.assignment5.FactoryMethod;

/**
 * Created by ajpGa on 2018/03/19.
 */
public class WorkerFactory {
    private static WorkerFactory workerFactory = null;

    private WorkerFactory(){
    }

    public static WorkerFactory getWorkerFactoryInstance() {
        if (workerFactory == null)
            return new WorkerFactory();
        return workerFactory;
    }

    public Worker getWorkerJob(String worker) {
        if ("Miner".equalsIgnoreCase(worker))
        {
            return new Miner();
        } else {
            return new Builder();
        }
    }
}
