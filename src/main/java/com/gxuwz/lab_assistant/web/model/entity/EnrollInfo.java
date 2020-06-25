package com.gxuwz.lab_assistant.web.model.entity;

import com.gxuwz.lab_assistant.domain.SysUser;

/**
 * 报名信息
 * @author 周日月
 *
 */
public class EnrollInfo {
	
	private String enInfoId;
	private String enInfoTime;
	private String technica;
	private String labId;
	private String labName;
	private RecruitmentPlan recruitmentPlan;
	private SysUser sysUser;
	public EnrollInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEnInfoId() {
		return enInfoId;
	}
	public void setEnInfoId(String enInfoId) {
		this.enInfoId = enInfoId;
	}
	public String getEnInfoTime() {
		return enInfoTime;
	}
	public void setEnInfoTime(String enInfoTime) {
		this.enInfoTime = enInfoTime;
	}
	public String getTechnica() {
		return technica;
	}
	public void setTechnica(String technica) {
		this.technica = technica;
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
	public SysUser getSysUser() {
		return sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	public RecruitmentPlan getRecruitmentPlan() {
		return recruitmentPlan;
	}
	public void setRecruitmentPlan(RecruitmentPlan recruitmentPlan) {
		this.recruitmentPlan = recruitmentPlan;
	}
	@Override
	public String toString() {
		return "EnrollInfo [enInfoId=" + enInfoId + ", enInfoTime=" + enInfoTime + ", technica=" + technica + ", labId="
				+ labId + ", labName=" + labName + ", recruitmentPlan=" + recruitmentPlan + ", sysUser=" + sysUser
				+ "]";
	}
	
}
