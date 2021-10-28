package com.pb.demidenko.hw4;

import com.pb.demidenko.hw3.Array;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
 // функкция вводит строку от пользователя
    static String inputStr(){
        String str = "";
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        return str;
    }
    //функция модифицирует строку, оставляя только буквы, переводит
    // буквы в нижний регистр  и упорядочивает строку
    static String  modifStr(String str){
        char[] chAray = str.toCharArray();
        char[] chArayModif = new char[str.length()]; // храним модиф строку

        // оставили только буквы
        for (int i = 0; i < chAray.length; i++){
            if  ((Character.isLetter(chAray[i])) && (!(Character.isWhitespace(chAray[i]))) ) {
                chArayModif[i] = chAray[i];
            }

        }
        str = new String(chArayModif); //массив в строку
        str = str.toLowerCase(Locale.ROOT); //перевели в нижний регистр
        chArayModif = str.toCharArray(); //строку в массив
        Arrays.sort(chArayModif);    // отсортировали
        return (new String(chArayModif));
    }

    public static void main(String[] args) {
        String str1, str2;

        System.out.println("Введите первую строку для проверки является ли она анаграммой другой строки");
        str1 = inputStr();
        System.out.println("Введите вторую строку ");
        str2 = inputStr();

        str1 = modifStr(str1);
        str2 = modifStr(str2);
        char[] chstr2 = str2.toCharArray();
        System.out.println("строка 1 " + str1);
        System.out.println("строка 2 " + str2);
        if ( str2.equals(str1)){
            System.out.println("строки анаграммы");
       }
        else {
            System.out.println("строки не анаграммы");
        }

    }

}
