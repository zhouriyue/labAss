package com.gxuwz.lab_assistant.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 角色类
 * @author 周日月
 *
 */
@Entity(name="t_role")
public class Role {
	
	@Id
	@Column(name="role_id")
	private String roleId;
	@Column(name="role_name")
	private String roleName;
	private String fullname;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(String roleId, String roleName, String fullname) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.fullname = fullname;
	}
	public String getRoleId() {
		return roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public String getFullname() {
		return fullname;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

}
