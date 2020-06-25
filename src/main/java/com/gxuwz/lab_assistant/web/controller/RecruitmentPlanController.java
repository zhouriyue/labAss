package com.gxuwz.lab_assistant.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gxuwz.lab_assistant.domain.SysUser;
import com.gxuwz.lab_assistant.web.model.entity.EnrollInfo;
import com.gxuwz.lab_assistant.web.model.entity.RecruitmentPlan;
import com.gxuwz.lab_assistant.web.model.vo.RecPlanIdAndSurplusNumber;
import com.gxuwz.lab_assistant.web.service.IRecruitmentPlanService;

@RestController
@RequestMapping("/recruitmentPlan")
public class RecruitmentPlanController {
	
	@Autowired
	IRecruitmentPlanService recruitmentPlanService;
	
	@Autowired
	RedisTemplate redisTemplate;
	
	/**
	 * 获取某招聘信息的报名人员
	 * @param recPlanId
	 * @return
	 */
	@PostMapping("/findRPEnroll")
	public RecruitmentPlan findRPEnroll(String recPlanId){
		RecruitmentPlan rp = recruitmentPlanService.findRPEnroll(recPlanId);
		return rp;
	}
	
	@PostMapping("/findAllNot")
	public List<RecruitmentPlan> findAllNot(){
		List<RecruitmentPlan> rpList = recruitmentPlanService.findAllNot();
		return rpList;
	}
	
	@PostMapping("/findAll")
	public List<RecruitmentPlan> findAll(){
		List<RecruitmentPlan> rpList = recruitmentPlanService.findAll();
		return rpList;
	}
	
	/**
	 * 查询某用户的招聘计划
	 * @param re
	 * @return
	 */
	@PostMapping("/findMySelf")
	public List<RecruitmentPlan> findMySelf(String userId){
		List<RecruitmentPlan> rpList = recruitmentPlanService.findAllMySelf(userId);
		return rpList;
	}
	
	/**
	 * 查询通过的招聘计划
	 * @param re
	 * @return
	 */
	@PostMapping("/findThrough")
	public List<RecruitmentPlan> findThrough(){
		List<RecruitmentPlan> recruitmentPlanList = recruitmentPlanService.findThroughRecruitmentPlan();
		return recruitmentPlanList;
	}
	
	/**
	 * 添加招聘计划
	 * @param re
	 * @return
	 */
	@PostMapping("/add")
	public RecruitmentPlan add(RecruitmentPlan re){
		SysUser sysUser = new SysUser();
		sysUser.setUserId(re.getRecPlanId());
		re.setSysUser(sysUser);
		System.out.println(re.toString());
		re = recruitmentPlanService.addRecruitmentPlan(re);
		ValueOperations ops1 = redisTemplate.opsForValue();
		RecPlanIdAndSurplusNumber rpIdAndSN = new RecPlanIdAndSurplusNumber();
		rpIdAndSN.setRecPlanId(re.getRecPlanId());
		rpIdAndSN.setSurplusNumber(re.getSurplusNumber());
		ops1.set(rpIdAndSN.getRecPlanId(), rpIdAndSN);
		return re;
	}
	
	/**
	 * 审核招聘计划
	 * @param re
	 * @return
	 */
	@PostMapping("/through")
	public String through(RecruitmentPlan re){
		System.out.println(re.toString());
		recruitmentPlanService.throughRecruitmentPlan(re);
		return "success";
	}
	
	/**
	 * 获取招聘计划的报名信息
	 * @param recPlanId
	 * @return
	 */
	@PostMapping("/findEnrInfo")
	public List<EnrollInfo> findEnrInfo(String recPlanId){
		return null;
	}
	
	/**
	 * 删除招聘计划
	 * @param recPlanId
	 * @return
	 */
	@PostMapping("/delete")
	public String delete(String recPlanId) {
		return null;
	}
	
	/**
	 * 更新招聘计划
	 * @param recruitmentPlan
	 * @return
	 */
	@PostMapping("/update")
	public RecruitmentPlan update(RecruitmentPlan recruitmentPlan) {
		return null;
	}

}
