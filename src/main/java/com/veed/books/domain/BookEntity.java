package com.veed.books.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "books")
public class BookEntity {
    
    @Id
    private String isbn;
    
    private String author;
    
    private String title;

    public BookEntity() {
    }
}
