package com.pb.demidenko.hw11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(name, that.name) && Objects.equals(number, that.number) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(address, that.address) && Objects.equals(timeEdit, that.timeEdit);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, number, dateOfBirth, address, timeEdit);
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
