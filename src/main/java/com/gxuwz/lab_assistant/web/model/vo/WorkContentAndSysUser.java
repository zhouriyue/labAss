package com.gxuwz.lab_assistant.web.model.vo;

public class WorkContentAndSysUser {
	
	private String workId;
	private String weekNumber;
	private String workDate;
	private String week;
	private String content;
	private String systemDate;
	private String userId;
	private String stuId;
	private String stuName;
	private String userPwd;
	private String majorId;
	private String instId;
	private String classId;
	private String grade;
	private String phone;
	private String email;
	private String perPic;
	public WorkContentAndSysUser() {
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getMajorId() {
		return majorId;
	}
	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}
	public String getInstId() {
		return instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPerPic() {
		return perPic;
	}
	public void setPerPic(String perPic) {
		this.perPic = perPic;
	}
	@Override
	public String toString() {
		return "WorkContentAndSysUser [workId=" + workId + ", weekNumber=" + weekNumber + ", workDate=" + workDate
				+ ", week=" + week + ", content=" + content + ", systemDate=" + systemDate + ", userId=" + userId
				+ ", stuId=" + stuId + ", stuName=" + stuName + ", userPwd=" + userPwd + ", majorId=" + majorId
				+ ", instId=" + instId + ", classId=" + classId + ", grade=" + grade + ", phone=" + phone + ", email="
				+ email + ", perPic=" + perPic + "]";
	}
	
}
