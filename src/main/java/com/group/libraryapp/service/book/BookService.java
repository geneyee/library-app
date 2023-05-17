package com.group.libraryapp.service.book;

import com.group.libraryapp.repository.book.BookMemoryRepository;
import com.group.libraryapp.repository.book.BookMysqlRepository;
import com.group.libraryapp.repository.book.BookRepository;

import java.awt.print.Book;

public class BookService {

    //private final BookMemoryRepository bookMemoryRepository = new BookMemoryRepository();

    private final BookRepository bookRepository = new BookMysqlRepository();

    public void saveBook() {
       bookRepository.saveBook();
    }
}


