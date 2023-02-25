package com.usingsettersgetters1;

public class Product {
	private int pId;
	
	private String pName;
	
	private double pCost;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getpCost() {
		return pCost;
	}

	public void setpCost(double pCost) {
		this.pCost = pCost;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pCost=" + pCost + "]";
	}
	
	

}
