package com.thuan.spring.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thuan.spring.security.domain.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByName(String name);
}
