package com.pb.demidenko.hw4;

import com.pb.demidenko.hw3.Array;

import java.util.Arrays;
import java.util.Scanner;

public class CapitalLetter {

    static String firstChToUper(String str){
        char[] strChArr = str.toCharArray(); // принятую строку перевели в массив символов
        for (int i = 0; i < strChArr.length; i++){
            // Если первый элемент буква перводим в вехний регистр
            if ((i == 0) && (Character.isLetter(strChArr[0]))){
                strChArr[0] = Character.toUpperCase(strChArr[0]);
            }
            // Если элемент не первый и предыдущий элемент пробел и символ буква перводим в вехний регистр
            else if (((i != 0)&& (strChArr[i-1]) == ' ') && (Character.isLetter(strChArr[i]))){
                strChArr[i] =  Character.toUpperCase(strChArr[i]);

            }

        }
        str = new String (strChArr); // массив символов в строку
        return str;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strv = "";
        System.out.println("Введите строку для перевода первой буквыс лова в верхний регистр");
        strv = scan.nextLine();
        System.out.println("Модифицированная строка");
        System.out.println(firstChToUper(strv));

    }
}
