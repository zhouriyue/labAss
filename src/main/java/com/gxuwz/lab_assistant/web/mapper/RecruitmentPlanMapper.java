package com.gxuwz.lab_assistant.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.gxuwz.lab_assistant.web.model.entity.RecruitmentPlan;
import com.gxuwz.lab_assistant.web.model.vo.RecPlanIdAndSurplusNumber;

@Service("recruitmentPlanMapper")
public interface RecruitmentPlanMapper {
	
	public void updateSurplusNumber(RecPlanIdAndSurplusNumber rPIdAndSN);
	
	public RecruitmentPlan findRPEnroll(String recPlanId);
	
	public List<RecruitmentPlan> findThrough();
	
	public void through(RecruitmentPlan recruitmentPlan);
	
	public List<RecruitmentPlan> findAllNot();
	
	public List<RecruitmentPlan> findAll();
	
	public List<RecruitmentPlan> findAllMySelf(String userId);
	
	public void add(RecruitmentPlan recruitmentPlan);

}
