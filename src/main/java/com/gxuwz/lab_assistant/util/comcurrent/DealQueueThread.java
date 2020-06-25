package com.gxuwz.lab_assistant.util.comcurrent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import com.gxuwz.lab_assistant.web.model.entity.RecruitmentPlan;
import com.gxuwz.lab_assistant.web.model.vo.RecPlanAndSysUserForEnrollInfo;
import com.gxuwz.lab_assistant.web.model.vo.RecPlanIdAndSurplusNumber;
import com.gxuwz.lab_assistant.web.service.IEnrollInfoService;
import com.gxuwz.lab_assistant.web.service.IRecruitmentPlanService;

public class DealQueueThread implements Runnable{
	
	IEnrollInfoService enrollInfoService;
	IRecruitmentPlanService recruitmentPlanService;
	EnrollQueue<RecPlanAndSysUserForEnrollInfo> enrollQueue;
	RecPlanIdAndSurplusNumber rpIdAndSN;
	RedisTemplate redisTemplate;
	public static boolean execute = false;
	
	public DealQueueThread(EnrollQueue<RecPlanAndSysUserForEnrollInfo> enrollQueue) {
		this.enrollQueue = enrollQueue;
	}
	
	public DealQueueThread(EnrollQueue<RecPlanAndSysUserForEnrollInfo> enrollQueue,IEnrollInfoService enrollInfoService,
			IRecruitmentPlanService recruitmentPlanService,RecPlanIdAndSurplusNumber rpIdAndSN,RedisTemplate redisTemplate) {
		this.enrollQueue = enrollQueue;
		this.enrollInfoService = enrollInfoService;
		this.rpIdAndSN = rpIdAndSN;
		this.redisTemplate = redisTemplate;
		this.recruitmentPlanService = recruitmentPlanService;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		execute = true;
		try {
			while(enrollQueue.queue.size()>0&&enrollQueue!=null) {
				RecPlanAndSysUserForEnrollInfo enrollInfo = enrollQueue.queue.take();
				synchronized (this) {
					this.enroll(enrollInfo);
					ValueOperations ops = redisTemplate.opsForValue();
					RecPlanIdAndSurplusNumber r = (RecPlanIdAndSurplusNumber)ops.get("rpIdAndSN");
					int currentCount = r.getSurplusNumber().intValue()-1;
					r.setSurplusNumber(currentCount);
					ops.set("rpIdAndSN", r);
					if(r.getSurplusNumber()==0) {
						recruitmentPlanService.updateSurplusNumber(rpIdAndSN);
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			execute = false;
		}
	}
	
	public synchronized void enroll(RecPlanAndSysUserForEnrollInfo enrollInfo) {
		if(enrollInfo!=null) {
			enrollInfoService.enroll(enrollInfo);
		}
	}
	
	public void putEnrollInfo(RecPlanAndSysUserForEnrollInfo enrollInfo) throws InterruptedException {
		enrollQueue.put(enrollInfo);
	}

	public EnrollQueue<RecPlanAndSysUserForEnrollInfo> getEnrollQueue() {
		return enrollQueue;
	}

	public void setEnrollQueue(EnrollQueue<RecPlanAndSysUserForEnrollInfo> enrollQueue) {
		this.enrollQueue = enrollQueue;
	}

	public RecPlanIdAndSurplusNumber getRpIdAndSN() {
		return rpIdAndSN;
	}

	public void setRpIdAndSN(RecPlanIdAndSurplusNumber rpIdAndSN) {
		this.rpIdAndSN = rpIdAndSN;
	}
	
}
