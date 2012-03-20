package com.joragupra.spring.controllers;

import com.joragupra.spring.services.BusinessService;

public class ViewController {
	private BusinessService businessService;

	public ViewController() {
		System.out.println("Creating controller instance...");
	}

	public BusinessService getBusinessService() {
		return businessService;
	}

	public void setBusinessService(BusinessService businessService) {
		System.out.println("Injecting business service dependency...");
		this.businessService = businessService;
	}
}
