package com.pb.demidenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int userInput;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число для определения интервала");
        userInput = scan.nextInt();
        if ( userInput >= 0.0   && userInput <= 14.0 ){
            //             System.out.println("Введенное число" + userInput + " лежит винтервале [0 -14]");
            System.out.println("Введенное число лежит винтервале [0 -14]");
        }
        else if  (userInput >= 15.0 && userInput <= 35.0 ){
            System.out.println("Введенное число лежит винтервале [15 -35]");
        }
        else if ((userInput >= 36.0) && (userInput <= 50.0)) {
            System.out.println("Введенное число лежит винтервале [36 - 50]");
        }
        else if  ((userInput >= 51.0 ) && (userInput <= 100.0)) {
            System.out.println("Введенное число лежит винтервале [51 - 100]");
        }
        else
            System.out.println("Число не входит в интнрвалы контроля");
    }

}



