package com.sandi.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandi.webapp.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{

}
