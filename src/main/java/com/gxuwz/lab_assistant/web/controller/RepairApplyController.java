package com.gxuwz.lab_assistant.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gxuwz.lab_assistant.web.model.entity.RepairApply;
import com.gxuwz.lab_assistant.web.model.vo.RepairApplyAndSysUser;
import com.gxuwz.lab_assistant.web.service.IRepairApplyService;

@RestController
@RequestMapping("/repairApply")
public class RepairApplyController {
	
	@Autowired
	IRepairApplyService repairApplyService;
	
	/**
	 * 获取用户的维修申请
	 * @return
	 */
	@PostMapping("/findAllMySelf")
	public List<RepairApply> findAllMySelf(String userId){
		System.out.println(userId);
		List<RepairApply> list = repairApplyService.findAllMySelf(userId);
		return list;
	}
	
	/**
	 * 添加维修申请
	 * @param reepairApply
	 * @return
	 */
	@PostMapping("/add")
	public String add(RepairApplyAndSysUser repairApplyAndSysUser) {
		return repairApplyService.addRepairApply(repairApplyAndSysUser);
	}
	
	/**
	 * 更改维修申请的用户编号
	 * @param repAppId
	 * @param userId
	 * @return
	 */
	@PostMapping("/updateRepAppIdAndUserId")
	public String updateRepAppIdAndUserId(String repAppId,String userId) {
		System.out.println(repAppId+","+userId);
		return repairApplyService.updateRepAppIdAndUserId(repAppId, userId);
	}
	
	/**
	 * 更新维修申请
	 * @param reepairApply
	 * @return
	 */
	@PostMapping("/update")
	public RepairApply update(RepairApply reepairApply) {
		return null;
	}
	
	/**
	 * 删除维修申请
	 * @param repAppId
	 * @return
	 */
	@PostMapping("/delete")
	public String delete(String repAppId) {
		return null;
	}

}
