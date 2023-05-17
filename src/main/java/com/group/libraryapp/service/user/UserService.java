package com.group.libraryapp.service.user;

import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.request.UserUpdateRequest;
import com.group.libraryapp.dto.user.response.UserResponse;
import com.group.libraryapp.repository.user.UserRepository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserService {

    private final UserRepository userRepository;

    public UserService(JdbcTemplate jdbcTemplate) {
        userRepository = new UserRepository(jdbcTemplate);
    }

    //생성
    public void saveUser(UserCreateRequest request){
        userRepository.saveUser(request.getName(), request.getAge());
    }

    //조회
    public List<UserResponse> getUsers() {
        return userRepository.getUsers();
    }

    //수정
    public void updateUser(UserUpdateRequest request) {
//      boolean isUserNotExist = userRepository.isUserNotExist(jdbcTemplate, request.getId());
        if (userRepository.isUserNotExist(request.getId())) {//true면
            throw new IllegalStateException();//실행-오류 뜨는 것
        }

        userRepository.updateUserName(request.getName(), request.getId());

    }

    //삭제
    public void deleteUser(String name) {

        if (userRepository.isUserNotExist(name)) {
            throw new IllegalStateException();
        }

        userRepository.deleteUser(name);
    }
}
