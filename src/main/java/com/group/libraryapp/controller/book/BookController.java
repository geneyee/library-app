package com.group.libraryapp.controller.book;

import com.group.libraryapp.service.book.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    //스프링 빈이 아닌 경우 인스턴스화
    private final BookService bookService = new BookService();

    @PostMapping("/book")
    public void saveBook() {
        bookService.saveBook();
    }
}
