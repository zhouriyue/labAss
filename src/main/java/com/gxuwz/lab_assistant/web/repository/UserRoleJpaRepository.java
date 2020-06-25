package com.gxuwz.lab_assistant.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.gxuwz.lab_assistant.domain.UserRole;

@RepositoryRestResource(path="userRole_rest")
public interface UserRoleJpaRepository extends JpaRepository<UserRole, Integer>{
	
	@RestResource(path = "userId",rel = "userId")
	public UserRole findByUserIdEquals(@Param("userId") String userId);

}
