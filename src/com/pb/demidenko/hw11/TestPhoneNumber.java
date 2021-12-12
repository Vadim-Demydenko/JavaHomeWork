package com.pb.demidenko.hw11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class TestPhoneNumber {

    public static void main(String[] args) {

        List<PhoneNumber> phoneNumbers = new ArrayList<>();
        String fio = "123";
        List<String> numberPh = new ArrayList<>();
        String dateOfBerth;
        String number = "123";
        String address;
        LocalDate timeEdit;

        Scanner scan = new Scanner(System.in);

        while (1 > 0) {
            System.out.println("Введите ФИО абонента или любой символ для выхода");
            fio = scan.nextLine();
            if ((fio.length()) > 1) {
                //       fio = scan.nextLine();
                while ((number.length()) > 1) {
                    System.out.println("Введите номер телефона абонента или 1 для перехода далее");
                    number = scan.nextLine();
                    if ((number.length()) > 1)
                        numberPh.add(number);


                }
                System.out.println("Введите дату рождения аонента");
                dateOfBerth = scan.nextLine();

                System.out.println("Введите адрес абонента");
                address = scan.nextLine();
                timeEdit = LocalDate.now(); //время ред-я
                PhoneNumber phoneNumber = new PhoneNumber(fio, numberPh, dateOfBerth, address, timeEdit);
                phoneNumbers.add(phoneNumber); //
                        System.out.println(phoneNumbers);

            } else break;


        }

        //  удаление абонента по ФИО


        while (1 > 0) {
            System.out.println("Введите ФИО абонента для удаления или любой символ для выхода");
            fio = scan.nextLine();
            if ((fio.length()) > 1) {
                String finalFio = fio;
                phoneNumbers.removeIf(new Predicate<PhoneNumber>() {
                                          @Override
                                          public boolean test(PhoneNumber phoneNumber) {
                                              return finalFio.equals(phoneNumber.getName());
                                              //return false;
                                          }
                                      }
                );
            } else break;

        }

        // поиск элемента

        while (1 > 0) {
            System.out.println("Введите ФИО абонента для поиска или любой символ для выхода");
            fio = scan.nextLine();
            if ((fio.length()) > 1) {
                for (PhoneNumber phone : phoneNumbers)
                    if (fio.equals(phone.getName()){
                    System.out.println("Абонент найден " + phoneNumbers);
                }

            } else break;

        }

        // сортировка списка абонентов по фио

        phoneNumbers.sort(new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return (o1.getName().compareTo(o2.getName());
            }
        }
        );

    }

}}