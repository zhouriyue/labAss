package com.gxuwz.lab_assistant.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.gxuwz.lab_assistant.web.model.entity.WorkContent;

@RepositoryRestResource(path = "workContent_rest")
public interface WorkContentJpaRepository extends JpaRepository<WorkContent, String>{
	
	@RestResource(path = "userId",rel = "userId")
	List<WorkContent> findBySysUserUserId(@Param("userId") String userId);

}
