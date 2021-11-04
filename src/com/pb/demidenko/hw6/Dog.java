package com.pb.demidenko.hw6;

import java.util.Objects;

public class Dog extends Animal{
    private String nameDog;
    private String voiceDog;

    public Dog(String food, String location, String nameDog, String voiceDog) {
        super(food, location);
        this.nameDog = nameDog;
        this.voiceDog = voiceDog;
    }

    public void setNameDog(String nameDog) {
        this.nameDog = nameDog;
    }

    public void setVoiceDog(String voiceDog) {
        this.voiceDog = voiceDog;
    }

    public String getNameDog() {
        return nameDog;
    }

    public String getVoiceDog() {
        return voiceDog;
    }

    @Override
    public void makeNoise() {
        System.out.println("Животное " + nameDog + " подает голос " + voiceDog);

    }

    @Override
    public void eat() {
        System.out.println("Животное " + nameDog+ " кушает " + super.getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return nameDog.equals(dog.nameDog) && voiceDog.equals(dog.voiceDog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameDog, voiceDog);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nameDog='" + nameDog + '\'' +
                ", voiceDog='" + voiceDog + '\'' +
                '}';
    }
}
