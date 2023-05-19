package com.group.libraryapp.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//@Repository 어노테이션 사용하지 않아도 스프링빈으로 등록됨(JpaRepository 상속으로)
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByName(String name); //select * from user where name = ?;

//    boolean existsByName(String name);

}
