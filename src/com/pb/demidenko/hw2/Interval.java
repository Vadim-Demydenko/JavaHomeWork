package com.pb.demidenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int userInput;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число для определения интервала");
        userInput = scan.nextInt();
        if ( userInput >= 0  && userInput <= 14 ){
            //             System.out.println("Введенное число" + userInput + " лежит винтервале [0 -14]");
            System.out.println("Введенное число лежит винтервале [0 -14]");
        }
        else if  (userInput >= 15 && userInput <= 35 ){
            System.out.println("Введенное число лежит винтервале [15 -35]");
        }
        else if ((userInput >= 36) && (userInput <= 50)) {
            System.out.println("Введенное число лежит в интервале [36 - 50]");
        }
        else if  ((userInput >= 51 ) && (userInput <= 100)) {
            System.out.println("Введенное число лежит в интервале [51 - 100]");
        }
        else
            System.out.println("Число не входит в интнрвалы контроля");
    }

}



