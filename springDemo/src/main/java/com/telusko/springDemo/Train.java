package com.telusko.springDemo;

import org.springframework.stereotype.Component;

@Component
public class Train implements Vechical {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Train Model class");
		
	}

}
