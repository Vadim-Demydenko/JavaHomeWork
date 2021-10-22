package com.pb.demidenko.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int userInput, countIter, bingoProg;

        Scanner scan = new Scanner(System.in);
        countIter = 0; //Число попыток пользователя
        bingoProg = (int) ((Math.random()) * 101); // Загадали число от [0 - 100]

        System.out.println(" Отгадайте число в диапазоне от 0 до 100 и получите приз! ");
        do {

            System.out.println("Введите ваше число или любое отрицательное для выхода из игры : ");
            userInput = scan.nextInt();
            if (userInput < 0) {
                System.out.println("Всего хорошего!!!");
                break;
            }
            if (userInput == bingoProg ) {
                System.out.println("Вы угадали, загаданное число " + bingoProg);
                System.out.println("потрачено попыток " + countIter);
                break;
            }
            else if (userInput > bingoProg){
                System.out.println("Ваше число больше призового");
                }
            else if (userInput < bingoProg){
                System.out.println("Ваше число меньше призового");

            }
        countIter++;


        }
        while (userInput > 0);
    }
}
