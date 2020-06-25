package com.gxuwz.lab_assistant.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gxuwz.lab_assistant.domain.SysUser;
import com.gxuwz.lab_assistant.web.mapper.SysUserMapper;

@Service
public class SysUserServiceImp implements ISysUserService{

	@Autowired
	SysUserMapper sysUserMapper;
	
	@Override
	public SysUser checkSysUser(SysUser sysUser) {
		// TODO Auto-generated method stub
		SysUser su = sysUserMapper.findByIdSysUser(sysUser.getUserId());
		if(su!=null) {
			if(su.getUserPwd()!=null&&sysUser.getUserPwd()!=null&&su.getUserPwd().equals(sysUser.getUserPwd())) {
				su.setMenus(sysUserMapper.findSysUserMenu(sysUser.getUserId()));
				su.setRoles(sysUserMapper.findSysUserRole(sysUser.getUserId()));
				return su;
			}
		}
		return null;
	}
	
	@Override
	public List<SysUser> findAllSysUser() {
		// TODO Auto-generated method stub
		return sysUserMapper.findAll();
	}
	
	@Override
	public String addSysUser(SysUser sysUser) {
		// TODO Auto-generated method stub
		try {
			sysUserMapper.addSysUser(sysUser);
			sysUserMapper.addSysUserRole(sysUser.getUserId(),"sysUser");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "success";
	}
	
	@Override
	public SysUser wxCheckSysUser(String userId, String userPwd) {
		// TODO Auto-generated method stub
		SysUser sysUser = sysUserMapper.findByIdSysUser(userId);
		if(sysUser!=null) {
			if(sysUser.getUserPwd().equals(userPwd)) {
				return sysUser;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
	
	@Override
	public String updateRepAppIdAndUserId(String repAppId, String userId) {
		// TODO Auto-generated method stub
		
		return null;
	}

}
