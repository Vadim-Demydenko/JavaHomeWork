package com.pb.demidenko.hw5;

public class Book {

    private String bookTitle;
    private String authorBook;
    private int yearBook;

    public Book (String bookTitle, String authorBook, int yearBook){
        this.bookTitle = bookTitle;
        this.authorBook = authorBook;
        this.yearBook = yearBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

    public int getYearBook() {
        return yearBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public String getBookTitle() {
        return bookTitle;
    }
}
