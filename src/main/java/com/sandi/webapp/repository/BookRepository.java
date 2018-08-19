package com.sandi.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandi.webapp.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
