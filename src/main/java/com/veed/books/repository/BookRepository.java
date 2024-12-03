package com.veed.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.veed.books.domain.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, String> {
    
}
