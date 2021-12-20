package com.pb.demidenko.hw11;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
                        System.out.println("Данные по аоненту обновлены");

                    } else {
                        System.out.println("Аонент для редактирования не найден");
                    }
                }

            } else break;

        }
    }
/*
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
                                            return  finalFio.equals(phoneNumber.getName());

                                          }
                                      }
                );

            } else break;

        }
    }

*/

        //  удаление абонента по ФИО использую лямбда выражения

    static void delAbonent(List<PhoneNumber> phoneNumbers) {
        String fio;
        Scanner scan = new Scanner(System.in);
        while (1 > 0) {
            System.out.println("Введите ФИО абонента для удаления или любой символ для выхода");
            fio = scan.nextLine();
            if ((fio.length()) > 1) {
                String finalFio = fio;
                if ( phoneNumbers.removeIf((PhoneNumber p) -> finalFio.equals(p.getName()))){
                    System.out.println("Абонент "+finalFio+" удален !!!" );
                }else System.out.println("Абонент не найден ");


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

    static void sortAbonentFio(List<PhoneNumber> phoneNumbers) {
        System.out.println("Список абонентов до сортировки: "+ phoneNumbers);
        phoneNumbers.sort((o1, o2) -> (o1.getName().compareTo(o2.getName()))
        );
        System.out.println("Список абонентов после сортировки: "+ phoneNumbers);
    }

    // сортировка списка абонентов по адресу
    public static void sortAbonentAdres(List<PhoneNumber> phoneNumbers){
        System.out.println("Список абонентов до сортировки: "+ phoneNumbers);
        System.out.println("----------------------------------------");
        System.out.println("Список абонентов после сортировки:");
        phoneNumbers.stream()
                .sorted(Comparator.comparing(PhoneNumber::getName))
                .forEach(System.out::println);



    }


    /*
    static void sortAbonentAdres(List<PhoneNumber> phoneNumbers) {
        System.out.println("Список абонентов до сортировки: "+ phoneNumbers);
        phoneNumbers.sort((o1, o2) -> (o1.getAddress().compareTo(o2.getAddress()))
        );
        System.out.println("Список абонентов после сортировки: "+ phoneNumbers);
    }
*/

    public static void showAbonent(List<PhoneNumber> phoneNumbers){
        System.out.println("Список абонентов: " + phoneNumbers);
    }



    public static void main(String[] args) throws Exception{

        List<PhoneNumber> phoneNumbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

    //сериализация в жейсон

        ObjectMapper mapper = new ObjectMapper();
    // для работы с полями типа LocalDate
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module);

    // Читаем из файла в строку
        Path path = Paths.get("phoneNumbers.txt");
        String lineStrStr ="";
        String line="";
        //Читаем из файла по строчно и формирум строку lineStrStr
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            // System.out.println(line);
            while(( line = reader.readLine()) != null) {
                lineStrStr = lineStrStr + line;
            }
        } catch (Exception ex) {
            System.out.println("Error with file read: " + ex);
        }
        System.out.println( "строка из файла" + lineStrStr);


//        List phoneNumbersFile = new ArrayList();

        if (lineStrStr.length() > 0) {
            //считать из строки в коллекцию
//            phoneNumbersFile = mapper.readValue(lineStrStr, List.class);
//           phoneNumbers =  mapper.readValue(lineStrStr , new TypeReference<List<PhoneNumber>>() {});
            phoneNumbers = (List<PhoneNumber>)mapper.readValue(lineStrStr, List.class);
            System.out.println("Обратное преобразование из файла JSON в коллекцию:" + phoneNumbers);
        }
//        phoneNumbers.addAll(phoneNumbersFile);
//        System.out.println(" после сложение колллекций" + phoneNumbers);
        System.out.println("До сортировки в оратном поря");
        System.out.println(phoneNumbers);

 //       Collections.reverse(phoneNumbers);
  //      System.out.println("После сортировки в оратном порядке"+phoneNumbers);
        boolean a = true;
        while (a) {
            System.out.println("Введите:  \n 1 для ввода абонентов " +
                    "\n 2 для удаления \n 3 для поиска абонента \n 4 для сортировки по фио  \n 5 " +
                    "для сортировки по адресу абонента  \n 6 для редактирования \n 7 для просмотра списка абонентов" +
                    "  \n 0 для выхода");

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
                    sortAbonentFio(phoneNumbers);
                    break;
                case 5:
                    sortAbonentAdres(phoneNumbers);
                    break;
                case 6:
                    editAbonent(phoneNumbers);
                    break;
                case 7:
                    showAbonent(phoneNumbers);
                    break;
                case 0:
                    a = false;
                    break;
            }
        }

        // записать в строку формата json коллекцию
        String phoneNumberJson = mapper.writeValueAsString(phoneNumbers);
        System.out.println("Коллекция в формате жсон "+phoneNumberJson);
        List<PhoneNumber> phoneNumbers1 = new ArrayList<>();
        phoneNumbers1 = (List<PhoneNumber>)mapper.readValue(phoneNumberJson, List.class);
        System.out.println("Коллекция"+phoneNumbers1);

        //записываем строку в файл


        try(FileWriter writer = new FileWriter("phoneNumbers.txt", true))
        {
            // запись всей строки
            writer.write(phoneNumberJson);
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }



    }

}

