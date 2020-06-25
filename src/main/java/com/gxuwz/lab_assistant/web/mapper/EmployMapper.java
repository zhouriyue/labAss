package com.gxuwz.lab_assistant.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gxuwz.lab_assistant.web.model.entity.Employ;

@Repository("employMapper")
public interface EmployMapper {
	
	public void employ(Employ employ);
	
	public void deleteRole(String userId,String roleId);
	
	public void addLabAssiRole(String userId,String roleId);
	
	public List<Employ> findAllMySelf(String userId);

}
