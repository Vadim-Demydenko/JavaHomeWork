package com.pb.demidenko.hw6;

public class Animal {

    private String food, location;

    public Animal(String food, String location){
        this.food = food;
        this.location = location;

    }
    public Animal(){

    }
    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }


    public void makeNoise(){
        System.out.println("Голос Животного");

    }
    public void eat(){
        System.out.println("Животное кушает " + food);
    }
    public void sleep(){
        System.out.println("Животное отдыхает " + location);
    }
}
