package com.gxuwz.lab_assistant.web.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gxuwz.lab_assistant.util.comcurrent.DealQueueThread;
import com.gxuwz.lab_assistant.util.comcurrent.EnrollQueue;
import com.gxuwz.lab_assistant.web.model.entity.EnrollInfo;
import com.gxuwz.lab_assistant.web.model.entity.RecruitmentPlan;
import com.gxuwz.lab_assistant.web.model.entity.RepairApply;
import com.gxuwz.lab_assistant.web.model.vo.RecPlanAndSysUserForEnrollInfo;
import com.gxuwz.lab_assistant.web.model.vo.RecPlanIdAndSurplusNumber;
import com.gxuwz.lab_assistant.web.service.EnrollInfoServiceImp;
import com.gxuwz.lab_assistant.web.service.IEnrollInfoService;
import com.gxuwz.lab_assistant.web.service.IRecruitmentPlanService;

@RestController
@RequestMapping("/enrollInfo")
public class EnrollInfoController {
	
	@Autowired
	IRecruitmentPlanService recruitmentPlanService;
	
	@Autowired
	IEnrollInfoService enrollInfoService;
	
	@Autowired
	RedisTemplate redisTemplate;
	
	@Autowired
	static EnrollQueue<RecPlanAndSysUserForEnrollInfo> queue;
	static ThreadPoolExecutor pool = new ThreadPoolExecutor(
			1, 2, 5, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>());
	
	/**
	 * 报名
	 * @param enrollInfo
	 * @return
	 * @throws InterruptedException 
	 */
	@PostMapping("/enroll")
	public Map<String,Object> enroll(RecPlanAndSysUserForEnrollInfo recPlanAndSysUserForEnrollInfo) throws InterruptedException {
		Map<String,Object> result = new HashMap<String, Object>();
		ValueOperations ops1 = redisTemplate.opsForValue();
		int staus = 0;
		synchronized (this) {
			RecPlanIdAndSurplusNumber rpIdAndSN = (RecPlanIdAndSurplusNumber)ops1.get("rpIdAndSN");
			System.out.println(rpIdAndSN.getSurplusNumber());
			//判断是否还余额
			if(rpIdAndSN.getSurplusNumber() > 0){
				//如果为空就初始化
				if(queue==null){
					queue = new EnrollQueue<RecPlanAndSysUserForEnrollInfo>(rpIdAndSN.getSurplusNumber());
				} 
				//获取当前的余额
				//判断是否大于0
				if(queue.getQueue().remainingCapacity()>0) {
					queue.put(recPlanAndSysUserForEnrollInfo);
					result.put("status", "报名成功");
				} else {
					result.put("status", "抢购队列已满,请稍候重试!");
				}
			} else {
				result.put("status", "名额已满!");
			}
		}
		if(!DealQueueThread.execute) {
			DealQueueThread dealQueueThread = new DealQueueThread(queue);
			pool.execute(dealQueueThread);
		}
		return result;
	}
	
	/**
	 * 获取用户的报名信息
	 * @return
	 */
	@PostMapping("/findAllMySelf")
	public String findAllMySelf(EnrollInfo enrollInfo) {
		return null;
	}
	
	/**
	 * 添加报名信息
	 * @param enrollInfo
	 * @return
	 */
	@PostMapping("/add")
	public String add(EnrollInfo enInfoId) {
		return null;
	}
	
	/**
	 * 删除报名信息
	 * @param enInfoId
	 * @return
	 */
	@PostMapping("/delete")
	public String delete(String enInfoId) {
		return null;
	}
	
	/**
	 * 更新维修申请
	 * @param repairApply
	 * @return
	 */
	@PostMapping("/update")
	public String update(RepairApply repairApply) {
		return null;
	}

}
