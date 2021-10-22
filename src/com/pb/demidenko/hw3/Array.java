package com.pb.demidenko.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arrayUserInput = new int[10];
        int sumArray = 0;
        int count = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Для заполенения массива введите десять целых чисел");
        for (int i = 0; i < 10; i++){
            System.out.println("Введите число номер #"+ i);
            arrayUserInput[i] = scan.nextInt();
        }
        System.out.println("Вы ввели числа ");
        for(int i = 0; i < 10; i++){
            System.out.print(" Число #" + i + "="+ arrayUserInput[i]);
        }

        for(int i = 0; i < 10; i++){
            sumArray += arrayUserInput[i];
        }
        System.out.println();
        System.out.println("Сумма всех элементов массива " + sumArray);

        for(int i = 0; i < 10; i++){
            if (arrayUserInput[i] > 0){
                 ++count;
            }

        }
        System.out.println("Массив содержит " + count +" положительных элементов");

        for (int i = 9; i >  0; i--)
            for (int k = 0; k < i; k++){
                if (arrayUserInput[k] > arrayUserInput[k+1]) {
                    int tmp = arrayUserInput[k];
                    arrayUserInput[k] = arrayUserInput[k + 1];
                    arrayUserInput[k + 1] = tmp;
                }
            }

        System.out.println("Отсортированный массив ");
        for(int i = 0; i < 10; i++){
            System.out.print(" Число # " + i + " ="+ arrayUserInput[i]);
        }
    }

}
