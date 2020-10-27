package com.thuan.spring.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thuan.spring.security.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByEmail(String email);
}
