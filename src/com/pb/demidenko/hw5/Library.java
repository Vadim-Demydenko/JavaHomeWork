package com.pb.demidenko.hw5;

public class Library {
    public static void main(String[] args) {

        Book[] book = new Book[3];
        Reader[] reader = new Reader[3];

        book[0] = new Book("Словарь","Петров В.В.",1980 );
        book[1] = new Book("Энциклопедия","Васечкин В.А",1980);
        book[2] = new Book("Справочник","Сидоров В.А",1999);
        reader[0] = new Reader("Кузнецов",789,"Химтех","25.08.1990","0998745557");
        reader[1] = new Reader("Васильков",125,"Физтех","28.03.1990","0978956321");
        reader[2] = new Reader("Синичкика",787,"Физмат","5.09.1998","09987447827");

        System.out.println("Книги в наличии в библиотеке: ");
        for (Book books : book){
            System.out.println( "Автор " + books.getAuthorBook()+ " " + books.getBookTitle()+" " + books.getYearBook());

        }

        System.out.println("Читатели библиотеки:");
        for (Reader readers : reader){
            System.out.println("Фамилия " + readers.getNameReader() + " факультет " +
                    readers.getFakultetReader() +  " телефон " + readers.getNumberPhone() +
                    " дата рождения " + readers.getDateBirth());
        }

        reader[0].takeBook(4);
        reader[1].takeBook(9);
        reader[2].takeBook(2);
        reader[0].takeBook("Детективы","Приключения");
        reader[1].takeBook("Детективы 2 том","Приключения 3 том","Справочник");
        reader[2].takeBook("Детективы 3 том");
        reader[0].takeBook(book[0]);
        reader[1].takeBook(book[1],book[2]);

        reader[0].returnBook(4);
        reader[1].returnBook(9);
        reader[2].returnBook(2);
        reader[0].returnBook("Детективы","Приключения");
        reader[1].returnBook("Детективы 2 том","Приключения 3 том","Справочник");
        reader[2].returnBook("Детективы 3 том");
        reader[0].returnBook(book[0]);
        reader[1].returnBook(book[1],book[2]);






    }
}
