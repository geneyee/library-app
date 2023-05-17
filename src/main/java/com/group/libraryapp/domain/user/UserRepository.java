package com.group.libraryapp.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

//@Repository 어노테이션 사용하지 않아도 스프링빈으로 등록됨(JpaRepository 상속으로)
public interface UserRepository extends JpaRepository<User,Long> {
}
