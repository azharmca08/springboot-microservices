package com.project.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.limitservice.config.Configuration;
import com.project.limitservice.models.Limit;

@RestController
public class LimitServiceController {
	
	@Autowired
	private Configuration config;
	
	@GetMapping(value = "/limits")
	public Limit getMethodName() {
		return new Limit(config.getMinimum(),config.getMaximum());
	}

}
