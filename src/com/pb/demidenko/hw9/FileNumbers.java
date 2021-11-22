package com.pb.demidenko.hw9;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public   class FileNumbers {

    private  static final Logger  LOGGER = Logger.getLogger(FileNumbers.class.getName());

    public   void createNumbersFile() {

        LOGGER.setLevel(Level.ALL);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        LOGGER.addHandler(consoleHandler);
        LOGGER.entering(getClass().getName(),"createOddNumbersFile");
        String arrayDigit = "";


//      Формируем строку по 10 чисел от 0 - 99 в строке из 10 строк
        for (int k = 0; k < 10; k++) {
            for (int i = 0; i < 10; i++) {
                arrayDigit = arrayDigit + (int) ((Math.random()) * 100) + " ";
            }
            arrayDigit = arrayDigit + "\n"; //добавили перевод строки
        }
        System.out.println(arrayDigit);


        Path path = Paths.get("numbers.txt");

       // Записали строку в файл
       try (BufferedWriter writer = Files.newBufferedWriter(path)) {
           writer.write(arrayDigit);
       } catch (Exception ex) {
           System.out.println("Ошибка при записи в файл: " + ex);
           LOGGER.log(Level.SEVERE,"Ошибка при записи в файл: ",ex);
       }
       System.out.println("Запись в файл \"" + path.toAbsolutePath() + "\" успешна!");
       LOGGER.exiting(getClass().getName(),"createNumbersFile");
   }



    public static void createOddNumbersFile(){

        Path path = Paths.get("numbers.txt");
        String lineStrStr ="";
        String line;
        //Читаем из файла по строчно и формирум строку lineStrStr
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            // System.out.println(line);
            while(( line = reader.readLine()) != null) {
                  lineStrStr = lineStrStr + line;
            }
        } catch (Exception ex) {
            System.out.println("Error with file read: " + ex);
        }

// Читаем строку по меткам пробел между числами и преоразуем в число для проверки
// на четность
        String rezultStr = "", str;
        int i = 0, k = 0;
        Scanner scan = new Scanner(lineStrStr);
        scan.useDelimiter(" ");
        while (scan.hasNext()){
             str = scan.next();
//            System.out.println(str);
            try{
                i = Integer.parseInt(str);
            }catch (NumberFormatException nfe)
            {
                System.out.println("NumberFormatException: " + nfe.getMessage());
            }
            if (i % 2 == 0) {// четные меняем на 0
                i = 0;
            }
            k++; //счетчик считанных чисел
            rezultStr = rezultStr + i +" "; //формируем результат строку

            if (k % 10 == 0) rezultStr = rezultStr + '\n'; // после каждого 10 добавили перевод строки

        }

        System.out.println("после замены \n " + rezultStr);
        Path path1 = Paths.get("odd-numbers.txt");

        // Записали строку в файл
        try (BufferedWriter writer = Files.newBufferedWriter(path1)) {
            writer.write(rezultStr);
        } catch (Exception ex) {
            System.out.println("Ошибка при записи в файл: " + ex);
        }
        System.out.println("Запись в файл \"" + path1.toAbsolutePath() + "\" успешна!");

    }

   public static void main(String[] args) {
       FileNumbers fileNumbers = new FileNumbers();
           fileNumbers.createNumbersFile();
       fileNumbers.createOddNumbersFile();
    }
}
