package com.group.libraryapp.service.book;

import com.group.libraryapp.repository.book.BookMemoryRepository;
import com.group.libraryapp.repository.book.BookMysqlRepository;
import com.group.libraryapp.repository.book.BookRepository;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
public class BookService {

    //private final BookMemoryRepository bookMemoryRepository = new BookMemoryRepository();

    private final BookRepository bookRepository;

    //new를 통해 직접 어떤 repository를 쓸지 코드를 적는게 아니고 스프링컨테이너가 알아서 선택해줌 = IoC(제어의 역전)
  //컨테이너가 특정 구현체를 선택해서 넣어주는 과정을 DI(의존성 주입)
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void saveBook() {
       bookRepository.saveBook();
    }
}


