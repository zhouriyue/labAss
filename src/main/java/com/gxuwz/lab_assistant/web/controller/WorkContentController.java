package com.gxuwz.lab_assistant.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gxuwz.lab_assistant.web.model.entity.WorkContent;
import com.gxuwz.lab_assistant.web.model.vo.WorkContentAndSysUser;
import com.gxuwz.lab_assistant.web.service.IWorkContentService;

@RestController
@RequestMapping("/workContent")
public class WorkContentController {
	
	@Autowired
	IWorkContentService workContentService;
	
	/**
	 * 获取全部的工作内容
	 * @return
	 */
	@PostMapping("/findAll")
	public List<WorkContent> findAll() {
		return null;
	}
	
	/**
	 * 获取用户的工作内容
	 * @param userId
	 * @return
	 */
	@PostMapping("/findAllMySelf")
	public List<WorkContent> findAllMySelf(String userId){
		System.out.println(userId);
		List<WorkContent> list = workContentService.findAllMySelf(userId);
		System.out.println(list.size());
		return list;
	}
	
	/**
	 * 添加用户的工作内容
	 * @param workContent
	 * @return
	 */
	@PostMapping("/add")
	public String add(WorkContentAndSysUser workContentAndSysUser) {
		System.out.println(workContentAndSysUser.toString());
		return workContentService.add(workContentAndSysUser);
	}
	
	/**
	 * 删除工作内容
	 * @param workId
	 * @return
	 */
	@PostMapping("/delete")
	public String delete(String workId) {
		return null;
	}
	
	/**
	 * 更新工作内容
	 * @param workContent
	 * @return
	 */
	@PostMapping("/update")
	public WorkContent update(WorkContent workContent) {
		return null;
	}

}
