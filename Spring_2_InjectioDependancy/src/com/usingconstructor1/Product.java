package com.usingconstructor1;

public class Product {
	
	private int pId;
	
	private String pName;
	
	private double pCost;
	
	private Company company;

	public Product(int pId, String pName, double pCost, Company company) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCost = pCost;
		this.company = company;
	}

	public int getpId() {
		return pId;
	}

	public String getpName() {
		return pName;
	}

	public double getpCost() {
		return pCost;
	}

	public Company getCompany() {
		return company;
	}
	
	

}
