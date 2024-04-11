package com.devbc.jpa.repositories;

import com.devbc.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
