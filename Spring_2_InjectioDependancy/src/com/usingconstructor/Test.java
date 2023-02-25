package com.usingconstructor;

import java.io.ObjectInputStream.GetField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext apc= new ClassPathXmlApplicationContext("com/usingconstructor/NewFile.xml");
		
		Student stud = apc.getBean("s", Student.class);
		
		System.out.println(stud.getsId());
		System.out.println(stud.getsName());
		System.out.println(stud.getsAdd());
		
		
		
	}

}
