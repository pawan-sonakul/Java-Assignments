package com.book.BookManagement.service.impl;

import com.book.BookManagement.entity.Book;
import com.book.BookManagement.exception.BookNotFoundException;
import com.book.BookManagement.repository.BookRepository;
import com.book.BookManagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book create(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> {
            throw new BookNotFoundException("Book not found with id " + id);
        });
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book update(Long id, Book updatedBook) {
        Book existingBook = getBookById(id);

        existingBook.setAuthor(updatedBook.getAuthor());
        existingBook.setTitle(updatedBook.getTitle());
        existingBook.setPrice(updatedBook.getPrice());

        return bookRepository.save(existingBook);
    }


    @Override
    public String delete(Long id) {
        getBookById(id);
        bookRepository.deleteById(id);
        return "Book Deleted Successfully";
    }
}
