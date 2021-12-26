package com.pb.demidenko.hw13;

public class Consumer implements Runnable{

    private final Store store;
    Consumer(Store store){
        this.store=store;
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            store.get();
        }
    }

}
