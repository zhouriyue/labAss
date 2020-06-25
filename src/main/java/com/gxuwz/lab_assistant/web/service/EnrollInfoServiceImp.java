package com.gxuwz.lab_assistant.web.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gxuwz.lab_assistant.web.mapper.EnrollInfoMapper;
import com.gxuwz.lab_assistant.web.mapper.RecruitmentPlanMapper;
import com.gxuwz.lab_assistant.web.model.entity.EnrollInfo;
import com.gxuwz.lab_assistant.web.model.entity.RepairApply;
import com.gxuwz.lab_assistant.web.model.vo.RecPlanAndSysUserForEnrollInfo;
import com.gxuwz.lab_assistant.web.util.DateFormat;

@Service("enrollInfoService")
public class EnrollInfoServiceImp implements IEnrollInfoService{

	@Autowired
	EnrollInfoMapper enrollInfoMapper;
	
	@Autowired
	RecruitmentPlanMapper recruitmentPlanMapper;
	
	static BlockingQueue<EnrollInfo> queue;
	static ThreadPoolExecutor pool = new ThreadPoolExecutor(
			1, 2, 5, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>());
	
	
	@Override
	public String enroll(RecPlanAndSysUserForEnrollInfo recPlanAndSysUserForEnrollInfo) {
		// TODO Auto-generated method stub
		try {
			recPlanAndSysUserForEnrollInfo.setEnInfoId(UUID.randomUUID().toString());
			recPlanAndSysUserForEnrollInfo.setEnInfoTime(DateFormat.formatCurrentDate());
			enrollInfoMapper.enroll(recPlanAndSysUserForEnrollInfo);
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
	}

	@Override
	public List<EnrollInfo> findAllMySelfEnInfo(EnrollInfo enrollInfo) {
		// TODO Auto-generated method stub
		return enrollInfoMapper.findAllMySelfEnInfo(enrollInfo);
	}

	@Override
	public String addEnrollInfo(EnrollInfo enInfoId) {
		// TODO Auto-generated method stub
		try {
			enrollInfoMapper.addEnrollInfo(enInfoId);
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
	}

	@Override
	public String deleteEnrollInfo(String enInfoId) {
		// TODO Auto-generated method stub
		try {
			enrollInfoMapper.deleteEnrollInfo(enInfoId);
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
	}

	@Override
	public String updateEnrollInfo(RepairApply repairApply) {
		// TODO Auto-generated method stub
		try {
			enrollInfoMapper.updateEnrollInfo(repairApply);
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
	}

}
