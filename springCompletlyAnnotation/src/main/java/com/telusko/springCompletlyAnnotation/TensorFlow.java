package com.telusko.springCompletlyAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
/*
 * if we are calling Process() using referance of MobileProcessor then 
 * Process() method of TensorFlow has higest priority and renove ambuguity
 */
@Primary
public class TensorFlow implements MobileProcessor{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("For Google Best Processor");
	}

}
