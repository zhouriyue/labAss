package com.gxuwz.lab_assistant.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gxuwz.lab_assistant.web.mapper.EmployMapper;
import com.gxuwz.lab_assistant.web.model.entity.Employ;

@Service("employService")
public class EmployServiceImp implements IEmployService{
	
	@Autowired
	EmployMapper employMapper;

	@Override
	public String employ(Employ employ) {
		// TODO Auto-generated method stub
		try {
			employMapper.employ(employ);
			employMapper.addLabAssiRole(employ.getUserId(), "labAss");
			employMapper.deleteRole(employ.getUserId(), "sysUser");
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
	}
	
	@Override
	public List<Employ> findAllMySelf(String userId) {
		// TODO Auto-generated method stub
		return employMapper.findAllMySelf(userId);
	}

}
