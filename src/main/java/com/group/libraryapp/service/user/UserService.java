package com.group.libraryapp.service.user;

import com.group.libraryapp.dto.user.request.UserUpdateRequest;
import com.group.libraryapp.repository.user.UserRepository;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserService {

    private final UserRepository userRepository;

    public UserService(JdbcTemplate jdbcTemplate) {
        userRepository = new UserRepository(jdbcTemplate);
    }

    public void updateUser(UserUpdateRequest request) {
//      boolean isUserNotExist = userRepository.isUserNotExist(jdbcTemplate, request.getId());
        if (userRepository.isUserNotExist(request.getId())) {//true면
            throw new IllegalStateException();//실행-오류 뜨는 것
        }

        userRepository.updateUserName(request.getName(), request.getId());

    }
}
