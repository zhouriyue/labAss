package com.gxuwz.lab_assistant.web.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gxuwz.lab_assistant.web.mapper.WorkContentMapper;
import com.gxuwz.lab_assistant.web.model.entity.WorkContent;
import com.gxuwz.lab_assistant.web.model.vo.WorkContentAndSysUser;
import com.gxuwz.lab_assistant.web.util.DateFormat;

@Service("workContentService")
public class WorkContentServiceImp implements IWorkContentService{
	
	@Autowired
	WorkContentMapper workContentMapper;

	@Override
	public List<WorkContent> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WorkContent> findAllMySelf(String userId) {
		// TODO Auto-generated method stub
		return workContentMapper.findAllMySelf(userId);
	}

	@Override
	public String add(WorkContentAndSysUser workContentAndSysUser) {
		// TODO Auto-generated method stub
		try {
			workContentAndSysUser.setWorkId(UUID.randomUUID().toString());
			workContentAndSysUser.setWorkDate(DateFormat.formatDateStringYMD(workContentAndSysUser.getWorkDate()));
			workContentAndSysUser.setSystemDate(DateFormat.formatCurrentDate());
			workContentMapper.add(workContentAndSysUser);
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "error";
	}

	@Override
	public String delete(String workId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WorkContent update(WorkContent workContent) {
		// TODO Auto-generated method stub
		return null;
	}

}
