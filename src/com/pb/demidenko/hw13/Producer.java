package com.pb.demidenko.hw13;

public class Producer implements Runnable{
    private final Store store;
    Producer(Store store){
        this.store=store;
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            store.put();
        }
    }
}

