package com.pucelj.restapidemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pucelj.restapidemo.dto.Book;
import com.pucelj.restapidemo.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("")
    public Book create(@RequestBody Book book) {
        return bookService.save(book);
    }

    @GetMapping("")
    public List<Book> findAll() {
        return bookService.findAll();
    }
}
