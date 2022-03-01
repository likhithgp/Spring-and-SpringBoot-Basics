package com.example.sprinbootExample;

import org.springframework.stereotype.Component;

@Component
public class Company {

	private int cId;
	private String cName;
	private String cSector;
	
	public Company() {
		super();
		System.out.println("Company Object created");
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcSector() {
		return cSector;
	}
	public void setcSector(String cSector) {
		this.cSector = cSector;
	}
	
	public void name() {
		System.out.println("---------------Working----------");
	}
	
}
