package com.pb.demidenko.hw8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Auth {
    private String login, password;


    public void signUp (String login,String password, String confirmPassword ) throws WrongPasswordException, WrongLoginException {
        String pattern;//проверка на буквы лвтиницы, цифры
        pattern = "[A-Za-z0-9]";
        Pattern ptrn = Pattern.compile(pattern);
            Matcher matcher = ptrn.matcher(login);
            if ((login.length() >= 5 ) && (login.length() <= 20 ) && (matcher.find())){
                this.login = login;
            }else {
                throw new WrongLoginException();
            }

             pattern = "[A-Za-z0-9_]";//проверка на буквы лвтиницы, цифры и подчеркивание

             ptrn = Pattern.compile(pattern);
             matcher = ptrn.matcher(password);
            if ((password.length() > 5 ) &&  (matcher.find()) && (password.equals(confirmPassword))){
                this.password = password;
                System.out.println("Поздравляем, регистрация успешна!!!");
            }else {
                throw new WrongPasswordException();
            }



    }
    public void signIn(String login, String  password) throws WrongLoginException{
        if ((login.equals(this.login)) && (password.equals(this.password))){
            System.out.println("Вы прошли авторизацию!! ");
        }else {
            throw new WrongLoginException();
        }
    }

}
