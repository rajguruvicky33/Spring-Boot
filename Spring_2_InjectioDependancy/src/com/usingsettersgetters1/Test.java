package com.usingsettersgetters1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext apc= new ClassPathXmlApplicationContext("com/usingsettersgetters1/NewFile.xml");
		
		Product product = apc.getBean("p" , Product.class);
		System.out.println("--------------");
		System.out.println(product.getpId());
		System.out.println(product.getpName());
		System.out.println(product.getpCost());
	
	
	
	}

}
