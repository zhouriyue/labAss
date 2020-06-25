package com.gxuwz.lab_assistant.web.service;

import java.util.List;

import com.gxuwz.lab_assistant.domain.SysUser;

public interface ISysUserService {
	
	public SysUser checkSysUser(SysUser sysUser);
	
	public List<SysUser> findAllSysUser();
	
	public String addSysUser(SysUser sysUser);
	
	public SysUser wxCheckSysUser(String userId,String userPwd);
	
	public String updateRepAppIdAndUserId(String repAppId,String userId);

}
