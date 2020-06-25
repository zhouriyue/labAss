package com.gxuwz.lab_assistant.util.comcurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

import org.springframework.boot.autoconfigure.AutoConfigurationPackage;

import com.gxuwz.lab_assistant.web.model.vo.RecPlanAndSysUserForEnrollInfo;

@AutoConfigurationPackage
public class EnrollQueue<T> {
	
	BlockingQueue<RecPlanAndSysUserForEnrollInfo> queue;
	private int lenght;
	private Integer usable;
	
	public EnrollQueue() {
		
	}
	
	public EnrollQueue(Integer size) {
		this.usable = size;
		this.lenght = 0;
		queue = new LinkedBlockingDeque<RecPlanAndSysUserForEnrollInfo>(size);
	}
	
	synchronized public void put(RecPlanAndSysUserForEnrollInfo enrollInfo) throws InterruptedException {
		queue.put(enrollInfo);
		lenght += 1;
		usable -= 1;
	}
	
	synchronized public RecPlanAndSysUserForEnrollInfo take() throws InterruptedException {
		RecPlanAndSysUserForEnrollInfo enrollInfo = queue.take();
		lenght -= 1;
		return enrollInfo;
	}

	public Integer getUsable() {
		return usable;
	}

	public void setUsable(Integer usable) {
		this.usable = usable;
	}

	public BlockingQueue<RecPlanAndSysUserForEnrollInfo> getQueue() {
		return queue;
	}

	public void setQueue(BlockingQueue<RecPlanAndSysUserForEnrollInfo> queue) {
		this.queue = queue;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

}
