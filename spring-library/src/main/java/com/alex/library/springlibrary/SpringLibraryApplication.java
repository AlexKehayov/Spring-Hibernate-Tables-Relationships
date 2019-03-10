package com.alex.library.springlibrary;

import com.alex.library.springlibrary.entities.Book;
import com.alex.library.springlibrary.jpa_repositories.AuthorRepository;
import com.alex.library.springlibrary.jpa_repositories.BookRepository;
import com.alex.library.springlibrary.jpa_repositories.PublisherRepository;
import com.alex.library.springlibrary.jpa_repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLibraryApplication implements CommandLineRunner {

	@Autowired
	AuthorRepository authorRepository;

	@Autowired
	BookRepository bookRepository;

	@Autowired
	PublisherRepository publisherRepository;

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringLibraryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//fix mapping in relationships
		//fix console
		//fix h2, mysql
		//fill data
		//test data

		Book book1 = new Book("az", true, null, null, null);
		bookRepository.save(book1);
		bookRepository.findAll();
	}
}
