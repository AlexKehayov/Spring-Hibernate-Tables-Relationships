package com.alex.library.springlibrary.jpa_repositories;

import com.alex.library.springlibrary.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
