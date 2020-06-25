package com.gxuwz.lab_assistant.web.service;

import java.util.List;

import com.gxuwz.lab_assistant.web.model.entity.RepairApply;
import com.gxuwz.lab_assistant.web.model.vo.RepairApplyAndSysUser;

public interface IRepairApplyService {
	
	public List<RepairApply> findAllMySelf(String userId);
	
	public String addRepairApply(RepairApplyAndSysUser repairApplyAndSysUser);
	
	public String updateRepAppIdAndUserId(String repAppId,String userId);

}
