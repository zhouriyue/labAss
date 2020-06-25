package com.gxuwz.lab_assistant.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gxuwz.lab_assistant.domain.SysUser;

@RepositoryRestResource(path="sysUser_rest")
public interface SysUserJpaRepository extends JpaRepository<SysUser, String>{

}
