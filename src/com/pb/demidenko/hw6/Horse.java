package com.pb.demidenko.hw6;

import java.util.Objects;

public class Horse extends Animal{
    private String nameHorse;
    private String voiceHorse;

    public Horse(String food, String location, String nameHorse, String voiceHorse) {
        super(food, location);
        this.nameHorse = nameHorse;
        this.voiceHorse = voiceHorse;
    }

    public void setNameHorse(String nameHorse) {
        this.nameHorse = nameHorse;
    }

    public void setVoiceHorse(String voiceHorse) {
        this.voiceHorse = voiceHorse;
    }

    public String getNameHorse() {
        return nameHorse;
    }

    public String getVoiceHorse() {
        return voiceHorse;
    }

    @Override
    public void makeNoise() {
        System.out.println("Жиотное" +  nameHorse + " подает голос " + voiceHorse);
    }

    @Override
    public void eat() {
        System.out.println("Животное " + nameHorse+ " кушает " + super.getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return nameHorse.equals(horse.nameHorse) && voiceHorse.equals(horse.voiceHorse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameHorse, voiceHorse);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "nameHorse='" + nameHorse + '\'' +
                ", voiceHorse='" + voiceHorse + '\'' +
                '}';
    }
}
