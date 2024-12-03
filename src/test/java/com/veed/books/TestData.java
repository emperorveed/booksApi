package com.veed.books;

import com.veed.books.domain.Book;
import com.veed.books.domain.BookEntity;

public final class TestData {

    private TestData() {
    }

    public static Book testBook() {
        return Book.builder()
            .isbn("01236733")
            .author("John Ted")
            .title("The Mysterious Man")
            .build();
    }

    public static BookEntity testBookEntity() {
        return BookEntity.builder()
                .isbn("01236733")
                .author("John Ted")
                .title("The Mysterious Man")
                .build();
    }

}
