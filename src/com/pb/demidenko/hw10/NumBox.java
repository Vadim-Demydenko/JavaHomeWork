package com.pb.demidenko.hw10;

public class NumBox <T extends Number> {
    private T[] numbers;
    private int maxLength; // максимальное число эл-тов в массиве
    private int indexArray = 0; //Фактическая заполенеость массива

    public NumBox(T[] numbers, int maxLength) {
        this.numbers = numbers;
        this.maxLength = maxLength;
    }

    public void add(T num) throws Exception {
        if (indexArray < maxLength) {
            numbers[indexArray] = num;
            indexArray++;
        } else {
            throw new Exception("Массив заполнен !!!");
        }

    }

    T get(int index) {
        return numbers[index];

    }

    int length() {
        return indexArray;
    }

    double average() {
        double sum = 0;
        for (int i = 0; i < indexArray; i++) {
            sum = sum +  numbers[i].doubleValue();
        }
        return sum / indexArray;
    }

    double sum() {
        double sum = 0;
        for (int i = 0; i < indexArray; i++) {
            sum = sum + numbers[i].doubleValue();
        }
        return sum;
    }

    double max() {

        double maxElement = numbers[0].doubleValue();
        int i = 0;

        while (i < indexArray) {
            if (maxElement < numbers[i].doubleValue()) {
                maxElement = numbers[i].doubleValue();
            } i++;
        }
        return  maxElement;
    }


}