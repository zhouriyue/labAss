package com.gxuwz.lab_assistant.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.gxuwz.lab_assistant.domain.RoleMenu;

@RepositoryRestResource(path="roleMenu_rest")
public interface RoleMenuJpaRepository  extends JpaRepository<RoleMenu, Integer>{

	@RestResource(path="roleId",rel = "roleId")
	List<RoleMenu> findByRoleIdEquals(@Param("roleId") String roleId);
}
