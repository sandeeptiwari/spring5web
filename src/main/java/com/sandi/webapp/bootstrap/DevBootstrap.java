package com.sandi.webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.sandi.webapp.model.Author;
import com.sandi.webapp.model.Book;
import com.sandi.webapp.repository.AuthorRepository;
import com.sandi.webapp.repository.BookRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}

	private void setUpData() {
		//Eric
		Author author = new Author("Eric", "Evans");
		Book add = new Book("Domain driven design", "1234", "Harper collins");
		author.getBooks().add(add);
		add.getAuthors().add(author);
		
		authorRepository.save(author);
		bookRepository.save(add);
		
		//Rod
		Author author1 = new Author("Rod", "Jhonson");
		Book add1 = new Book("J2EE development with ejb", "23444", "Wrax");
		author1.getBooks().add(add1);
		add1.getAuthors().add(author1);
		
		authorRepository.save(author1);
		bookRepository.save(add1);
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		setUpData();	
	}
}
