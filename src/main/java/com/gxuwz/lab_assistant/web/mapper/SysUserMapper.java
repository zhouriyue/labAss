package com.gxuwz.lab_assistant.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gxuwz.lab_assistant.domain.Menu;
import com.gxuwz.lab_assistant.domain.Role;
import com.gxuwz.lab_assistant.domain.SysUser;

@Repository
public interface SysUserMapper {
	
	SysUser findByIdSysUser(String userId);
	
	List<Menu> findSysUserMenu(String userId);
	
	List<Role> findSysUserRole(String userId);
	
	List<SysUser> findAll();
	
	void addSysUser(SysUser sysUser);
	
	void addSysUserRole(String userId,String roleId);
	
	void updateRepAppIdAndUserId(String repAppId,String userId);
}
