package com.gxuwz.lab_assistant.web.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.gxuwz.lab_assistant.domain.SysUser;

/**
 * 维修申请
 * @author Administrator
 *
 */
@Entity(name="repair_apply")
public class RepairApply{
	
	@Id
	@Column(name="rep_app_id")
	private String repAppId;
	@Column(name="device_id")
	private String deviceId;
	@Column(name="device_name")
	private String deviceName;
	@Column(name="model_number")
	private String modelNumber;
	@Column(name="hitch_depict")
	private String hitchDepict;
	@Column(name="repair_date")
	private String repairDate;
	@Column(name="repair_name")
	private String repairName;
	@ManyToOne
	@JoinColumn(name = "user_id",referencedColumnName = "user_id")
	private SysUser user;
	public RepairApply() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRepAppId() {
		return repAppId;
	}
	public void setRepAppId(String repAppId) {
		this.repAppId = repAppId;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getHitchDepict() {
		return hitchDepict;
	}
	public void setHitchDepict(String hitchDepict) {
		this.hitchDepict = hitchDepict;
	}
	public String getRepairDate() {
		return repairDate;
	}
	public void setRepairDate(String repairDate) {
		this.repairDate = repairDate;
	}
	public String getRepairName() {
		return repairName;
	}
	public void setRepairName(String repairName) {
		this.repairName = repairName;
	}
	public SysUser getUser() {
		return user;
	}
	public void setUser(SysUser user) {
		this.user = user;
	}
	
}
