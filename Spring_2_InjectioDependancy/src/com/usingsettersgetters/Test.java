package com.usingsettersgetters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/usingsettersgetters/NewFile.xml");
		
		Employee emp = apc.getBean("e", Employee.class);
//		System.out.println(emp);
		
		System.out.println(emp.geteId());
		System.out.println(emp.geteName());
		System.out.println(emp.geteSalary());
		System.out.println(emp.getCompany().getcId());
		System.out.println(emp.getCompany().getcName());
		
		
	}

}
