package com.pb.demidenko.hw6;
import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) throws Exception {

        Animal[] animals = new Animal[3];

        Cat cat = new Cat("мяу", "пушок", "китикет", "домашний кот");
        Dog dog = new Dog("Мясо", "вольер", "Шарпей", "Гав-гав");
        Horse horse = new Horse("Сено", "Ферма", "Зоря", "Игого");
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = horse;


        Class compClazz = Class.forName("com.pb.demidenko.hw6.Veterinarian");
        Object obj = compClazz.newInstance();
        Veterinarian veterinarian = (Veterinarian) obj;


        for (Animal animal : animals) {
            System.out.println("-----------------------------------------------------");
            animal.makeNoise();
            animal.eat();
            animal.sleep();
            veterinarian.treatAnimal(animal);

        }
    }

}