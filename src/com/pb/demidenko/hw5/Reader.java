package com.pb.demidenko.hw5;
import java.util.*;

public class Reader {

    private String nameReader;
    private int numberReader;
    private String fakultetReader;
    private String dateBirth;
    private String numberPhone;

    public String getNameReader() {
        return nameReader;
    }

    public int getNumberReader() {
        return numberReader;
    }

    public String getFakultetReader() {
        return fakultetReader;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public Reader(String nameReader, int numberReader, String fakultetReader,
                  String dateBirth, String numberPhone) {
        this.nameReader = nameReader;
        this.numberReader = numberReader;
        this.fakultetReader = fakultetReader;
        this.dateBirth = dateBirth;
        this.numberPhone = numberPhone;

    }



    public void takeBook(int countBook) {
        System.out.println(this.nameReader + " взял " + countBook + " книг");
    }

    public void takeBook(String... titleBooks) {
        System.out.println(this.nameReader + " взял книги: ");
        for (String title : titleBooks) {
            System.out.println(title);
        }
    }


    public void takeBook(Book... readBooks) {
        System.out.println(this.nameReader + " взял книги: ");
        for (Book book : readBooks) {
            System.out.println(book.getBookTitle());
        }

    }

    public void returnBook(int countBook){
        System.out.println(this.nameReader + " вернул " + countBook + " книг ");

    }

    public void returnBook(String ... titleBooks){
        System.out.println(this.nameReader + " вернул книги: ");
        for (String title : titleBooks) {
            System.out.println(title);
        }
    }

    public void returnBook(Book... readBooks) {
        System.out.println(this.nameReader + " вернул книги: ");
        for (Book book : readBooks) {
            System.out.println(book.getBookTitle());
        }

    }
}