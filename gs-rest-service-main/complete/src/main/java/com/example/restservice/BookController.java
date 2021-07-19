package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/book")
    public List<Book> createBook(@RequestBody Book book) {
        List<Book> bookList = bookService.createBookList(book);
        return bookList;
    }
    @GetMapping("/fetchbook")
    public List<Book> getBook() {
        List<Book> bookList = bookService.getBookList();
        return bookList;

    }

}
