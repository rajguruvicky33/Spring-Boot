package com.usingconstructor1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/usingconstructor1/NewFile.xml");
		
		Product prod = apc.getBean("p" ,Product.class);
		
	//	System.out.println(prod);
		
		System.out.println(prod.getpId());
		System.out.println(prod.getpName());
		System.out.println(prod.getpCost());
		System.out.println(prod.getCompany().getcId());
		System.out.println(prod.getCompany().getcName());
	}

}
