package com.gxuwz.lab_assistant.web.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.gxuwz.lab_assistant.domain.SysUser;
/**
 * 工作内容
 * @author Administrator
 *
 */
@Entity(name="work_content")
public class WorkContent {
	
	@Id
	@Column(name="work_id")
	private String workId;
	@Column(name="week_number")
	private String weekNumber;
	@Column(name="work_date")
	private String workDate;
	private String week;
	private String content;
	@Column(name="system_date")
	private String systemDate;
	@ManyToOne
	@JoinColumn(name = "user_id",referencedColumnName = "user_id")
	private SysUser sysUser;
	public WorkContent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getWorkId() {
		return workId;
	}
	public void setWorkId(String workId) {
		this.workId = workId;
	}
	public String getWeekNumber() {
		return weekNumber;
	}
	public void setWeekNumber(String weekNumber) {
		this.weekNumber = weekNumber;
	}
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSystemDate() {
		return systemDate;
	}
	public void setSystemDate(String systemDate) {
		this.systemDate = systemDate;
	}
	public SysUser getSysUser() {
		return sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	
}
