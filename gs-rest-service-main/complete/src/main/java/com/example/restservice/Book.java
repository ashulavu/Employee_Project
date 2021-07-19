package com.example.restservice;

public class Book {

    private String bookname;
    private String author;
    private  int cost;
    private String language;

    public Book(String bookname, String author, int cost, String language) {
        this.bookname = bookname;
        this.author = author;
        this.cost = cost;
        this.language = language;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", cost=" + cost +
                ", language='" + language + '\'' +
                '}';
    }
}
