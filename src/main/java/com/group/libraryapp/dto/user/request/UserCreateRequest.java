package com.group.libraryapp.dto.user.request;

import lombok.Getter;

@Getter
public class UserCreateRequest {

    private String name;
    private Integer age;//Integer null 가능 //int null 불가능

}
