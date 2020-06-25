package com.gxuwz.lab_assistant.web.service;

import java.util.List;

import com.gxuwz.lab_assistant.web.model.entity.EnrollInfo;
import com.gxuwz.lab_assistant.web.model.entity.RepairApply;
import com.gxuwz.lab_assistant.web.model.vo.RecPlanAndSysUserForEnrollInfo;

public interface IEnrollInfoService {
	
	public String enroll(RecPlanAndSysUserForEnrollInfo recPlanAndSysUserForEnrollInfo);
	
	public List<EnrollInfo> findAllMySelfEnInfo(EnrollInfo enrollInfo);
	
	public String addEnrollInfo(EnrollInfo enInfoId);
	
	public String deleteEnrollInfo(String enInfoId);
	
	public String updateEnrollInfo(RepairApply repairApply);
	
}
