package com.pb.demidenko.hw8;

public class WrongLoginException extends Exception{
    String mesage;
    public WrongLoginException(String mesage) {
        super(mesage);
        this.mesage = mesage;

    }
    public WrongLoginException(){};
}

