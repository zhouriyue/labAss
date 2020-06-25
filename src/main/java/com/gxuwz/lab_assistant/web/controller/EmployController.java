package com.gxuwz.lab_assistant.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gxuwz.lab_assistant.web.model.entity.Employ;
import com.gxuwz.lab_assistant.web.service.IEmployService;

@RestController
@RequestMapping("/employ")
public class EmployController {
	
	@Autowired
	IEmployService EmployService;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	/**
	 * 导入录入档案
	 * @param employ
	 * @return
	 */
	@PostMapping("/employMess")
	public String employ(Employ employ) {
		String st = EmployService.employ(employ);
		SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("1742204618@qq.com");
        message.setTo(employ.getEmail());
        message.setSubject("实验室助理面试结果");
        message.setText("恭喜你已经被录用，现在你已经是一名实验室助理员！");
        javaMailSender.send(message);
		return st;
	}
	
	/**
	 * 获取全部学生档案
	 * @param userId
	 * @return
	 */
	@PostMapping("/findAllMySelf")
	public List<Employ> findAllMySelf(String userId) {
		System.out.println(userId);
		return EmployService.findAllMySelf(userId);
	}

}
