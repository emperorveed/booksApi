package com.veed.books.services.impl;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.veed.books.domain.Book;
import com.veed.books.domain.BookEntity;
import com.veed.books.repository.BookRepository;

import static com.veed.books.TestData.testBook;
import static com.veed.books.TestData.testBookEntity;

@ExtendWith(MockitoExtension.class)
public class BookServiceImplTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookServiceImpl underTest;

    @Test
    public void testThatBookIsSaved() {
        // implementation of the test
        final Book book = testBook();
        final BookEntity bookEntity = testBookEntity();
                

        when(bookRepository.save(bookEntity)).thenReturn(bookEntity);

        final Book result = underTest.create(book);
        assertEquals(book, result);
    }
    }
    

