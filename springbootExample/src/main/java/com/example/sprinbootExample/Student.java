package com.example.sprinbootExample;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

	private int sID;
	private String sName;
	public int getsID() {
		return sID;
	}
	public void setsID(int sID) {
		this.sID = sID;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("Student Object Created");
	}
    
	public void name() {
		System.out.println("Student working---------------------");
	}
}
