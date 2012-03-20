package com.joragupra.spring.services;

public class BusinessService {

	public BusinessService() {
		System.out.println("Creating service instance...");
		AbstractFactory.setService(this);
	}

	public void serviceOp() {
		System.out.println("Doing stuff...");
	}
}
