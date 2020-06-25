package com.gxuwz.lab_assistant.web.service;

import java.util.List;

import com.gxuwz.lab_assistant.web.model.entity.RecruitmentPlan;
import com.gxuwz.lab_assistant.web.model.vo.RecPlanIdAndSurplusNumber;

public interface IRecruitmentPlanService {
	
	void updateSurplusNumber(RecPlanIdAndSurplusNumber rPIdAndSN);
	
	RecruitmentPlan findRPEnroll(String recPlanId);
	
	List<RecruitmentPlan> findAll();
	
	List<RecruitmentPlan> findAllNot();
	
	List<RecruitmentPlan> findAllMySelf(String userId);
	
	RecruitmentPlan addRecruitmentPlan(RecruitmentPlan recruitmentPlan);
	
	List<RecruitmentPlan> findThroughRecruitmentPlan();
	
	String throughRecruitmentPlan(RecruitmentPlan recruitmentPlan);

}
