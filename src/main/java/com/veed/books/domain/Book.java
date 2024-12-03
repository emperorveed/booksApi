package com.veed.books.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Book {
    private String isbn;

    private String author;

    private String title;
}
