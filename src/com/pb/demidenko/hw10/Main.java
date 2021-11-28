package com.pb.demidenko.hw10;

public class Main {
    public static void main(String[] args) {

        Integer[] intArray = new Integer[10];
        NumBox<Integer> numbox = new NumBox<>(intArray, 10);

//        Integer i = new Integer(2);
        //заполнили массив элементами
        try {
            for (int i = 0; i < 10; i++) {
                int k = (int) (Math.random() * 100);
                numbox.add(new Integer(k));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Елементы массива i = "+ i + " = " + numbox.get(i));

        }

        System.out.println("В массиве находится кол-во элементов = "+ numbox.length());

        System.out.println("Среднее арифметическое элементов массива = " + numbox.average());
        System.out.println("Сумма всех элементов массива = "+ numbox.sum());
        System.out.println("Максимальный элемент массива = "+ numbox.max());


        Float[] floatArray = new Float[10];
        NumBox <Float>  numbox1 = new NumBox<>(floatArray, 10);
        //заполнили массив элементами
        try {
            for (int i = 0; i < 10; i++) {
                float k = (float) (Math.random() * 100.00);
                numbox1.add(new Float(k));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Елементы массива i = "+ i + " = " + numbox1.get(i));
        }

        System.out.println("В массиве находится кол-во элементов = "+ numbox1.length());

        System.out.println("Среднее арифметическое элементов массива = " + numbox1.average());
        System.out.println("Сумма всех элементов массива = "+ numbox1.sum());
        System.out.println("Максимальный элемент массива = "+ numbox1.max());


    }
}