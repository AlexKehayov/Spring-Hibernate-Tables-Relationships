package com.alex.library.springlibrary.jpa_repositories;

import com.alex.library.springlibrary.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Integer> {
}
