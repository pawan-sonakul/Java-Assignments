package com.book.BookManagement.service;

import com.book.BookManagement.entity.Book;

import java.util.List;

public interface BookService {

    Book create(Book book);

    Book getBookById(Long id);

    List<Book> getAllBooks();

    Book update(Long id, Book book);

    String delete(Long id);
}
