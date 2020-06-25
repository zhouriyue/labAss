package com.gxuwz.lab_assistant.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gxuwz.lab_assistant.domain.Role;

@RepositoryRestResource(path="role_rest")
public interface RoleJpaRepository extends JpaRepository<Role, String>{

}
