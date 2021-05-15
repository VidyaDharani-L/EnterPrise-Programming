package com.klu;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentClient {
	public static void main(String args[]) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext1.xml");
		student stu = (student)context.getBean("stu");
		System.out.println(stu);
	}

}
