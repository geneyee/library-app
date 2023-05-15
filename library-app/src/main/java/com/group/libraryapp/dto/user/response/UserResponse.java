package com.group.libraryapp.dto.user.response;

import com.group.libraryapp.domain.user.User;

public class UserResponse {
    private long Id;
    private String name;
    private Integer age;
/*
    public UserResponse(long id, String name, Integer age) {
        Id = id;
        this.name = name;
        this.age = age;
    }
*/

    public UserResponse(long id, String name, Integer age) {
        Id = id;
        this.name = name;
        this.age = age;
    }

    public UserResponse(long id, User user) {
        Id = id;
        this.name = user.getName();
        this.age = user.getAge();
    }

    public long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
