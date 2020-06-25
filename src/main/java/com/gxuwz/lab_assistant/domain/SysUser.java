package com.gxuwz.lab_assistant.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

/**
 * 系统用户类
 * @author 周日月
 *
 */
@Entity(name = "sys_user")
public class SysUser{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="user_id")
	private String userId;
	@Column(name = "stu_id")
	private String stuId;
	@Column(name = "stu_name")
	private String stuName;
	@Column(name = "user_pwd")
	private String userPwd;
	@Column(name = "major_id")
	private String majorId;
	@Column(name = "inst_id")
	private String instId;
	@Column(name = "class_id")
	private String classId;
	@Column(name = "grade")
	private String grade;
	@Column(name = "phone")
	private String phone;
	@Column(name = "email")
	private String email;
	@Column(name = "per_pic")
	private String perPic;
	@Transient
	private List<Menu> menus;
	@Transient
	private List<Role> roles;
	public SysUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStuId() {
		return stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public String getMajorId() {
		return majorId;
	}
	public String getInstId() {
		return instId;
	}
	public String getClassId() {
		return classId;
	}
	public String getGrade() {
		return grade;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public String getPerPic() {
		return perPic;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPerPic(String perPic) {
		this.perPic = perPic;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "SysUser [userId=" + userId + ", stuId=" + stuId + ", stuName=" + stuName + ", userPwd=" + userPwd
				+ ", majorId=" + majorId + ", instId=" + instId + ", classId=" + classId + ", grade=" + grade
				+ ", phone=" + phone + ", email=" + email + ", perPic=" + perPic + ", menus=" + menus + ", roles="
				+ roles + "]";
	}

}
