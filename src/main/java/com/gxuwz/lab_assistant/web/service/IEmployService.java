package com.gxuwz.lab_assistant.web.service;

import java.util.List;

import com.gxuwz.lab_assistant.web.model.entity.Employ;

public interface IEmployService {
	
	public String employ(Employ employ);
	
	public List<Employ> findAllMySelf(String userId);

}
