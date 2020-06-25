package com.gxuwz.lab_assistant.web.service;

import java.util.List;

import com.gxuwz.lab_assistant.web.model.entity.WorkContent;
import com.gxuwz.lab_assistant.web.model.vo.WorkContentAndSysUser;

public interface IWorkContentService {
	
	public List<WorkContent> findAll();
	
	public List<WorkContent> findAllMySelf(String userId);
	
	public String add(WorkContentAndSysUser workContentAndSysUser);
	
	public String delete(String workId);
	
	public WorkContent update(WorkContent workContent);

}
