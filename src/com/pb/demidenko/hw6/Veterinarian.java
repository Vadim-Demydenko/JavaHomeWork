package com.pb.demidenko.hw6;

public class Veterinarian {
    Veterinarian(){
        System.out.println("Veterinarian создан");
    }

    void treatAnimal(Animal animal){

        System.out.println("На приеме у ветеринара животное еда которого " + animal.getFood());
        System.out.println("На приеме у ветеринара животное среда обитания " + animal.getLocation());
    }
}
