package com.alex.library.springlibrary.jpa_repositories;

import com.alex.library.springlibrary.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
