package com.pb.demidenko.hw6;

import java.util.Objects;

public class Cat extends Animal{
    private String voiceCat;
    private String nameCat;

    Cat(String voiceCat, String nameCat, String food, String location){
        super(food,location);
        this.voiceCat = voiceCat;
        this.nameCat = nameCat;
    }
    public void setVoiceCat(String voiceCat) {
        this.voiceCat = voiceCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public String getVoiceCat() {
        return voiceCat;
    }

    public String getNameCat() {
        return nameCat;
    }

    @Override
    public void eat() {
        System.out.println("Животное " + nameCat+ " кушает " + super.getFood());
    }

    @Override
    public void makeNoise(){
        System.out.println("Животное " + nameCat + " подает голос " + voiceCat);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return voiceCat.equals(cat.voiceCat) && nameCat.equals(cat.nameCat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voiceCat, nameCat);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "voiceCat='" + voiceCat + '\'' +
                ", nameCat='" + nameCat + '\'' +
                '}';
    }
    public void newCat(){
        System.out.println("добавили метод в кота");
    };
}
