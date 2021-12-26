package com.pb.demidenko.hw13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    private static int product=0;
    protected static List<String> bufer = new ArrayList<>();

    public synchronized void get() {
        System.out.println("До работы get bufer v get " + bufer);
        while (bufer.size() == 0) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product--;
        bufer.remove(product);


        System.out.println("Потребитель забрал 1 товар");
        System.out.println("Товары на складе" + bufer);
        System.out.println("Товаров на складе: " + product);
        notify();
    }
    public synchronized  void put() {
        System.out.println("До работы put bufr v put " + bufer);
        while (bufer.size() >= 2) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }


        bufer.add(product,("Товар "+product));
        product++;
        System.out.println("Производитель добавил 1 товар");
        System.out.println("Товаров на складе: " + product);
        notify();
    }

}
