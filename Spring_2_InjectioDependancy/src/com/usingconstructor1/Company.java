package com.usingconstructor1;

public class Company {
	
	private int cId;
	
	private String cName;

	public Company(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}

	public int getcId() {
		return cId;
	}

	public String getcName() {
		return cName;
	}
	
	

}
