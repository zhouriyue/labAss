package com.gxuwz.lab_assistant.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gxuwz.lab_assistant.web.model.entity.RepairApply;
import com.gxuwz.lab_assistant.web.model.vo.RepairApplyAndSysUser;

@Repository
public interface RepairApplyMapper {
	
	public List<RepairApply> findAllMySelf(String userId);
	
	public void add(RepairApplyAndSysUser repairApplyAndSysUser);
	
	public void delete(String repAppId);
	
	public void update(RepairApply repairApply);
	
	public void updateRepAppIdAndUserId(String repAppId,String userId);

}
