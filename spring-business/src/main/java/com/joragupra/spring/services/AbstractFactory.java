package com.joragupra.spring.services;

public abstract class AbstractFactory {
	private static BusinessService service;
	
	public static AbstractFactory createConcreteFactory(){
		AbstractFactory.service.serviceOp();
		return new ConcreteFactory();
	}
	
	public abstract void createObject();
	
	public static void setService(BusinessService service){
		System.out.println("Setting up service instance in abstract factory...");
		AbstractFactory.service = service;
	}
}
