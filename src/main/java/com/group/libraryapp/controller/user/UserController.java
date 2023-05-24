package com.group.libraryapp.controller.user;

import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.request.UserUpdateRequest;
import com.group.libraryapp.dto.user.response.UserResponse;
import com.group.libraryapp.service.user.UserServiceV1;
import com.group.libraryapp.service.user.UserServiceV2;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserServiceV2 userService;

/*
    public UserController(UserServiceV2 userService) {
        this.userService = userService;
    }
*/

    //생성(저장)
    @PostMapping("/user")
    public void saveUser(@RequestBody UserCreateRequest request) {
        userService.saveUser(request);
    }

    //조회
    @GetMapping("/user")
    public List<UserResponse> getUsers() {
        return userService.getUsers();
    }

    //수정
    @PutMapping("/user")
    public void updateUser(@RequestBody UserUpdateRequest request) {
        userService.updateUser(request);
   }

   //삭제
   @DeleteMapping("/user")
    public void deleteUser(@RequestParam String name) {
        userService.deleteUser(name);
    }
}
