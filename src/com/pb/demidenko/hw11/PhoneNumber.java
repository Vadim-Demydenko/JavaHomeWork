package com.pb.demidenko.hw11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {
    private String name;
    private List<String> number = new  ArrayList<>();
    private String  dateOfBirth;
    private String address;
    private LocalDate timeEdit;

    public PhoneNumber(String name, List<String> number,String dateOfBirth, String address, LocalDate timeEdit) {
        this.name = name;
        this.number = number;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.timeEdit = timeEdit;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(List<String> number) {
        this.number = number;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTimeEdit(LocalDate timeEdit) {
        this.timeEdit = timeEdit;
    }

    public String getName() {
        return name;
    }

    public List<String> getNumber() {
        return number;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getTimeEdit() {
        return timeEdit;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", timeEdit=" + timeEdit +
                '}';
    }
}
