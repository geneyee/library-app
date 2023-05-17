package com.group.libraryapp.dto.user.response;

import com.group.libraryapp.domain.user.User;

public class UserResponse {
    private long Id;
    private String name;
    private Integer age;

    public UserResponse(long id, String name, Integer age) {
        this.Id = id;
        this.name = name;
        this.age = age;
    }
    //.map(UserResponse::new)
    public UserResponse(User user){
        this.Id = user.getId();
        this.age = user.getAge();
        this.name = user.getName();
    }


    public UserResponse(long id, User user) {
        this.Id = id;
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
