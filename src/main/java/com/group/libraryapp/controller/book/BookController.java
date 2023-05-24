package com.group.libraryapp.controller.book;

import com.group.libraryapp.dto.book.request.BookCreateRequest;
import com.group.libraryapp.dto.book.request.BookLoanRequest;
import com.group.libraryapp.dto.book.request.BookReturnRequest;
import com.group.libraryapp.service.book.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    //스프링 빈이 아닌 경우 인스턴스화
    private final BookService bookService;

    //Service 스프링빈 등록 시킨후(@Service) 생성자로 주입

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    //책 저장
    @PostMapping("/book")
    public void saveBook(@RequestBody BookCreateRequest request) {
        bookService.saveBook(request);
    }

    //책 대출
    @PostMapping("/book/loan")
    public void loanBook(@RequestBody BookLoanRequest request) {
        bookService.loanBook(request);
    }

    //책 반납
    @PutMapping("/book/return")
    public void returnBook(@RequestBody BookReturnRequest request) {
        bookService.returnBook(request);
    }
}
