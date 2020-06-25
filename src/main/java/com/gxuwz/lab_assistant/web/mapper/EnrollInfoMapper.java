package com.gxuwz.lab_assistant.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gxuwz.lab_assistant.web.model.entity.EnrollInfo;
import com.gxuwz.lab_assistant.web.model.entity.RepairApply;
import com.gxuwz.lab_assistant.web.model.vo.RecPlanAndSysUserForEnrollInfo;

@Repository("enrollInfoMapper")
public interface EnrollInfoMapper {
	
    public void enroll(RecPlanAndSysUserForEnrollInfo recPlanAndSysUserForEnrollInfo);
	
	public List<EnrollInfo> findAllMySelfEnInfo(EnrollInfo enrollInfo);
	
	public void addEnrollInfo(EnrollInfo enInfoId);
	
	public void deleteEnrollInfo(String enInfoId);
	
	public void updateEnrollInfo(RepairApply repairApply);

}
