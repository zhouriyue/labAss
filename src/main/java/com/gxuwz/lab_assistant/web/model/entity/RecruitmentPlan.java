package com.gxuwz.lab_assistant.web.model.entity;

import java.io.Serializable;
import java.util.List;

import com.gxuwz.lab_assistant.domain.SysUser;

/**
 * 招聘计划
 * @author 周日月
 *
 */
public class RecruitmentPlan implements Serializable{
	
	private String recPlanId;
	private String recPlanName;
	private String postName;
	private Integer recNumber;
	private String department;
	private String labTechName;
	private String labId;
	private String labName;
	private Integer surplusNumber;
	private String audis;
	private SysUser sysUser;
	private List<EnrollInfo> enrollInfos;
	
	public RecruitmentPlan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRecPlanId() {
		return recPlanId;
	}
	public void setRecPlanId(String recPlanId) {
		this.recPlanId = recPlanId;
	}
	public String getRecPlanName() {
		return recPlanName;
	}
	public void setRecPlanName(String recPlanName) {
		this.recPlanName = recPlanName;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getLabTechName() {
		return labTechName;
	}
	public void setLabTechName(String labTechName) {
		this.labTechName = labTechName;
	}
	public Integer getRecNumber() {
		return recNumber;
	}
	public void setRecNumber(Integer recNumber) {
		this.recNumber = recNumber;
	}
	public Integer getSurplusNumber() {
		return surplusNumber;
	}
	public void setSurplusNumber(Integer surplusNumber) {
		this.surplusNumber = surplusNumber;
	}
	public SysUser getSysUser() {
		return sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	public String getAudis() {
		return audis;
	}
	public void setAudis(String audis) {
		this.audis = audis;
	}
	public String getLabId() {
		return labId;
	}
	public void setLabId(String labId) {
		this.labId = labId;
	}
	public String getLabName() {
		return labName;
	}
	public void setLabName(String labName) {
		this.labName = labName;
	}
	public List<EnrollInfo> getEnrollInfos() {
		return enrollInfos;
	}
	public void setEnrollInfos(List<EnrollInfo> enrollInfos) {
		this.enrollInfos = enrollInfos;
	}
	@Override
	public String toString() {
		return "RecruitmentPlan [recPlanId=" + recPlanId + ", recPlanName=" + recPlanName + ", postName=" + postName
				+ ", recNumber=" + recNumber + ", department=" + department + ", labTechName=" + labTechName
				+ ", labId=" + labId + ", labName=" + labName + ", surplusNumber=" + surplusNumber + ", audis=" + audis
				+ ", sysUser=" + sysUser + ", enrollInfos=" + enrollInfos + "]";
	}
	
}
