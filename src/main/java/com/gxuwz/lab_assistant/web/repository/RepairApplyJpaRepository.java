package com.gxuwz.lab_assistant.web.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.gxuwz.lab_assistant.web.model.entity.RepairApply;

@RepositoryRestResource(path = "repApply_rest")
public interface RepairApplyJpaRepository extends JpaRepository<RepairApply, String>{
	
	@RestResource(path = "userId",rel = "userId")
	List<RepairApply> findByUserUserId(@Param("userId") String userId);
	
}
