package com.gxuwz.lab_assistant.web.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gxuwz.lab_assistant.web.mapper.RepairApplyMapper;
import com.gxuwz.lab_assistant.web.model.entity.RepairApply;
import com.gxuwz.lab_assistant.web.model.vo.RepairApplyAndSysUser;

@Service
public class RepairApplyServiceImp implements IRepairApplyService{
	
	@Autowired
	RepairApplyMapper repairApplyMapper;

	@Override
	public List<RepairApply> findAllMySelf(String userId) {
		// TODO Auto-generated method stub
		return repairApplyMapper.findAllMySelf(userId);
		
	}
	
	@Override
	public String addRepairApply(RepairApplyAndSysUser repairApplyAndSysUser) {
		// TODO Auto-generated method stub
		try {
			repairApplyAndSysUser.setRepAppId(UUID.randomUUID().toString());
			repairApplyMapper.add(repairApplyAndSysUser);
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "error";
	}
	
	@Override
	public String updateRepAppIdAndUserId(String repAppId, String userId) {
		// TODO Auto-generated method stub
		try {
			repairApplyMapper.updateRepAppIdAndUserId(repAppId, userId);
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "error";
		}
	}
}
