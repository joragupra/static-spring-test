package com.joragupra.spring.services;

public class ConcreteFactory extends AbstractFactory {
	
	ConcreteFactory(){
		System.out.println("Creating concrete factory instance...");
	}
	
	@Override
	public void createObject() {
		System.out.println("Creating object with concrete factory...");
	}

}
