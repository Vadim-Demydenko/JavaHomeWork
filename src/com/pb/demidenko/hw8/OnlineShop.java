package com.pb.demidenko.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        String login, password, confirmPassword;
        Auth auth = new Auth();

        Scanner scan = new Scanner(System.in);
        try {

            System.out.println("Введите логин для регистрации");
            login = scan.nextLine();
            System.out.println("Введите пароль для регистрации");
            password = scan.nextLine();
            System.out.println("Введите пароль для подтверждения");
            confirmPassword = scan.nextLine();
            auth.signUp(login, confirmPassword, password);
            System.out.println("Введите логин для авторизации");
            login = scan.nextLine();
            System.out.println("Введите пароль для авторизации");
            password = scan.nextLine();
            auth.signIn(login, password);

        } catch (WrongLoginException e) {
            System.out.println("Логин не соответствует требованиям");

        }catch (WrongPasswordException e){
            System.out.println("Пароль или логин не соответствует требованиям");
        }

    }
}
