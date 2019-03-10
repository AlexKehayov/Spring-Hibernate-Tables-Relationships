package com.alex.library.springlibrary.jpa_repositories;

import com.alex.library.springlibrary.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
