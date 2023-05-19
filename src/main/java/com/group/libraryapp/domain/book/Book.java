package com.group.libraryapp.domain.book;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    @Column(nullable = false)
    private String name;

    protected Book() {
    }

    public Book(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다.", name));
        }
        this.name = name;
    }
/*
    public Book(Long id, String name) { //id는 자동생성 되니까 딱히 생성자 만들지 않아도..?
        this.id = id;
        this.name = name;
    }
 */
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
