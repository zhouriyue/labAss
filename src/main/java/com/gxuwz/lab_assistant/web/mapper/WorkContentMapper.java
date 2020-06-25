package com.gxuwz.lab_assistant.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gxuwz.lab_assistant.web.model.entity.WorkContent;
import com.gxuwz.lab_assistant.web.model.vo.WorkContentAndSysUser;

@Repository
public interface WorkContentMapper {
	
	public List<WorkContent> findAll();
	
	public List<WorkContent> findAllMySelf(String userId);
	
	public void add(WorkContentAndSysUser workContentAndSysUser);
	
	public void delete(String workId);
	
	public void update(WorkContent workContent);

}
