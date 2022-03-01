package com.telusko.springDemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Car implements Vechical {

	/*
	 * @Autowired is used to inject dependency to car class
	 */
	@Autowired
	private Tyre tyre;
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Car class");
		
	}
    public void checkTyre() {
    	System.out.println("Tyre Object value in Car "+tyre.getBrand());
    }
}
