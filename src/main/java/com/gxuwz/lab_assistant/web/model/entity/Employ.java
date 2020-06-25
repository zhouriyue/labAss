package com.gxuwz.lab_assistant.web.model.entity;

/**
 * 录用档案
 * @author Administrator
 *
 */
public class Employ {
	
	private String recPlanId;
	private String recPlanName;
	private String userId;
	private String postName;
	private String labId;
	private String labName;
	private String technica;
	private String stuId;
	private String stuName;
	private String majorId;
	private String instId;
	private String classId;
	private String grade;
	private String phone;
	private String email;
	private String perPic;
	public Employ() {
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
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
	public String getTechnica() {
		return technica;
	}
	public void setTechnica(String technica) {
		this.technica = technica;
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
		return "Employ [recPlanId=" + recPlanId + ", recPlanName=" + recPlanName + ", userId=" + userId + ", postName="
				+ postName + ", labId=" + labId + ", labName=" + labName + ", technica=" + technica + ", stuId=" + stuId
				+ ", stuName=" + stuName + ", majorId=" + majorId + ", instId=" + instId + ", classId=" + classId
				+ ", grade=" + grade + ", phone=" + phone + ", email=" + email + ", perPic=" + perPic + "]";
	}

}
