package com.gxuwz.lab_assistant.web.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gxuwz.lab_assistant.web.mapper.RecruitmentPlanMapper;
import com.gxuwz.lab_assistant.web.model.entity.RecruitmentPlan;
import com.gxuwz.lab_assistant.web.model.vo.RecPlanIdAndSurplusNumber;


@Service("recruitmentPlanService")
public class RecruitmentPlanServiceImp implements IRecruitmentPlanService{
	
	@Autowired
	RecruitmentPlanMapper recruitmentPlanMapper;
	
	@Override
	public List<RecruitmentPlan> findAllNot() {
		// TODO Auto-generated method stub
		return recruitmentPlanMapper.findAllNot();
	}
	
	@Override
	public List<RecruitmentPlan> findAll() {
		// TODO Auto-generated method stub
		
		return recruitmentPlanMapper.findAll();
	}
	
	@Override
	public List<RecruitmentPlan> findAllMySelf(String userId) {
		// TODO Auto-generated method stub
		return recruitmentPlanMapper.findAllMySelf(userId);
	}
	
	@Override
	public RecruitmentPlan addRecruitmentPlan(RecruitmentPlan recruitmentPlan) {
		// TODO Auto-generated method stub
		recruitmentPlan.setRecPlanId(UUID.randomUUID().toString());
		recruitmentPlan.setSurplusNumber(recruitmentPlan.getRecNumber());
		recruitmentPlan.setAudis("未通过");
		recruitmentPlanMapper.add(recruitmentPlan);
		return recruitmentPlan;
	}
	
	@Override
	public List<RecruitmentPlan> findThroughRecruitmentPlan() {
		// TODO Auto-generated method stub
		return recruitmentPlanMapper.findThrough();
	}
	
	@Override
	public String throughRecruitmentPlan(RecruitmentPlan recruitmentPlan) {
		// TODO Auto-generated method stub
		try {
			recruitmentPlanMapper.through(recruitmentPlan);
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
	}
	
	@Override
	public RecruitmentPlan findRPEnroll(String recPlanId) {
		// TODO Auto-generated method stub
		return recruitmentPlanMapper.findRPEnroll(recPlanId);
	}

	@Override
	public void updateSurplusNumber(RecPlanIdAndSurplusNumber rPIdAndSN) {
		// TODO Auto-generated method stub
		recruitmentPlanMapper.updateSurplusNumber(rPIdAndSN);
	}
	
}
