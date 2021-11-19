package com.pb.demidenko.hw8;

public class WrongPasswordException extends Exception{
    String mesage;
    public WrongPasswordException(String message) {
        super(message);
        this.mesage = message;
    }

    public WrongPasswordException() {

    }
}
