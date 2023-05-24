package com.group.libraryapp.dto.user.request;

import lombok.Getter;

@Getter
public class UserUpdateRequest {
    private long id;
    private String name;

    public UserUpdateRequest(long id, String name) {

        this.id = id;
        this.name = name;
    }
}
