package com.gxuwz.lab_assistant.web.model.vo;

import java.io.Serializable;

public class RecPlanIdAndSurplusNumber implements Serializable{
	
	private String recPlanId;
	private Integer surplusNumber;
	
	public RecPlanIdAndSurplusNumber() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRecPlanId() {
		return recPlanId;
	}
	public void setRecPlanId(String recPlanId) {
		this.recPlanId = recPlanId;
	}
	public Integer getSurplusNumber() {
		return surplusNumber;
	}
	public void setSurplusNumber(Integer surplusNumber) {
		this.surplusNumber = surplusNumber;
	}

}
