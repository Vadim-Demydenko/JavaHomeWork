package com.pb.demidenko.hw2;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1, operand2, rezult;
        String sign;
        char chSign;

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число для расчета");
        operand1 = scan.nextInt();

        System.out.println("Введите второе число для расчета");
        operand2 = scan.nextInt();
        scan.nextLine();

        System.out.println("Введите знак операции (+ -, *, /)");
        sign = scan.nextLine();
        System.out.println("знакоперации " + sign);

        switch (sign) {
            case "+" :
                 rezult = operand1 + operand2;

                System.out.println("сложение " + operand1 +"+"+ operand2 + "=" +rezult);
                break;
            case "-"  :
                rezult = operand1 - operand2;
                System.out.println("вычитание " + operand1 +"-"+ operand2 + "=" +rezult);
                break;
            case "/"  :
                if (operand2 != 0){
                    rezult = operand1 / operand2;
                    System.out.println("деление " + operand1 +"/"+ operand2 + "=" +rezult);
                }
                 else
                    System.out.println("На ноль делить нельзя !!!");
                    break;
            case "*"  :
                rezult = operand1 * operand2;
                System.out.println("умножение " + operand1 +"*"+ operand2 + "=" +rezult);
                break;
            default:
                System.out.println("Символ операции не распознан, повторите");


        }


    }
}
