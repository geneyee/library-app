package com.group.libraryapp.service.user;

import com.group.libraryapp.dto.user.request.UserUpdateRequest;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserService {

    public void updateUser(JdbcTemplate jdbcTemplate, UserUpdateRequest request) {
        String readSql = "SELECT * FROM user WHERE id = ?";
        boolean isUserNotExist = jdbcTemplate.query(readSql, (rs, rowNum) -> 0, request.getId()).isEmpty();

        if (isUserNotExist) {//true면
            throw new IllegalStateException();//실행-오류 뜨는 것
        }

        String sql = "UPDATE user SET name = ? WHERE id = ?";
        jdbcTemplate.update(sql, request.getName(), request.getId());

    }
}
