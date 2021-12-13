package com.pb.demidenko.hw11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class TestPhoneNumber {

    // Добавление элемента
    static PhoneNumber addAbonent() {

        String fio = "123";
        String number = "123";
        String address;
        String dateOfBerth;
        LocalDate timeEdit;
        List<String> numberPh = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите ФИО ");
        fio = scan.nextLine();
        while ((number.length()) > 1) {
            System.out.println("Введите номер телефона абонента или любую цифру для перехода далее");
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
//        phoneNumbers.add(phoneNumber); //
//        System.out.println(phoneNumbers);
        return phoneNumber;


    }

    //редактирование элемента
    static void editAbonent(List<PhoneNumber> phoneNumbers) {
        PhoneNumber phone;
        int addressInsert;
        String fio = "123";
        Scanner scan = new Scanner(System.in);
        while (1 > 0) {
            System.out.println("Введите ФИО абонента для редактирования или любой символ для выхода");
            fio = scan.nextLine();

            if ((fio.length()) > 1) {
                for (int i = 0; phoneNumbers.size() > i; i++) {
                    phone = phoneNumbers.get(i);
                    if (phone.getName().equals(fio)) {
                        System.out.println("Абонент найден " + phoneNumbers.get(i));
                        //запомнили позицию вставки отредактированного эл-та
                        System.out.println("Введите данные дляредактирования");

                        //обновить элемент  по индексу
                        phoneNumbers.set(i, addAbonent());
                        System.out.println("Данные по аоненту оновлены");

                    } else {
                        System.out.println("Аонент для редактирования не найден");
                    }
                }

            } else break;

        }
    }

    //  удаление абонента по ФИО

    static void delAbonent(List<PhoneNumber> phoneNumbers) {
        String fio;
        Scanner scan = new Scanner(System.in);
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
    }

    // поиск элемента
    static void findAbonent(List<PhoneNumber> phoneNumbers) {
        String fio;
        Scanner scan = new Scanner(System.in);
        while (1 > 0) {
            System.out.println("Введите ФИО абонента для поиска или любой символ для выхода");
            fio = scan.nextLine();
            if ((fio.length()) > 1) {
                for (PhoneNumber phone : phoneNumbers) {
                    if (fio.equals(phone.getName())) {
                        System.out.println("Абонент найден " +  phone);
                    }
                }

            } else break;

        }
    }
    // сортировка списка абонентов по фио

    static void sortAbonent(List<PhoneNumber> phoneNumbers) {
        System.out.println("Список абонентов до сортировки: "+ phoneNumbers);
        phoneNumbers.sort(new Comparator<PhoneNumber>() {
                              @Override
                              public int compare(PhoneNumber o1, PhoneNumber o2) {
                                  return (o1.getName().compareTo(o2.getName()));
                              }
                          }
        );
        System.out.println("Список абонентов после сортировки: "+ phoneNumbers);
    }



    public static void main(String[] args) {

        List<PhoneNumber> phoneNumbers = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        boolean a = true;
        while (a) {
            System.out.println("Введите:  \n 1 для ввода абонентов " +
                    "\n 2 для удаления \n 3 для поиска абонента \n 4 для сортировки \n 5 для редактирования \n 0 для выхода");

            int i = 0;
            i = scan.nextInt();
            switch (i) {
                case 1:
                    phoneNumbers.add(addAbonent());
                    System.out.println(phoneNumbers);
                    break;
                case 2:
                    delAbonent(phoneNumbers);
                    break;
                case 3:
                    findAbonent(phoneNumbers);
                    break;
                case 4:
                    sortAbonent(phoneNumbers);
                    break;
                case 5:
                    editAbonent(phoneNumbers);
                    break;
                case 0:
                    a = false;
                    break;
            }
        }
    }

}

