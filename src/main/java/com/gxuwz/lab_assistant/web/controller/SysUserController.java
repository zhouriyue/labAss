package com.gxuwz.lab_assistant.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gxuwz.lab_assistant.domain.SysUser;
import com.gxuwz.lab_assistant.web.service.ISysUserService;

@RestController
@RequestMapping("/sysUser")
public class SysUserController {
	
	@Autowired
	ISysUserService sysUserService;
	
	@Autowired
	HttpServletRequest request;
	
	//@Autowired
	//RedisTemplate redisTemplate;
	
	//@Autowired
	//StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@RequestMapping("/test")
	public String test() {
		SimpleMailMessage message = new SimpleMailMessage();
	    message.setFrom("1742204618@qq.com");
	    message.setTo("1330312247@qq.com");
	    message.setSubject("这是标题");
	    message.setText("这是内容");
	    javaMailSender.send(message);
		/*redis例子
		 * 
		 * ValueOperations<String,String> ops1 = stringRedisTemplate.opsForValue();
		 * ops1.set("name", "三国演义"); String name = ops1.get("name");
		 * System.out.println(name); System.out.println(ops1.get("name"));
		 */
		return null;
	}
	
	/**
	 * 登录验证
	 * @param sysUser
	 * @return
	 */
	@PostMapping("/checkSysUser")
	public SysUser checkSysUser(SysUser sysUser) {
		sysUser = sysUserService.checkSysUser(sysUser);
		return sysUser;
	}
	
	/**
	 * 获取全部用户
	 * @return
	 */
	@PostMapping("/findAll")
	public List<SysUser> findAll(){
		List<SysUser> sysUserList = sysUserService.findAllSysUser();
		return sysUserList;
	}
	
	/**
	 * 上传用户头像
	 * @return
	 */
	@PostMapping("/uploadPerPic")
	public String uploadPerPic(MultipartFile file) {
		
		String realPath = request.getSession().getServletContext().getRealPath("/uploadFile");
		
		File forlder = new File(realPath);
		if(!forlder.isDirectory()) {
			forlder.mkdir();
		}
		String oldName = file.getOriginalFilename();
		String newName = UUID.randomUUID().toString() + 
				oldName.substring(oldName.lastIndexOf("."),oldName.length());
		try {
			file.transferTo(new File(forlder,newName));
			String filePath = request.getScheme() + "://"+request.getServerName()+
					":"+request.getServerPort()+"/uploadFile/"+newName;
			System.out.println(filePath);
			return filePath;
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "上传失败！";
	}
	
	/**
	 * 添加用户
	 * @param sysUser
	 * @return
	 */
	@PostMapping("/add")
	public String addSysUser(SysUser sysUser) {
		return sysUserService.addSysUser(sysUser);
	}
	
	public String updateRepAppIdAndUserId(String repAppId,String userId) {
		return sysUserService.updateRepAppIdAndUserId(repAppId, userId);
	}
	
	
	/**
	 * 微信登录
	 * @param userId
	 * @param userPwd
	 * @return
	 */
	@PostMapping("/wxCheckSysUser")
	public SysUser wxCheckSysUser(String userId,String userPwd) {
		return sysUserService.wxCheckSysUser(userId, userPwd);
	}

}
