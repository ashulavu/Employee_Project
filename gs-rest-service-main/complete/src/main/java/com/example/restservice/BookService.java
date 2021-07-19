package com.example.restservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    List<Book> bookList = new ArrayList<>();
    List<Book> bookList1 = new ArrayList<>();
    public List<Book> getBookList() {
        bookList1.clear();
        for(Book b: bookList){
            if(b.getCost()<=100){
                bookList1.add(b);
            }
        }
        return bookList1;
    }
    public List<Book> createBookList(Book book){
        bookList.add(book);
        return bookList;

    }
}

