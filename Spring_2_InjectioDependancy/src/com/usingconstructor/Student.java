package com.usingconstructor;

public class Student {
	
	private int sId;
	
	private String sName;
	
	private String sAdd;
	
	public Student (int sId, String sName, String sAdd) {
		this.sId = sId;
		
		this.sName = sName;
		
		this.sAdd = sAdd;
	}
	public int getsId () {
		return sId;
	}
	public String getsName() {
		return sName;
	}
	public String getsAdd() {
		return sAdd;
	}

}
