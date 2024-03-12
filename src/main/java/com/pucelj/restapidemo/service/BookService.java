package com.pucelj.restapidemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pucelj.restapidemo.dto.Book;
import com.pucelj.restapidemo.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @SuppressWarnings("null")
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @SuppressWarnings("null")
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    @SuppressWarnings("null")
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}
