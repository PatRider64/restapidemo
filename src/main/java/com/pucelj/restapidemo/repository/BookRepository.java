package com.pucelj.restapidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pucelj.restapidemo.dto.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
